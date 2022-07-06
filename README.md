## overwrite from environment variable

```shell
# 11
$ java -version                                                             
$ export SAMPLE_SFTP_NAME=example.com
$ ./mvnw clean package
$ java -jar target/spring-env-playground-0.0.1-SNAPSHOT.jar | grep sftp-name
```
