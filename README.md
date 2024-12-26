# AutoFramework_2
## Table of Contents
1. [Introduction](#introduction)
2. [Project Overview](#project-overview)
    - [Project Name](#project-name)
    - [Project Description](#project-description)
    - [Project Design](#project-design)
3. [Project Structure](#project-structure)
4. [Core Features](#core-features)
    - [Page Object Model (POM)](#page-object-model-pom)
    - [Data-Driven Testing](#data-driven-testing)
    - [Fluent Design](#fluent-design)
5. [Tools and Technologies](#tools-and-technologies)
6. [Release Notes](#release-notes)
    - [Version 1.0](#version-10)
7. [Contributing](#contributing)

---
## Project Name:
### OrangeHRM Website
---
## Project Description:
(OrangeHRM Website) is an highly modular, and scalable test automation framework specifically engineered for comprehensive end-to-end web application testing. Developed using Selenium WebDriver.
it offers a robust foundation for creating clean, maintainable, and reusable automated test cases.
Its modular design ensures flexibility, enabling seamless integration with various tools and technologies, while maintaining high standards of performance, reliability, and test coverage.
---
# Release Notes
## Version 1.0
This marks the first release of the AutoFramework-2 project.
I am committed to continually enhancing and evolving this framework to ensure it remains updated, robust, and professional.
With each iteration, the project will integrate modern features, improved functionality, and industry best practices to meet the dynamic needs of test automation.

Future updates will focus on:
- Adding advanced automation features.
- Enhancing performance and efficiency.
- Ensuring compatibility with emerging tools and technologies.
- Maintaining alignment with industry standards to deliver a consistently professional and dependable solution.

---
### Project Design:
- Page Object Model (POM)

---

## Project Structure
```
AutoFramework/
├── src/main/java/engine/                # Core framework components (actions, constants, logger,BrowserDriverFactory)
├── src/main/java/pages/                 # Page Object Model (POM) classes
├── src/main/resources/properties/       # Configuration files
├── src/test/java/tests/                 # Test cases
├── src/test/resources/                  # Test data and resources
├── pom.xml                              # Maven configuration
└── README.md                            # Project documentation
```
---

## Tools and Technologies
- **Java**: Programming language
- **Selenium WebDriver**: For browser automation
- **IntelliJ IDEA**: A powerful IDE for efficient Java development with advanced features and intelligent code assistance.
- **Maven Dependencies**: For dependency management
    - **TestNG**: For test execution and reporting.
    - **WebDriverManager**: Automates browser driver management for Selenium.
    - **Log4j**: A flexible logging framework for debugging and monitoring.
        - **log4j-core**: Core module for logging implementation.
        - **log4j-api**: Provides logging functionality API.
    - **SLF4J**: A logging facade for consistent logging across frameworks.---

---

## Contributing
Contributions are welcome!
We welcome contributions from QA Automation Testing Engineers! To contribute:

1. Fork the repository and clone it to your local machine.
2. Create a new branch for your test enhancements or fixes (`git checkout -b test-enhancement-name`).
3. Write clear, maintainable test scripts and ensure thorough test coverage.
4. Run all tests and confirm they pass successfully.
5. Commit your changes with meaningful messages (`git commit -m 'Add new test or fix'`).
6. Push your branch to your fork (`git push origin test-enhancement-name`).
7. Open a pull request, including a description of your improvements or fixes.

We look forward to your contributions and appreciate your attention to quality!

---
