# Test_Plan.md
*QA strategy, scope, roles, environment, and approach for local OpenCart testing*

---

## 1. Project Overview
- **Application:** OpenCart Demo (local setup)  
- **Purpose:** Demonstrate practical QA skills including **manual, automation, API testing, SQL validation, and CI/CD integration**  
- **Scope:** Core e-commerce flows including user registration, login, product search, add-to-cart, checkout, and order management

---

## 2. QA Objectives
1. Validate **functional requirements** using structured test cases (see `Test_Data.md`)  
2. Identify and report defects using **industry-standard bug reports**  
3. Implement **automation scripts** for critical workflows  
4. Verify **database integrity** using SQL queries  
5. Test **API endpoints** and validate responses  
6. Integrate **automation and API tests into CI/CD pipelines**  
7. Practice **OS and Git commands** relevant to QA tasks  

---

## 3. Test Scope
- **In Scope:**  
  - User account flows (registration, login, guest checkout)  
  - Product catalog (search, add, update)  
  - Cart and order processes (checkout, cancel, modify)  
  - API endpoints (product, customer, order)  
  - Automation and regression testing for critical paths  
- **Out of Scope:**  
  - Payment gateway external integrations  
  - Advanced performance/load testing beyond local setup  

---

## 4. Test Environment
- **Local OpenCart setup:** XAMPP/WAMP/MAMP  
- **Browsers:** Chrome, Firefox, Edge (for cross-browser tests)  
- **Automation tools:** Selenium WebDriver, TestNG/JUnit  
- **API tools:** Postman, Newman CLI  
- **Database:** MySQL (local)  
- **CI/CD:** Jenkins (local)  
- **Version Control:** Git  

---

## 5. Test Approach
### 5.1 Manual Testing
- Execute test cases from `Test_Data.md`  
- Record actual results and log defects in Jira-style markdown

### 5.2 Automation Testing
- Automate login, search, add-to-cart, checkout workflows  
- Integrate TestNG/JUnit for structured execution  
- Generate **HTML/Extent Reports**

### 5.3 API Testing
- Postman collections for GET/POST/PUT/DELETE requests  
- Automate via Newman CLI  
- Validate database after API operations

### 5.4 Database Validation
- Execute SQL queries to validate product, customer, and order data  
- Ensure data consistency after manual, automation, and API tests

### 5.5 CI/CD Integration
- Run automation and API tests through Jenkins  
- Generate reports and notifications for test results

---

## 6. Roles & Responsibilities
- **Tester:** Execute all tests, write scripts, log defects, generate reports  
- **Local Environment Admin :** Setup OpenCart, configure database, manage Jenkins jobs  

---

## 7. Test Deliverables
- Test Plan (`Test_Plan.md`)  
- Test Data (`Test_Data.md`)  
- Test Cases (`Test_Cases/Functional_Test_Cases.md`, `Test_Cases/NonFunctional_Test_Cases.md`)  
- Bug Reports (`Execution/Bug_Reports.md`)  
- Automation Scripts (Java/Python)  
- API Collections (Postman/JSON)  
- CI/CD Job Configurations (Jenkins)  
- Traceability Matrix (`Traceability_Matrix.md`)  
- Test Summary Report (`Test_Summary_Report.md`)  

---

## 8. Entry & Exit Criteria
**Entry Criteria:**  
- Local OpenCart fully installed  
- Test data loaded  
- Automation framework configured  
**Exit Criteria:**  
- All test cases executed  
- Defects logged and verified  
- Test summary report completed  

---

## 9. Risks & Mitigation
| Risk | Impact | Mitigation |
|------|-------|-----------|
| Local OpenCart setup fails | High | Follow installation checklist, use XAMPP/WAMP logs |
| Automation scripts break | Medium | Use POM, maintain test data consistency |
| API endpoint changes | Medium | Validate endpoint documentation, update Postman collections |
| Missing test coverage | High | Map requirements to test cases in Traceability Matrix |

---

## 10. References
- [Test_Data.md](./Test_Data.md)  
- OpenCart Demo: https://demo.opencart.com/  
- Selenium WebDriver & TestNG/JUnit documentation  
- Postman & Newman documentation  
- SQL/MySQL reference guides  
