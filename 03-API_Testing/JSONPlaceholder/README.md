# JSONPlaceholder – CRUD API Testing  

## 📌 Overview  
This project showcases my ability to test APIs using [JSONPlaceholder](https://jsonplaceholder.typicode.com/), a public mock REST API for practicing **CRUD operations**.  
It demonstrates how I approach both **manual and automated API validation**, and how I document results in a clear, professional format.
 

---

## ✅ Scope of Testing  
- Create (POST) new resources  
- Read (GET) existing resources  
- Update (PUT/PATCH) resources  
- Delete (DELETE) resources  
- Negative cases (invalid IDs, missing fields, wrong endpoints)  

---

## 📊 Findings (Summary)  

| ID    | Request          | Expected        | Actual           | Status | Notes                  |
|-------|-----------------|----------------|-----------------|--------|------------------------|
| JP-01 | GET /posts       | 200 + array    | 200 + array     | ✅     | Returned > 0 items     |
| JP-02 | GET /posts/1     | 200 + object   | 200 + object    | ✅     | Fields present, id OK  |
| JP-03 | POST /posts      | 201 + id       | 201 + id:101    | ✅     | Non-persistent (mock)  |
| JP-04 | GET /posts/9999  | 404 (expected) | 200 + `{}`      | ✅     | Mock API accepts request |
| JP-05 | DELETE /posts/1  | 200/204        | 200 + empty body| ✅     | Mock response          |

---

## 🔑 Key Notes  
- JSONPlaceholder is a **mock service** → create/update/delete actions don’t persist.  
- Some **negative cases** (e.g., non-existent IDs) may return `{}` with 200 instead of 404.  
- Useful for demonstrating **API test design, execution, and reporting**.  

---

## 📂 Deliverables  
- **[Collections](./Collections/JSONPlaceholder_CRUD.postman_collection.json)**  
- **[Environment](./Collections/JSONPlaceholder.postman_environment.json)**  
- **[Reports (HTML)](./Reports/jsonplaceholder-report.html)** | [JSON](./Reports/jsonplaceholder-report.json) | [PDF](./Reports/jsonplaceholder-report.pdf)  
- **[Screenshots](./Screenshots/)**  

---
