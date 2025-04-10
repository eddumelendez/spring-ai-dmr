# Spring AI with Docker Model Runner

## Prerequisites

* Docker Desktop 4.40.0 or later
* Enable Docker Model Runner, `docker desktop enable model-runner`
* Pull model, `docker model pull ai/gemma3:4B-F16`
* Java 21 or later

## Run the Application

```bash
./mvnw spring-boot:test-run
```

```bash
http :8080/chat message=="tell me a joke"
```

```bash
http :8080/stocks message=="What's AAPL and NVDA stock price?"
```
