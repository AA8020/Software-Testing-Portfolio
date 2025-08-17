# Traceability_Matrix.md
*Mapping OpenCart requirements to test cases and defect tracking*

---

## 1. User Account Management

| Requirement ID | Requirement Description | Test Case ID | Defect ID (if any) | Status |
|----------------|------------------------|--------------|------------------|--------|
| R-01 | Users can register a new account | TC-01, TC-02 | D-01 | Tested |
| R-02 | Users can login with valid credentials | TC-03 | N/A | Tested |
| R-03 | Users cannot login with invalid credentials | TC-04 | D-02 | Tested |
| R-04 | Guest users can checkout | TC-05 | N/A | Tested |

---

## 2. Product & Catalog

| Requirement ID | Requirement Description | Test Case ID | Defect ID (if any) | Status |
|----------------|------------------------|--------------|------------------|--------|
| R-05 | Products are displayed correctly in categories | TC-06, TC-07 | D-03 | Tested |
| R-06 | Users can search for products | TC-08 | D-04 | Tested |
| R-07 | Admin can update product quantity | TC-09 | N/A | Tested |

---

## 3. Cart & Orders

| Requirement ID | Requirement Description | Test Case ID | Defect ID (if any) | Status |
|----------------|------------------------|--------------|------------------|--------|
| R-08 | Users can add products to cart | TC-10 | N/A | Tested |
| R-09 | Users can checkout orders | TC-11 | D-05 | Tested |
| R-10 | Users can cancel orders | TC-12 | D-06 | Tested |

---

## 4. API Endpoints (Optional)

| Requirement ID | Requirement Description | Test Case ID | Defect ID (if any) | Status |
|----------------|------------------------|--------------|------------------|--------|
| R-11 | GET products API returns product list | TC-13 | N/A | Tested |
| R-12 | POST customer API creates a new customer | TC-14 | D-07 | Tested |
| R-13 | PUT product API updates product details | TC-15 | D-08 | Tested |

---

### Notes
- **Requirement IDs** correspond to key OpenCart functionalities.  
- **Test Case IDs** refer to `Test_Data.md`.  
- **Defect IDs** refer to entries in `Execution/Bug_Reports.md`.  
- Status can be: Tested / In Progress / Blocked / Failed.  
