# 🚀 Java-based Browser Automation Framework – Core Automation

![Java CI with Maven](https://github.com/AA8020/Software-Testing-Portfolio/actions/workflows/maven.yml/badge.svg)  
*CI build status via GitHub Actions*


## 📌 Overview
This project demonstrates my practical skills with a **Java-based Browser Automation Framework** (Selenium WebDriver) for browser automation.  
It shows how I design page object models, configure reusable utilities, and run automated tests with TestNG.

---

## 💡 Why I Included This
- I wanted to provide recruiters and collaborators with a **realistic automation framework** example, not just raw scripts.  
The structure mimics how Selenium is used in real projects, including:
- Page Object Model (POM)
- Config-driven setup
- Base classes for test reuse
- Screenshot capture
- TestNG execution with reporting

---

## 🎯 Knowledge Demonstrated
- Java-based Browser Automation Framework (Selenium WebDriver) setup & configuration
- Page Object Model (POM) design
- TestNG framework integration
- Config management (`config.properties`)
- Utility classes (driver factory, screenshot helper, config reader)
- Basic CI/CD setup with GitHub Actions
- Reporting integration (Allure)

---

## 📌 How to Navigate This Folder
The repo follows a **clean automation framework structure**:

```
01-Selenium_WebDriver/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── pages/          # Page Object Model classes
│   │   │   │   ├── LoginPage.java
│   │   │   │   ├── InventoryPage.java
│   │   │   │   └── CartPage.java
│   │   │   ├── utils/          # Utility helpers
│   │   │   │   ├── DriverFactory.java
│   │   │   │   ├── ConfigReader.java
│   │   │   │   └── ScreenshotUtil.java
│   │   └── resources/          # Config files
│   │       └── config.properties
│   └── test/
│       └── java/
│           ├── base/           # Base classes for test setup
│           │   ├── BaseTest.java
│           │   └── TestListener.java
│           └── tests/          # Actual test cases
│               └── SauceDemoTest.java
│
├── testng.xml                  # TestNG suite runner
├── pom.xml                     # Maven dependencies
├── README.md                   # Project documentation
├── .gitignore                  # Clean repo rules
├── allure-results/             # Test results (ignored in Git)
└── screenshots/                # Captured screenshots (ignored in Git)
```

---

## 📂 Key Artifacts in This Folder
- **pages/** → Page Object Model classes (Login, Inventory, Cart).
- **utils/** → Helpers for driver setup, config, and screenshots.
- **base/** → BaseTest and TestListener for reusable setup & reporting.
- **tests/** → Actual automated tests (SauceDemoTest).
- **config.properties** → URL, browser type, and other configs.
- **pom.xml** → Dependencies (Selenium, TestNG, Allure, etc.).
- **testng.xml** → Test suite definition.

---

## 🛠 Tools I Used
- Java 17
- Selenium WebDriver
- TestNG
- Maven
- Allure Reports
- GitHub Actions (for CI/CD)
- IntelliJ IDEA

---


## Try it (run tests locally)

Quick compile (skip running browser tests):

```bash
# from the repository root (portable, no user-specific paths)
cd 02-Automation_Testing/01-Selenium_WebDriver
mvn -DskipTests package
```

Run the TestNG suite (uses browser settings from `config.properties`):

```bash
# run from the same folder as the pom.xml
mvn test
```

Run headless or on a different browser (override via -D):

```bash
# examples (works in bash and CI). Chrome and other browsers supported via -DBROWSER; use -DHEADLESS=true for headless runs.
mvn -DBROWSER=chrome -DHEADLESS=true test
mvn -DBROWSER=chrome -DHEADLESS=false test
```
