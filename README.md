# japi-errors

![](https://travis-ci.org/cdimascio/japi-errors.svg?branch=master) ![](https://img.shields.io/badge/license-Apache%202-blue.svg)

Customizable errors for RESTful and HTTP services. 

<p align="center">
<img src="https://raw.githubusercontent.com/cdimascio/japi-errors/master/assets/japi-errors.png" width="600">
</p>

All errors are Jackson ready and can be serialized as *JSON*, *XML*, and *YAML*.

Out of the box, **japi-errors** provides [two error formats](#configure) or enables you to [provide](#customize) your own. 

## Install

Gradle

```groovy
compile 'io.github.cdimascio:japi-errors:1.1.0'
```

Maven

```xml
<dependency>
  <groupId>io.github.cdimascio</groupId>
  <artifactId>japi-errors</artifactId>
  <version>1.1.0</version>
</dependency>
```

## Usage

Import

```java
import static io.github.cdimascio.japierrors.ApiError.badRequest;
```

Throw

```java
throw notFound();
throw badRequest("id required.");
throw internalServerError(exception);
```

Assign

```shell
AbstractApiError error = unauthorized();
```

## Configure

japi-errors supports two error formats "out of the box". They are enabled as follows:

```
ApiError.creator(ApiErrorCreators.BASIC); // The default
ApiError.creator(ApiErrorCreators.WCP);
```

### Basic

```json
{
  "code": 400,
  "error": "'id' required."
}
```

### WCP

```json
{
  "trace": "1f96a430-dfd8-11e8-9f32-f2801f1b9fd1",
  "errors": [{
    "code": "bad_request",
    "message": "'id' required."
  }]
}
```

## Customize

**japi-errors** enables developers to craft custom error objects. To do so, implement the `ApiErrorCreator` interface, then pass an instance of your creator to `ApiError.creator(myApiErrorCreator)`

To see a working example, check out this [source code](https://github.com/cdimascio/japi-errors/blob/master/src/main/java/io/github/cdimascio/apierrors/basic/ApiErrorBasic.java)

Example:

```java
// Create an api error creator
public class MyApiErrorCreator implements IApiErrorCreator {
    @Override
    public ApiError create(HttpStatus status, String message) {
        return new MyApiError(message);
    }

    @Override
    public ApiError create(HttpStatus status, Throwable t) {
        return new MyApiError(t.getMessage());
    }
}
```

```java
// Create a custom api error object
public class MyApiError extends ApiError {
  @JsonProperty
  private String message;
  
  MyApiError(String message) {
    this.message = message;
  }
  
  public getMessage() {
    return message
  }
}
```

## License
[Apache 2](LICENSE)
