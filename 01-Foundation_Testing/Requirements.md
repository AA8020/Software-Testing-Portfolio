# OpenCart Demo – Requirements Document

## 1. Overview
This document lists the assumed **functional and non-functional requirements** for testing the OpenCart Demo website: https://demo.opencart.com/

---

## 2. Functional Requirements

### 2.1 User Account
- FR001: Users can register a new account with email, password, first & last name.
- FR002: Users can log in with valid credentials.
- FR003: Users can reset password using "Forgot Password" functionality.
- FR004: Users can edit account information (name, email, password).

### 2.2 Product Catalog
- FR005: Users can browse products by category.
- FR006: Users can search products by keyword.
- FR007: Product details page displays price, description, reviews, and images.
- FR008: Products can be added to wishlist (logged-in users only).

### 2.3 Shopping Cart & Checkout
- FR009: Users can add products to the shopping cart.
- FR010: Users can update quantity or remove products from the cart.
- FR011: Checkout can be performed with multiple payment methods (PayPal, Credit Card simulation).
- FR012: Users can apply discount codes.
- FR013: Order confirmation is displayed after successful checkout.

### 2.4 Reviews & Ratings
- FR014: Logged-in users can add reviews and rate products.
- FR015: Reviews are visible on the product page.

---

## 3. Non-Functional Requirements

### 3.1 Performance
- NFR001: Homepage should load in < 3 seconds.
- NFR002: Product search should return results within 2 seconds.
- NFR003: Checkout process should complete within 5 seconds per transaction.

### 3.2 Usability
- NFR004: Website should be responsive on desktop and mobile.
- NFR005: Navigation should be intuitive; all links functional.

### 3.3 Security
- NFR006: Passwords must be encrypted.
- NFR007: Checkout payment simulation should not expose sensitive data.

### 3.4 Compatibility
- NFR008: Website works on latest Chrome, Firefox, and Edge browsers.

---

## 4. Acceptance Criteria
- AC001: User can successfully register, login, and logout.
- AC002: Products can be added, updated, or removed from cart.
- AC003: Checkout completes with order confirmation.
- AC004: Homepage and key pages load within performance thresholds.
- AC005: No broken links or missing images.

---

## 5. Assumptions
- Testing is performed on the live OpenCart Demo website.
- Payment processing is simulated; no real transactions occur.
- User accounts can be created using dummy emails.
- Product catalog is static; stock quantity is ignored.

