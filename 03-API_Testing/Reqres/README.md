# ReqRes – API Testing  

## 📌 Overview  
This project showcases my ability to test APIs using [ReqRes](https://reqres.in/), a hosted REST API for practicing **authentication flows and CRUD operations**.  
It demonstrates how I validate **positive and negative scenarios**, automate assertions, and document results in a structured, professional format.  

---

## ✅ Scope of Testing  

### Authentication  
- **POST /api/register** → Register Successful (200)  
- **POST /api/register** → Register Unsuccessful (400)  
- **POST /api/login** → Login Successful (200)  
- **POST /api/login** → Login Unsuccessful (400)  

### Users  
- **GET /api/users?page=2** → List Users (200)  
- **GET /api/users/2** → Single User (200)  
- **GET /api/users/23** → Not Found (404)  
- **POST /api/users** → Create User (201)  
- **PUT /api/users/2** → Edit User (200)  
- **PATCH /api/users/2** → Partial Edit User (200)  
- **DELETE /api/users/2** → Delete User (204)  

---

## 📊 Findings (Summary)  

**Execution Stats:**  
- Total Tests: **16**  
- Passed: **16**  
- Failed: **0**  
- Total Runtime: **858 ms**  

| ID    | Request                   | Expected                          | Actual                          | Status | Notes                              |
|-------|---------------------------|-----------------------------------|---------------------------------|--------|------------------------------------|
| RQ-01 | POST /api/register        | 400 (Bad Request)                 | 400 (Bad Request)               | ✅     | Missing field → not registered     |
| RQ-02 | POST /api/login           | 200 + token                       | 200 + token                     | ✅     | Token returned                     |
| RQ-03 | POST /api/login           | 400 (Bad Request)                 | 400 (Bad Request)               | ✅     | Invalid login → rejected           |
| RQ-04 | POST /api/register        | 200 + id + token                  | 200 + id + token                | ✅     | Successful registration            |
| RQ-05 | GET /api/users?page=2     | 200 + array                       | 200 + array                     | ✅     | Users listed with id + email       |
| RQ-06 | GET /api/users/2          | 200 + object                      | 200 + object                    | ✅     | User object has required fields    |
| RQ-07 | GET /api/users/23         | 404 (Not Found)                   | 404 (Not Found)                 | ✅     | User not found handled correctly   |
| RQ-08 | PUT /api/users/23         | 200 + updated object              | 200 + updated object            | ✅     | User updated (mock response)       |
| RQ-09 | DELETE /api/users/2       | 204 (No Content)                  | 204 (No Content)                | ✅     | User deleted                       |
| RQ-10 | POST /api/users           | 201 + created object              | 201 + name, job, id, createdAt  | ✅     | User created successfully          |

---

## 🔑 Key Notes  
- ReqRes simulates **realistic API flows** including **authentication and CRUD**.  
- Create/update/delete actions are **mocked** → data does not persist.  
- Negative cases (invalid users, missing fields) return correct **400/404 codes**.  
- Covers **end-to-end API lifecycle** (auth + users).  

---

## 📂 Deliverables  
- [Collections](./Collections/ReqRes_API.postman_collection.json)  
- [Environment](./Collections/ReqRes_API.postman_environment.json)  
- [Reports](./Reports/reqres-report.html) (+ `.json`, and `.pdf`)  
- [Screenshots](./Screenshots/) 
---
