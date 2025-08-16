# Day 5: Integration Testing

## Integration Scenarios & Results
- Register, login, place order: Order appears in order history (Success)
- Add product to cart, checkout: Cart contents match order (Success)
- Remove product from cart, checkout: Cart is empty, cannot proceed (Success)
- Payment info passed to order confirmation: Confirmation page displays correct info (Success)

## Issues Found
| ID    | Title                                 | Severity | Steps to Reproduce                | Status |
|-------|---------------------------------------|----------|-----------------------------------|--------|
| INT01 | Order history not updated after checkout | High     | Place order > Check order history | Open   |

## Notes
- Integration between modules validated
- One issue logged for order history
