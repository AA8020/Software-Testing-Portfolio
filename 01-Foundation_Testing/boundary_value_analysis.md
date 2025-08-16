# Boundary Value Analysis – OpenCart Demo

## What is Boundary Value Analysis?
Boundary Value Analysis is a black-box test design technique that focuses on values at the edge of input ranges, where defects are most likely.

## Real-World Scenarios
### Scenario 1: Registration Form – Password Length
- Boundaries: 7, 8, 20, 21 characters
- Test: Enter passwords at, just below, and just above boundaries

### Scenario 2: Product Quantity in Cart
- Boundaries: 0, 1, 99, 100
- Test: Add products at, just below, and just above boundaries

### Scenario 3: Price Filter
- Boundaries: Min and max price values
- Test: Filter products at minimum, maximum, and just outside price limits
