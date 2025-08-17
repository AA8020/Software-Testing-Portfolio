# Non-Functional Test Cases
*Performance, Security, and Usability test cases for local OpenCart Demo*

---

## 1. Performance

| Test Case ID | Description | Precondition | Steps | Expected Result | Test Data |
|--------------|------------|-------------|-------|----------------|-----------|
| NTC-01 | Page Load Speed | OpenCart loaded | 1. Open homepage<br>2. Measure load time | Homepage loads under 3 seconds | N/A |
| NTC-02 | Search Performance | Product exists | 1. Search “MacBook”<br>2. Measure response | Search results return within 2 seconds | MacBook |

---

## 2. Security

| Test Case ID | Description | Precondition | Steps | Expected Result | Test Data |
|--------------|------------|-------------|-------|----------------|-----------|
| NTC-03 | SQL Injection Test | Login page loaded | 1. Enter `' OR '1'='1` in email/password fields<br>2. Submit | Application prevents login, no DB compromise | N/A |
| NTC-04 | Password Strength | Registration page loaded | 1. Enter weak password (e.g., "123")<br>2. Submit | Warning displayed: password too weak | N/A |

---

## 3. Usability

| Test Case ID | Description | Precondition | Steps | Expected Result | Test Data |
|--------------|------------|-------------|-------|----------------|-----------|
| NTC-05 | Mobile Responsiveness | OpenCart homepage | 1. Open site on mobile<br>2. Check layout | Layout adjusts correctly, all buttons clickable | N/A |
| NTC-06 | Clear Navigation | Homepage loaded | 1. Navigate main menu categories | Categories load correctly, easy to locate products | N/A |
