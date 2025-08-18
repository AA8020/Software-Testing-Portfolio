# Test Summary Report – OpenCart Demo
Final document summarizing **test execution results**,  
defect statistics, and overall product quality evaluation.  

## 1. Objective
Summarize QA cycle execution for OpenCart on local XAMPP.

## 2. Scope Covered
- Functional (registration, login, cart, checkout, admin).
- Non-functional (performance, security, usability, compatibility).
- Regression & Smoke testing.

## 3. Execution Summary
- Total Test Cases: 12
- Passed: 8
- Failed: 2
- Pending: 2

## 4. Major Bugs
- **B01**: Cart not updating after removal (Critical).
- **B02**: Login accepts invalid email format.

## 5. Risks & Recommendations
- Fix cart bug before release.
- Implement stronger input validation on login.
- Regression pass after bug fixes.

## 6. Conclusion
Release Readiness: **Conditional (critical bugs must be fixed first)**.
