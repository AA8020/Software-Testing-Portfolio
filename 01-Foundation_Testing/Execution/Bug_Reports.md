# Bug_Reports.md
*Jira-style bug reports for OpenCart Demo testing*

---

## 1. User Account Bugs

| Defect ID | Summary | Test Case ID | Severity | Priority | Steps to Reproduce | Expected Result | Actual Result | Status |
|-----------|--------|--------------|---------|---------|-----------------|----------------|---------------|--------|
| D-01 | Duplicate email allowed registration | TC-02 | High | Medium | 1. Navigate to Register page<br>2. Enter existing email<br>3. Submit | Error “Email already exists” | Error displayed | Closed |
| D-02 | Invalid login allows access | TC-04 | Critical | High | 1. Login with invalid password<br>2. Submit | Error “Invalid credentials” | Application prevents login | Closed |

---

## 2. Product & Catalog Bugs

| Defect ID | Summary | Test Case ID | Severity | Priority | Steps to Reproduce | Expected Result | Actual Result | Status |
|-----------|--------|--------------|---------|---------|-----------------|----------------|---------------|--------|
| D-03 | Product details missing description | TC-06 | Medium | Medium | 1. Add product in admin<br>2. Check front-end | Product description visible | Description missing | Open |
| D-04 | Search returns incorrect product | TC-08 | High | Medium | 1. Search “MacBook” | Only MacBook listed | Other products appear | Open |

---

## 3. Orders / Cart Bugs

| Defect ID | Summary | Test Case ID | Severity | Priority | Steps to Reproduce | Expected Result | Actual Result | Status |
|-----------|--------|--------------|---------|---------|-----------------|----------------|---------------|--------|
| D-05 | Checkout fails for COD | TC-11 | Critical | High | 1. Add product to cart<br>2. Checkout with COD | Order created | Error during submission | Open |
| D-06 | Cancelled order still shows in account | TC-12 | Medium | Low | 1. Cancel order<br>2. Check order history | Status = Cancelled | Status still Pending | Open |

---

## 4. API Bugs

| Defect ID | Summary | Test Case ID | Severity | Priority | Steps to Reproduce | Expected Result | Actual Result | Status |
|-----------|--------|--------------|---------|---------|-----------------|----------------|---------------|--------|
| D-07 | Customer API returns 500 error | TC-14 | Critical | High | 1. Send POST request with valid body | 200 OK, customer created | 500 Internal Server Error | Open |
| D-08 | Update product API ignores quantity | TC-15 | High | Medium | 1. Send PUT request to update quantity | Quantity updated | Quantity remains old value | Open |
