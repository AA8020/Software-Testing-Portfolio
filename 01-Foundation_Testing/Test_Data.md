# Test_Data.md
*Reference input data for executing test cases on local OpenCart Demo setup*

---

## 1. User Accounts

| Test Case | First Name | Last Name | Email | Password | Telephone | Notes |
|-----------|------------|-----------|-------|----------|-----------|-------|
| TC-01: Register new user | John | Doe | john.doe@example.com | John123 | 0123456789 | Valid registration |
| TC-02: Register duplicate email | John | Doe | john.doe@example.com | John123 | 0123456789 | Expect error “Email already exists” |
| TC-03: Login valid user | John | Doe | john.doe@example.com | John123 | 0123456789 | Successful login |
| TC-04: Login invalid password | John | Doe | john.doe@example.com | WrongPass | 0123456789 | Expect “Invalid credentials” |
| TC-05: Guest checkout | Guest | User | guest@example.com | N/A | 0000000000 | Test checkout as guest |

---

## 2. Categories & Products

| Test Case | Category | Product Name | Price | Quantity | Notes |
|-----------|---------|--------------|-------|---------|-------|
| TC-06: Add new product | Desktops | MacBook | 602.00 | 5 | Check product available in catalog |
| TC-07: Add new product | Desktops | HP LP3065 | 122.00 | 7 | Verify product details |
| TC-08: Search product | Laptops & Notebooks | MacBook | 602.00 | 5 | Verify search returns correct product |
| TC-09: Update product quantity | Desktops | MacBook | 602.00 | 10 | Check updated quantity in database |

---

## 3. Orders / Cart

| Test Case | User Email | Product | Quantity | Payment Method | Shipping Address | Notes |
|-----------|------------|---------|---------|----------------|-----------------|-------|
| TC-10: Add to cart | john.doe@example.com | MacBook | 1 | N/A | N/A | Verify cart count increases |
| TC-11: Checkout order | john.doe@example.com | HP LP3065 | 1 | Cash On Delivery | 123 Test St | Order created in database |
| TC-12: Cancel order | john.doe@example.com | MacBook | 1 | N/A | N/A | Order status changes to “Cancelled” |

---

## 4. API Test Data (Optional for Postman / Newman)

| Test Case | API Endpoint | Method | Body / Params | Expected Response |
|-----------|-------------|--------|---------------|-----------------|
| TC-13: Get products | `/api/product?api_token=XYZ` | GET | N/A | 200 OK, product list JSON |
| TC-14: Create customer | `/api/customer?api_token=XYZ` | POST | `{ "firstname":"API", "lastname":"User", "email":"api.user@example.com", "password":"Api123" }` | 200 OK, customer created |
| TC-15: Update product | `/api/product/1?api_token=XYZ` | PUT | `{ "quantity":20 }` | 200 OK, quantity updated |

---

### Notes
- All **emails, passwords, and products** are **realistic examples from OpenCart Demo**.  
- Use this data for **manual testing, automation, API testing, and SQL validation**.  
- Covers **functional, negative, and boundary scenarios**.
