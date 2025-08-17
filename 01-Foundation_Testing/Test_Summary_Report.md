# Test_Summary_Report.md
*End-of-sprint summary and QA metrics for OpenCart Demo*

---

## 1. Test Execution Summary

| Test Case ID | Total | Passed | Failed | Blocked | Notes |
|--------------|-------|--------|--------|---------|-------|
| Functional | 12 | 9 | 3 | 0 | See Bug_Reports.md for details |
| Non-Functional | 6 | 6 | 0 | 0 | Performance & security tests passed |
| API | 3 | 1 | 2 | 0 | See Bug_Reports.md for API defects |

---

## 2. Defect Summary

| Severity | Total | Open | Closed | Notes |
|----------|-------|------|--------|-------|
| Critical | 3 | 2 | 1 | Includes invalid login and checkout issues |
| High | 3 | 2 | 1 | Product search & API quantity issues |
| Medium | 2 | 2 | 0 | Product description & cancelled order display |

---

## 3. Test Coverage

- **Requirements Covered:** R-01 to R-13 (See Traceability_Matrix.md)  
- **Test Cases Executed:** TC-01 to TC-15  
- **Defects Logged:** D-01 to D-08  
- **Automation Coverage:** Login, Search, Add-to-Cart, Checkout  
- **API Coverage:** Customer creation, Get products, Update product quantity  

---

## 4. Recommendations

1. Fix **critical defects** before release (login, checkout, API errors)  
2. Verify **product details consistency** and search accuracy  
3. Expand **automation coverage** to include order cancellation and guest checkout  
4. Schedule **regression tests** after bug fixes  

---

## 5. Conclusion

- Overall, **manual, automation, and API tests** completed successfully.  
- Portfolio demonstrates **end-to-end QA cycle**: planning → execution → reporting → closure.  
- Ready for **portfolio showcase or first QA job application**.
