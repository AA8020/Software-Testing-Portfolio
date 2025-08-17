# OpenCart Demo – Test Plan

## 1. Overview
This test plan defines the **strategy, scope, and approach** for testing the OpenCart Demo website: https://demo.opencart.com/.  
It ensures **all functional and non-functional requirements** from `Requirements.md` are covered, based on hands-on testing of the live demo site.

---

## 2. Objectives
- Validate that **all critical user flows** work as expected on the demo site.
- Ensure the website meets **performance, usability, and compatibility requirements**.
- Identify and report defects with clear evidence (screenshots, descriptions).
- Provide a **traceable QA process** from requirements to execution.

---

## 3. Scope

### 3.1 In-Scope
- User account operations: register, login, logout, edit profile
- Product catalog: browse categories, search, view product details
- Shopping cart and checkout (simulated payments)
- Product reviews and ratings
- Basic non-functional checks: performance, responsiveness, browser compatibility

### 3.2 Out-of-Scope
- Real payment transactions
- Dynamic stock management
- Backend administration panel
- API testing

---

## 4. Test Approach

### 4.1 Testing Types
- **Functional Testing**: Verify all requirements (FR001-FR015) on demo site.
- **Non-Functional Testing**:
  - Performance: page load, search speed
  - Usability: navigation, responsiveness
  - Security: basic checks on login & checkout
  - Compatibility: latest Chrome, Firefox, Edge

### 4.2 Testing Methods
- **Manual Testing**: Step-by-step execution of functional test cases on demo site
- **Exploratory Testing**: Investigate unexpected behaviors and UI issues
- **Checklists**: Quick verification of smoke and regression flows

---

## 5. Test Environment
- **Website**: https://demo.opencart.com/
- **Browsers**: Chrome (latest), Firefox (latest), Edge (latest)
- **Devices**: Desktop and mobile viewport simulation
- **Tools**: Markdown docs, Draw.io for diagrams, screenshots for bug evidence

---

## 6. Roles & Responsibilities
| Role | Responsibility |
|------|----------------|
| Tester | Execute test cases on demo site, log defects, provide screenshots |
| Reviewer | Validate test coverage, review bug reports |
| Product Owner | Review summary report and approve release readiness |

---

## 7. Test Schedule (Demo-Tested)

- **Sprint Duration**: 5 days

**Day 1 – Planning & Test Data**
- Review `Requirements.md` and verify feature availability on demo site
- Prepare test data for accounts, products, payment simulation
- Set up browser and device configurations

**Day 2 – Functional Testing: Account & Product Catalog**
- Register new account and verify login/logout
- Edit profile details and validate changes
- Browse product categories, open product pages, verify price, description, reviews, images

**Day 3 – Functional Testing: Cart & Checkout**
- Add multiple products to cart
- Update quantity and remove items
- Execute checkout using PayPal and simulated credit card flows
- Submit product reviews and verify visibility

**Day 4 – Non-Functional Testing**
- Measure homepage and category page load times (Chrome & Firefox)
- Test mobile responsiveness on various viewport sizes
- Verify basic security checks on login and checkout
- Ensure all pages render correctly across browsers

**Day 5 – Regression, Bug Retesting & Summary**
- Retest previously logged defects
- Execute smoke and regression checklists
- Collect screenshots, logs, and compile `Test_Summary_Report.md`

---

## 8. Entry & Exit Criteria

### 8.1 Entry Criteria
- Requirements document finalized (`Requirements.md`)
- Test data prepared (`Test_Data.md`)
- Test environment accessible (browsers, devices, demo site)

### 8.2 Exit Criteria
- All test cases executed on demo site
- All critical bugs logged and tracked
- Test summary report (`Test_Summary_Report.md`) completed
- Product Owner approval on readiness for release

---

## 9. Deliverables
- Test cases (`Test_Cases/`)
- Execution results and bug reports (`Execution/`)
- Checklists (`Checklists/`)
- Test summary report (`Test_Summary_Report.md`)
- Traceability matrix (`Traceability_Matrix.md`)
- QA diagrams (`Diagrams/`)

---

## 10. Risks & Mitigation (Demo-Tested)
To be edited