# 💰 ManageFoxV1 - Transaction REST API

A simple and efficient Spring Boot-based REST API for managing transactions in the **ManageFoxV1** application. This API provides endpoints to **create**, **read**, **update**, and **delete** (CRUD) transaction records.

---

## 📂 Project Structure
com.manageFox.ManageFoxV1
├── controllers
│ └── TransactionController.java
├── model
│ └── Transaction.java
├── services
│ └── TransactionService.java


---

## 🚀 Endpoints

Base URL: `/manageFoxV1/Api/Transactions`

| HTTP Method | Endpoint                        | Description                         |
|-------------|----------------------------------|-------------------------------------|
| `GET`       | `/getAllTnx`                     | Get a list of all transactions      |
| `POST`      | `/addTransaction`                | Add a new transaction               |
| `DELETE`    | `/{id}`                          | Delete a transaction by ID          |
| `PUT`       | `/UpdateTnx/{id}`                | Update a transaction by ID          |

---

## 📦 Sample Requests

### ➕ Add a Transaction
```http
POST /manageFoxV1/Api/Transactions/addTransaction
Content-Type: application/json

{
  "id": 1,
  "amount": 500,
  "description": "Test Transaction"
}
---
## 🧰 Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Web (REST)**
- **Lombok**

---

## 🛠 Requirements

- Java 17 or later installed
- Maven build tool
- Any Spring Boot-compatible IDE (e.g., IntelliJ IDEA, Eclipse, VS Code)

---

## 🤝 Contribution

Contributions are welcome!  
Feel free to fork the repository, enhance the code, and submit a pull request.

For major changes, please open an issue first to discuss your ideas.

---

## 📄 License

This project is licensed under the **MIT License**.

---

## 📬 Contact

Created by **[Your Name]** – feel free to reach out!

Created by **[Prem mankar]** – feel free to reach out!
