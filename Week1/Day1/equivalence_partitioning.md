# Equivalence Partitioning Example

**Scenario:** Login form validation

**Input Domain:** Password length: 0-12 characters  

**Valid Partitions:**
- 1-12 characters → accepted

**Invalid Partitions:**
- 0 characters → rejected
- More than 12 characters → rejected

**Test Cases Derived:**
1. Password="" → Expect: Error "Password cannot be empty"
2. Password="ValidPass1" → Expect: Login successful
3. Password="ThisIsAVeryLongPassword" → Expect: Error "Password too long"
