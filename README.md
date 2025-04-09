# ProductApp

A modern Android application that displays a catalog of products using clean architecture principles and modern Android development practices.

## Project Overview

ProductApp is a demonstration app that showcases a catalog of products with detailed information. The application follows clean architecture with a clear separation of concerns across data, domain, and presentation layers.

## Architecture

The project follows Clean Architecture principles with three main layers:

### Data Layer
- Manages data operations
- Implements repositories
- Provides data from remote sources and local storage

### Domain Layer
- Contains business logic
- Defines models and interfaces
- Implements use cases for business operations

### Presentation Layer
- Handles UI components and user interactions
- Includes screens for product listing and detailed product views
- Implements navigation between app components

## Tech Stack

- **Kotlin** - Primary programming language
- **Jetpack Compose** - Modern declarative UI toolkit
- **MVVM** - Architectural pattern for the presentation layer
- **Compose Navigation** - For handling navigation between composables
- **ViewModel** - For managing UI-related data in a lifecycle-conscious way


## Project Structure

```
├── manifests
│   └── AndroidManifest.xml
├── kotlin+java
│   └── com.example.productcatlogsaga
│       ├── data
│       │   ├── model
│       │   ├── remote
│       │   └── repository
│       ├── domain
│       │   ├── model
│       │   ├── repository
│       │   └── usecase
│       ├── presentation
│       │   ├── navigation
│       │   ├── productdetail
│       │   └── productlist
│       └── ui.theme
│           ├── Color.kt
│           ├── Theme.kt
│           └── Type.kt
│       └── MainActivity
├── androidTest
│   └── com.example.productcatlogsaga
│       └── ExampleInstrumentedTest
├── test
│   └── com.example.productcatlogsaga
│       └── ExampleUnitTest
└── res
```

## Getting Started

### Prerequisites
- Android Studio Arctic Fox (2021.3.1) or higher
- Android SDK 21 or higher
- Gradle 7.0 or higher

### Installation
1. Clone the repository:
   ```
   git clone https://github.com/example/ProductApp.git
   ```
2. Open the project in Android Studio
3. Sync the Gradle files
4. Run the application on an emulator or physical device

## Features

- Browse a catalog of products
- View detailed information about each product
- Consistent UI theme across the application

## Screenshots
![image alt](https://github.com/barmansagarika/ProductApp/blob/424e2ee3684187ff8cf0124bb9f5fbf3ab79351d/Screenshot_20250410_024949.jpg)

![image alt](https://github.com/barmansagarika/ProductApp/blob/424e2ee3684187ff8cf0124bb9f5fbf3ab79351d/Screenshot_20250410_024956.jpg)
