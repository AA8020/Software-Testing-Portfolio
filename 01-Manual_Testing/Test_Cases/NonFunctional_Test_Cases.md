# Non-Functional Test Cases – OpenCart Demo

## TC-NF01 – Page Load Performance
- Steps: Load homepage.
- Expected: Page loads in < 3 seconds.

## TC-NF02 – Browser Compatibility
- Steps: Open site in Chrome, Firefox, Edge.
- Expected: Layout and functionality consistent.

## TC-NF03 – Security – SQL Injection
- Steps: Enter `' OR 1=1 --` in login field.
- Expected: System rejects input, shows error.

## TC-NF04 – Usability
- Steps: Navigate checkout with minimal clicks.
- Expected: Flow is intuitive, clear instructions.
