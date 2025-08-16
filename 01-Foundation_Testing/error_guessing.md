# End-to-End Error Guessing – OpenCart Demo

## Scenario 1: Invalid Email Format During Registration
- Steps: Enter email without '@' or domain.
- Expected: Application shows error message.
- Actual: Error message shown.
- Status: Pass

## Scenario 2: Special Characters in Address Fields
- Steps: Enter symbols in address fields.
- Expected: Application handles input or shows validation error.
- Actual: Validation error shown.
- Status: Pass

## Scenario 3: Rapid Multiple Submissions
- Steps: Click submit button repeatedly during checkout.
- Expected: Only one order is placed, no duplicate actions.
- Actual: Only one order placed, no duplicates.
- Status: Pass
