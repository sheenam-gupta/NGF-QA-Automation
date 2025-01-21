# NGF Automation Test Suite

This repository contains the NGF Automation Test Suite developed using **Selenium** and **Cucumber**. The suite is designed to test the functionalities of the NGF platform effectively and efficiently.

## Features
- **Framework**: Built with Selenium for UI testing and Cucumber for Behavior-Driven Development (BDD).
- **Language**: Written in Java.
- **Test Reports**: Integrated with Extent Reports for detailed test results.
- **Cross-Browser Testing**: Supports testing on multiple browsers like Chrome, Firefox, and Edge.
- **Data-Driven Testing**: Supports parameterization for multiple test scenarios.
- **Scalability**: Easily extendable to add more test cases.

---

## Prerequisites

### Tools and Dependencies
1. **Java Development Kit (JDK)** 8 or higher
2. **Maven** for dependency management
3. **Selenium WebDriver**
4. **Cucumber**
5. **JUnit** or **TestNG**
6. A supported browser (Chrome, Firefox, etc.)

### Browser Drivers
Ensure you have the appropriate browser driver executable (e.g., ChromeDriver) downloaded and added to your system PATH.

---

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/NextGenerationForge/QARepo.git
   ```

2. Navigate to the project directory:
   ```bash
   cd FDM_NGF_SeleniumCucumber
   ```

---

## Project Structure
```
FDM_NGF_SeleniumCucumber/
├── src/
│   ├── test/
│       ├── java/
│       │   ├── com.fdmgroup/
│       │   │   ├── Hooks/                # Cucumber hooks for setup and teardown
│       │   │   ├── testrunner/           # TestRunner for executing feature files
│       │   │   ├── Main_Dashboard/       # Page objects for Main Dashboard functionality
│       │   │   ├── onboardingnavigator/  # Onboarding navigator test files
│       │   │   └── ...                   # Additional feature-specific packages
│       └── resources/
│           ├── Features/                 # Feature files for Cucumber scenarios
│           └── Properties/
│               └── config.properties     # Global configurations (browser, URLs, etc.)
├── reports/                              # Test execution reports
├── pom.xml                               # Maven dependencies and build configuration
└── README.md                             # Documentation
# Maven configuration file
```

---

## How to Run Tests


### Using IDE
1. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
2. Locate the `TestRunner` class in the `runners` package.
3. Right-click and select **Run**.

---

## Test Reporting
- After running the tests, the Extent Report will be generated in the `reports/` directory.
- Open the `index.html` file in a browser to view the report.

---

## Contributing
1. Fork the repository.
2. Create a new branch for your feature.
3. Commit your changes with clear descriptions.
4. Push to your fork and create a pull request.
5. Merge it with the main branch

