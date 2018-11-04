# japi-errors

Customizable errors for RESTful and HTTP services. 

<p align="center">
<img src="https://raw.githubusercontent.com/cdimascio/japi-errors/master/assets/japi-errors.png" width="400">
</p>

All errors are Jackson ready and can be serialized as JSON, XML, and YAML.

japi-errors provides two error formats out of the box and also enables you to customize your own. 

## Install

Gradle

```groovy
compile 'io.github.cdimascio:japi-errors:1.0.0'
```

Maven

```xml
<dependency>
  <groupId>io.github.cdimascio</groupId>
  <artifactId>japi-errors</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

## Usage

Import

```java
import static io.github.cdimascio.apierrors.ApiError.badRequest;
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
    "code": "bad_request".
    "message": "'id' required."
  }]
}
```

## Customize

japi-errors enables developer to craft their own error format. To do so implement the `ApiErrorCreator` interface, then pass an instance of your creator to `ApiError.creator(myApiErrorCreator)`

Example:

```java
public class MyApiErrorCreator implements IApiErrorCreator {
    @Override
    public AbstractApiError create(HttpStatus status, String message) {
        return new ApiErrorBasic(status.getCode(), message);
    }

    @Override
    public AbstractApiError create(HttpStatus status, Throwable t) {
        return new ApiErrorBasic(status.getCode(), t.getMessage());
    }
}
```

## License
[Apache 2](LICENSE)
