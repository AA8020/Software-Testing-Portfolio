# 2. Automation Testing 

## 📌 Overview  
This section demonstrates my ability to design, implement, and document **test automation frameworks** using a combination of code-based and codeless tools.  

Instead of leaving only raw scripts and configuration files, I’ve included **well-documented examples, structured frameworks, and clear instructions**, making it easy for technical and non-technical readers to see how I automate tests, structure frameworks, and produce maintainable solutions.  

---

## 💡 Why I Included This  
Automation is essential for modern QA teams, so testers must be able to:  
1. Build scalable, maintainable, and reusable automated test scripts  
2. Combine programming, database, and framework knowledge to test end-to-end scenarios  
3. Integrate automation with CI/CD pipelines and reporting to deliver actionable results  

This repository shows that I can implement **professional-grade automation frameworks** using industry-standard tools and practices.  

---

## 🎯 Knowledge Demonstrated & How to Navigate  

- **Focus**: Core automation framework and example scripts for web applications using Java and a Java-based Browser Automation Framework (Selenium WebDriver)  
- **Skills**:  
  - Browser automation using WebDriverManager and a configurable Chrome driver  
  - Implemented Page Object Model (POM) for maintainable scripts (Login, Inventory, Cart)  
  - Robust synchronization using explicit and implicit waits and reliable locators  
- **What you will find**:  
  - Example TestNG script: `src/test/java/com/amr/automation/tests/SauceDemoTest.java`  
  - Page Object Model implementations: `src/main/java/com/amr/automation/pages/{LoginPage,InventoryPage,CartPage}.java`  
  - Utilities and helpers: `src/main/java/com/amr/automation/utils/{DriverFactory,ConfigReader,ScreenshotUtil}.java` with failure artifacts written to `target/screenshots` on test failures

 

### 2️⃣ [Selenium IDE (Codeless)](./05-Selenium_IDE)  
- **Focus**: Quick, codeless test automation  
- **Skills**:  
  - Recorded smoke and regression test flows  
  - Exported scripts for integration with a Java-based Browser Automation Framework (Selenium WebDriver)  
- **What you will find**:  
  - Recorded smoke and regression test flows  
  - Exported scripts for integration with a Java-based Browser Automation Framework (Selenium WebDriver)  

### 3️⃣ [Katalon Studio](./06-Katalon_Studio)  
- **Focus**: Keyword-driven automation projects  
- **Skills**:  
  - Built reusable components and custom keywords  
  - Developed web and API automation workflows  
  - Integrated automation with CI/CD pipelines  
- **What you will find**:  
  - Reusable components and custom keywords  
  - CI/CD integration examples  
  - Web and API automation workflows  

### 4️⃣
 [SQL for Testers](./07-SQL_For_Testers)  
- **Focus**: Database validation for automation  
- **Skills**:  
  - Verified database entries and performed data setup/cleanup  
  - Integrated SQL checks into automated test scripts  
- **What you will find**:  
  - Queries for verifying test results  
  - Data setup and cleanup scripts  
  - Integration with automated test scripts  

### 5️⃣ [Playwright](./08-Playwright)  
- **Focus**: Cross-browser end-to-end automation  
- **Skills**:  
  - Developed automated scripts for dynamic web pages  
  - Handled API requests and parallel execution  
  - Integrated with CI/CD pipelines and reporting dashboards  
- **What you will find**:  
  - End-to-end automated scripts for dynamic web pages  
  - API request handling and parallel execution  
  - CI/CD integration and reporting dashboards  

---

## 📂 Key Artifacts in This Repository  

1. **Automation Scripts** – Core WebDriver, Playwright, Katalon, and Selenium IDE examples  
2. **Configuration Files** – Test data, environment settings, reusable components  
3. **Reports & Logs** – TestNG, Playwright, and Katalon outputs for structured reporting  
4. **README.md Files** – Documentation in each folder explaining implementation, purpose, and best practices  

---

## 🛠 Tools I Used  
- Java-based Browser Automation Framework (Selenium WebDriver) for browser automation  
- [Selenium IDE](https://www.selenium.dev/selenium-ide/) for codeless automation  
- [Katalon Studio](https://www.katalon.com/) for keyword-driven test automation  
- [Playwright](https://playwright.dev/) for end-to-end automation  
- [Java](https://www.java.com/) for programming test scripts  
- [SQL](https://www.w3schools.com/sql/) for database verification  
- [TestNG](https://testng.org/) for structuring test frameworks  
- CI/CD tools (e.g., [Jenkins](https://www.jenkins.io/)) for automated execution and reporting
