# Day 2: Test Design & Test Case Development

## Test Case Design
Test cases are designed to cover all major workflows and edge cases on demo.opencart.com.

### Functional Test Cases
**TC01: Register New User**  
Steps: Go to Register → Fill form → Submit  
Expected Result: User account created, confirmation shown

**TC02: Login with Valid Credentials**  
Steps: Go to Login → Enter valid credentials → Submit  
Expected Result: User logged in, dashboard visible

**TC03: Search for Product**  
Steps: Enter product name in search → Submit  
Expected Result: Product list displays relevant items

**TC04: Add Product to Cart**  
Steps: Search product → Add to cart  
Expected Result: Product appears in cart

**TC05: Checkout Process**  
Steps: Add product to cart → Go to checkout → Fill details → Confirm  
Expected Result: Order placed, confirmation shown

**TC06: Invalid Login**  
Steps: Go to Login → Enter invalid credentials → Submit  
Expected Result: Error message displayed

**TC07: Remove Product from Cart**  
Steps: Add product → Go to cart → Remove  
Expected Result: Product removed from cart

**TC08: View Order History**  
Steps: Login → Go to order history  
Expected Result: Past orders displayed

### Negative, Boundary, and Edge Cases
- Register with missing required fields (should show error)
- Checkout with empty cart (should block checkout)
- Search with special characters (should not crash)
- Add large quantity to cart (should handle gracefully)

### Integration Test Cases
- Add product to cart, then checkout: Cart contents should match order
- Register, login, place order: Order should appear in order history

### Regression Test Cases
- Re-run all above after any bug fix or update

### Non-Functional Test Cases
- Load homepage and measure response time
- Attempt login with slow network

### UAT & Exploratory Test Cases
- Simulate end-to-end user journey
- Try unexpected actions (e.g., rapid add/remove from cart)
