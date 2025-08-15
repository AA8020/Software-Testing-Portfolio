# Bug Report: Login Form Allows Empty Password

**ID:** BR-001  
**Summary:** Login form accepts empty password and logs in user.  
**Application:** Sample Web App (BetterImages AI)

**Steps to Reproduce:**
1. Navigate to the login page.
2. Enter a valid email.
3. Leave password field empty.
4. Click "Login".

**Expected Result:**  
User should see an error message: "Password cannot be empty."

**Actual Result:**  
User is logged in without a password.

**Severity:** High  
**Priority:** High  
**Status:** Open

**Notes / Recommendations:**  
- Input validation missing on frontend and backend.
- Recommend adding both client-side and server-side validation.
