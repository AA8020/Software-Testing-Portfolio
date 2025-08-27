# Functional Test Cases – OpenCart Demo

## TC01 – User Registration
- **Precondition**: OpenCart running on XAMPP.
- **Steps**:
  1. Navigate to "Register".
  2. Enter valid details (TD01, TD03).
  3. Submit form.
- **Expected Result**: Account created successfully, confirmation email sent.
- **Priority**: High

---

## TC02 – Login with Valid Credentials
- Steps:
  1. Navigate to Login page.
  2. Enter TD01 + TD03.
- Expected: User successfully logged in.
- Priority: High

---

## TC03 – Login with Invalid Credentials
- Steps:
  1. Enter TD02 + TD04.
- Expected: Error message: "Invalid email or password."
- Priority: High

---

## TC04 – Add Product to Cart
- Steps:
  1. Search for “iPhone” (TD05).
  2. Select product.
  3. Click “Add to Cart.”
- Expected: Product appears in cart with correct price & qty.

---

## TC05 – Checkout Process
- Steps:
  1. Add product to cart.
  2. Proceed to checkout.
  3. Enter shipping + payment info (TD07).
  4. Confirm order.
- Expected: Order placed successfully, confirmation displayed.

---

## TC06 – Admin Login
- Steps:
  1. Navigate to `/admin`.
  2. Enter TD09.
- Expected: Access admin dashboard.
