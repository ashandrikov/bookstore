# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build & Run Commands

```bash
./gradlew build          # Compile and package
./gradlew bootRun        # Run the application (http://localhost:8080)
./gradlew test           # Run tests
./gradlew clean build    # Clean rebuild
```

On Windows, use `gradlew.bat` instead of `./gradlew`.

## Tech Stack

- **Language:** Kotlin 1.9.22
- **Framework:** Spring Boot 3.2.3
- **Build:** Gradle 8.5 (Kotlin DSL — `build.gradle.kts`)
- **Java:** 17

## Project Structure

```
src/main/kotlin/com/bookstore/
├── BookstoreApplication.kt     # Spring Boot entry point (@SpringBootApplication)
└── controller/                 # REST controllers
```

REST controllers use `@RestController`. The base API prefix is `/api` (see `TestController`).

## Configuration

- Server port: `8080` (set in `src/main/resources/application.properties`)
- No database configured yet — application is currently stateless

## Current State

This is an early-stage project with a single test endpoint (`POST /api/test`). No persistence layer or tests exist yet.
