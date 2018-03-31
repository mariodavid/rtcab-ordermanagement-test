# rtcab-ordermanagement-test

This project contains automated tests for [rtcab-ordermanagement](https://github.com/mariodavid/rtcab-ordermanagement).

It uses the [masquerade](https://github.com/cuba-platform/masquerade) UI Testing library for CUBA applications.

### run the tests

In order to execute the tests, the application has to be up and running. 
This can be achieved via the following gradle command in the [rtcab-ordermanagement](https://github.com/mariodavid/rtcab-ordermanagement) application:

```
./gradlew setupTomcat deploy createDb start
```

In this project the following gradle task will execute the tests:

```
./gradlew check
```

