# Boundary Value Analysis Example

**Scenario:** Login form – Password Length Validation

**Input Domain:** Password must be 1 to 12 characters  

## Boundary Values
- Minimum: 1 character
- Maximum: 12 characters
- Just below minimum: 0 characters
- Just above maximum: 13 characters

## Test Cases Derived from Boundaries

| Test Case ID | Input Password           | Expected Result                         |
|--------------|-------------------------|----------------------------------------|
| BVA-001      | ""                      | Error: "Password cannot be empty"      |
| BVA-002      | "a"                     | Login successful                        |
| BVA-003      | "ValidPass12"           | Login successful                        |
| BVA-004      | "ThisPasswordIsTooLong" | Error: "Password too long"             |

## Notes
- Boundary Value Analysis helps identify defects at the edges of input domains.
- Combined with Equivalence Partitioning, it ensures maximum coverage with fewer test cases.
- Recommended to test on multiple devices and browsers to catch UI-specific issues.
