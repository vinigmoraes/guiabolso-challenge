```
   ______   __  __    ____    ___     ____    ____     __    _____   ____           ______    __  __    ___     __     __     ______    _   __   ______    ______
    / ____/  / / / /   /  _/   /   |   / __ )  / __ \   / /   / ___/  / __ \         / ____/   / / / /   /   |   / /    / /    / ____/   / | / /  / ____/   / ____/
   / / __   / / / /    / /    / /| |  / __  | / / / /  / /    \__ \  / / / /        / /       / /_/ /   / /| |  / /    / /    / __/     /  |/ /  / / __    / __/   
  / /_/ /  / /_/ /   _/ /    / ___ | / /_/ / / /_/ /  / /___ ___/ / / /_/ /        / /___    / __  /   / ___ | / /___ / /___ / /___    / /|  /  / /_/ /   / /___   
  \____/   \____/   /___/   /_/  |_|/_____/  \____/  /_____//____/  \____/         \____/   /_/ /_/   /_/  |_|/_____//_____//_____/   /_/ |_/   \____/   /_____/   
                                                                                                                                                                   
```

## Demo

https://guiabolso-challenge.herokuapp.com/

[![CircleCI](https://circleci.com/gh/vinigmoraes/guiabolso-challenge.svg?style=svg)](https://circleci.com/gh/vinigmoraes/guiabolso-challenge)

Technical challenge for GuiaBolso selective process

## Requirements

For building and running the application you need:

- [Gradle](https://gradle.org/)
- [Docker](https://www.docker.com/)

## Documentation
[Postman](https://documenter.getpostman.com/view/4456023/RznHGby8)

## Executing requests

[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/b5f21eb0920d15ad41f6)

## Running

First, clone the project:

```shell
git clone https://github.com/vinigmoraes/guiabolso-challenge
cd guiabolso-challenge
```

#### Running with docker

```shell
./gradlew build && docker-compose up --build
```

## Continuous Integration

Continuous Integration is configured on CircleCI. Checkout the [continuous integration here](https://circleci.com/gh/vinigmoraes/guiabolso-challenge)

##  Testing

```shell
./gradlew test
```

## Built With

- [Kotlin](https://kotlinlang.org/) - Programming language
- [IntelliJ](https://www.jetbrains.com/idea/) - IDE
- [Spring](https://spring.io/) - Java Framework
- [Gradle](https://gradle.org/) - Dependency Management
- [Docker](https://www.docker.com/) - Containerization Platform
