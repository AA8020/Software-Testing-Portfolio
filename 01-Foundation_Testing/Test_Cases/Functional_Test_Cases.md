# Functional Test Cases
*Functional test cases for local OpenCart Demo based on Test_Data.md and Traceability_Matrix.md*

---

## 1. User Account Management

| Test Case ID | Description | Precondition | Steps | Expected Result | Related Requirement | Test Data |
|--------------|------------|-------------|-------|----------------|-------------------|-----------|
| TC-01 | Register new user with valid data | OpenCart homepage loaded | 1. Navigate to Register page<br>2. Fill First Name, Last Name, Email, Password, Telephone<br>3. Submit | User account is created, welcome message displayed | R-01 | John Doe, john.doe@example.com |
| TC-02 | Register user with existing email | OpenCart homepage loaded | 1. Navigate to Register page<br>2. Use existing email from previous registration<br>3. Submit | Error message “Email already exists” displayed | R-01 | john.doe@example.com |
| TC-03 | Login with valid credentials | User already registered | 1. Navigate to Login page<br>2. Enter Email & Password<br>3. Submit | User logged in successfully, redirected to account dashboard | R-02 | john.doe@example.com, John123 |
| TC-04 | Login with invalid credentials | User already registered | 1. Navigate to Login page<br>2. Enter valid Email & invalid Password<br>3. Submit | Error message “Invalid credentials” displayed | R-03 | john.doe@example.com, WrongPass |
| TC-05 | Guest Checkout | OpenCart homepage loaded | 1. Add product to cart<br>2. Checkout as guest<br>3. Fill shipping & payment info<br>4. Submit order | Order created successfully, confirmation displayed | R-04 | guest@example.com |

---

## 2. Product & Catalog

| Test Case ID | Description | Precondition | Steps | Expected Result | Related Requirement | Test Data |
|--------------|------------|-------------|-------|----------------|-------------------|-----------|
| TC-06 | Add new product to catalog | Admin logged in | 1. Navigate to Admin > Catalog > Products<br>2. Click Add Product<br>3. Enter product details<br>4. Save | Product appears in catalog with correct details | R-05 | MacBook, 602.00, 5 |
| TC-07 | Add another product | Admin logged in | Same as TC-06 | Product appears in catalog | R-05 | HP LP3065, 122.00, 7 |
| TC-08 | Search product by name | Product exists | 1. Enter product name in search bar<br>2. Submit | Correct product displayed in search results | R-06 | MacBook |
| TC-09 | Update product quantity | Admin logged in | 1. Navigate to Products<br>2. Edit product quantity<br>3. Save | Database updated with new quantity, front-end reflects changes | R-07 | MacBook, quantity 10 |

---

## 3. Cart & Orders

| Test Case ID | Description | Precondition | Steps | Expected Result | Related Requirement | Test Data |
|--------------|------------|-------------|-------|----------------|-------------------|-----------|
| TC-10 | Add product to cart | Product exists | 1. Navigate to product page<br>2. Click Add to Cart | Cart count increases by 1, product listed in cart | R-08 | MacBook, quantity 1 |
| TC-11 | Checkout order | Product in cart | 1. Navigate to Cart<br>2. Click Checkout<br>3. Select payment & shipping<br>4. Submit | Order created, confirmation page displayed, database updated | R-09 | HP LP3065, Cash On Delivery |
| TC-12 | Cancel order | Order exists | 1. Navigate to Order History<br>2. Select order<br>3. Cancel order | Order status changes to “Cancelled” in database and front-end | R-10 | MacBook |

---

## 4. API Test Cases

| Test Case ID | Description | Precondition | Steps | Expected Result | Related Requirement | Test Data |
|--------------|------------|-------------|-------|----------------|-------------------|-----------|
| TC-13 | Get products list via API | API enabled | 1. Send GET request to /api/product?api_token=XYZ | Response 200 OK, correct product list JSON | R-11 | N/A |
| TC-14 | Create customer via API | API enabled | 1. Send POST request with customer JSON | Response 200 OK, customer created in database | R-12 | API User, api.user@example.com |
| TC-15 | Update product via API | API enabled | 1. Send PUT request with new quantity | Response 200 OK, product quantity updated in DB | R-13 | MacBook, quantity 20 |
