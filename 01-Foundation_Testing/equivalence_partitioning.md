# Equivalence Partitioning – OpenCart Demo

## What is Equivalence Partitioning?
Equivalence Partitioning is a black-box test design technique that divides input data into valid and invalid partitions, so only one test case from each partition is needed.

## Real-World Scenarios
### Scenario 1: Registration Form – Password Length
- Valid: 8-20 characters
- Invalid: <8 or >20 characters
- Test: Enter passwords of 7, 8, 20, and 21 characters

### Scenario 2: Product Quantity in Cart
- Valid: 1-99
- Invalid: 0, negative, 100+
- Test: Add 0, 1, 99, 100 products to cart

### Scenario 3: Email Field
- Valid: Proper email format (e.g., user@example.com)
- Invalid: Missing @, missing domain, spaces
- Test: Enter valid and invalid emails during registration
