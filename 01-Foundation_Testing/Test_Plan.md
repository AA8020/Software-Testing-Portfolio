# Test Plan – OpenCart Demo (Local XAMPP)

## 1. Introduction
This Test Plan defines the scope, objectives, strategy, and resources required for testing OpenCart running locally on a XAMPP server. The goal is to ensure that both functional and non-functional requirements are met.

## 2. Objectives
- Verify that all core user journeys (browse → add to cart → checkout) work correctly.
- Validate critical admin functionalities (login, product mgmt, order mgmt).
- Identify defects early and communicate them with severity/priority.
- Assess system stability through smoke, regression, and non-functional tests.

## 3. Scope
- **In Scope**: Functional, usability, performance, regression, and compatibility testing.
- **Out of Scope**: Real payment gateway integration, third-party APIs.

## 4. Test Strategy
- **Approach**: Manual black-box testing using documented artifacts.
- **Techniques**:
  - Equivalence Partitioning (e.g., valid vs invalid login inputs).
  - Boundary Value Analysis (e.g., cart quantity 0, -1, max allowed).
  - Exploratory Testing (to uncover hidden issues).
- **Levels**:
  - Unit (where visible),
  - Integration,
  - System,
  - User Acceptance Testing (UAT-like checks).

## 5. Entry & Exit Criteria
- **Entry**: Application deployed locally on XAMPP, requirements finalized.
- **Exit**: All critical test cases executed, all high severity bugs fixed or deferred with justification.

## 6. Roles & Responsibilities
- **QA Engineer (Me)**: Create test artifacts, execute test cases, log defects, prepare reports.
- **Reviewer/Stakeholder**: Review test results and sign off readiness.

## 7. Environment
- **Hardware**: Local laptop, 8GB RAM, XAMPP installed.
- **Software**: OpenCart Demo, Browsers (Chrome, Firefox, Edge), Draw.io, Markdown.
- **Data**: Synthetic test accounts, dummy credit card numbers.

## 8. Deliverables
- [Test Plan](./Test_Plan.md)  
- [Test Cases (Functional & Non-Functional)](./Test_Cases.md)  
- [Test Data](./Test_Data.md)  
- [Traceability Matrix](./Traceability_Matrix.md)  
- [Bug Reports](./Execution)  
- [Checklists (Smoke, Regression)](./Checklists)  
- [Test Summary Report](./Test_Summary_Report.md)  

## 9. Risks
- Environment issues (XAMPP misconfiguration).
- Limited scope (not connected to real payment systems).
