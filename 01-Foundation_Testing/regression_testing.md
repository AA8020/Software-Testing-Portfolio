# End-to-End Regression Testing – OpenCart Demo

## Scenario 1: Login After Password Change
- Steps: Change password, log out, log in with new password.
- Expected: Login works with new password, old password fails.
- Actual: Login successful with new password, old password rejected.
- Status: Pass

## Scenario 2: Cart Functionality After UI Update
- Steps: Add/remove products from cart after UI changes.
- Expected: Cart updates correctly, no errors.
- Actual: Cart updated, no errors found.
- Status: Pass

## Scenario 3: Order History After Checkout Enhancement
- Steps: Place order, check order history.
- Expected: New order appears in history, previous orders remain intact.
- Actual: New order listed, previous orders present.
- Status: Pass
