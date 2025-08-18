# Requirements – OpenCart Demo (Local XAMPP)

## 📌 Functional Requirements
1. **User Management**
   - Register new user with mandatory fields (name, email, password).
   - Login/logout with valid credentials.
   - Password recovery via “Forgot Password” option.

2. **Product Browsing**
   - Browse categories and subcategories.
   - View product details including description, images, price, stock status.

3. **Search Functionality**
   - Search products by name or keyword.
   - Search results show relevant products only.

4. **Shopping Cart**
   - Add/remove products to/from cart.
   - Update product quantities.
   - Display total price and taxes dynamically.

5. **Checkout Process**
   - Checkout as guest or registered user.
   - Select shipping and payment method.
   - Place order successfully with confirmation.

6. **Admin Features**
   - Secure admin login.
   - Add, update, delete products.
   - Manage orders (approve, cancel, update status).
   - Generate sales reports.

---

## 📌 Non-Functional Requirements
1. **Performance**
   - Homepage and product pages should load within 3 seconds.
   - Cart operations should complete within 2 seconds.

2. **Security**
   - User passwords stored in encrypted format.
   - No SQL injection or XSS vulnerabilities.
   - Secure session handling for admin login.

3. **Compatibility**
   - Support Chrome, Firefox, Edge (latest versions).
   - Responsive UI on desktop and tablet.

4. **Usability**
   - Consistent navigation across pages.
   - Error messages should be clear and actionable.
   - Checkout flow must minimize user confusion.

5. **Reliability**
   - Application should not crash under normal operations.
   - Data should persist across sessions (cart items, orders).
