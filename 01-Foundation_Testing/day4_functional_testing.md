# Day 4: Functional Testing

## Executed Test Cases & Results
- Register new user: Success
- Login with valid credentials: Success
- Search for product: Success
- Add product to cart: Success
- Checkout process: Success
- Invalid login: Error message displayed
- Remove product from cart: Success
- View order history: Success

## Defects Found
| ID   | Title                                         | Severity | Steps to Reproduce                | Status |
|------|-----------------------------------------------|----------|-----------------------------------|--------|
| DF01 | Cart does not update after removing product   | Medium   | Add product > Remove from cart    | Open   |
| DF02 | Confirmation email not sent after registration| Low      | Register new user                 | Open   |

## Notes
- All major workflows validated
- Defects logged for follow-up
