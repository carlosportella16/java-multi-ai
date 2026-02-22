# MultiAi

Example project demonstrating integration with multiple AI providers
using **Spring AI** and **Java 21**.

## Description

MultiAi is a Spring Boot application that demonstrates how to call
different artificial intelligence services through API keys, using the
Spring AI framework to abstract integration complexities.

## Supported AI Providers

-   **OpenAI** -- Integration with GPT via API key\
-   **Ollama** -- Local models (llama3.2:1b)\
-   **Docker AI** -- Containerized models (Gemma3)\
-   **AWS Bedrock** -- Claude Sonnet 4 via AWS credentials

## Technologies

-   Java 21
-   Spring Boot
-   Spring AI
-   Maven
-   Docker AI models (optional)

## Configuration

### Environment Variables

Configure the following variables before running:

``` bash
export OPENAI_API_KEY=your_openai_key
export BEDROCK_ACCESS_KEY=your_aws_access_key
export BEDROCK_SECRET_KEY=your_aws_secret_key
```

### File: application.properties

Provider configurations are located in:

`src/main/resources/application.properties`

Default ports and settings:

- **Ollama**: port `11434`
- **Docker AI**: port `12434`
- **AWS Bedrock**: region `us-east-1`

## How to Use

### Build

mvn clean install

### Run

mvn spring-boot:run

## Structure

    src/main/
    ├── java/           # Source code
    └── resources/
        └── application.properties  # Configuration
