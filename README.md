# 📒 Contact Manager (JDBC Project)

A simple **console-based Contact Manager application** built using **Java + JDBC**.  
This project allows users to **Add, Update, Delete, Search, and View Contacts** stored in a MySQL database.


## 📁 Project Structure

```
com.rohit.contactmanager
│
├── main
│     └── App.java
│
├── db
│     └── DBConnection.java
│
├── dao
│     └── ContactDAO.java
│
└── model
      └── Contacts.java
```

---

## 🚀 Features

✔ Add New Contact  
✔ Update Contact Phone Number  
✔ Delete a Contact  
✔ Search Contact by Name (using LIKE operator)  
✔ View All Contacts  

---

## 🛠️ Technologies Used

- **Java**
    
- **JDBC**
    
- **MySQL**
 
---

## 🗄️ Database Setup

Run the following SQL:

```sql
CREATE DATABASE DBConnect;

USE contacts;

CREATE TABLE contacts (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    phone VARCHAR(20),
    email VARCHAR(100)
);
```


---

## 🔌 Database Configuration (DBConnection.java)

Modify these values in `DBConnection.java`:

```
String url = "jdbc:mysql://localhost:3306/DBConnect";
String username = "root";
String password = "yourPassword";
```

Replace `yourPassword` with your actual MySQL password.

---

## 🖥️ How to Run the Project

### **1. Clone the repository**

```
https://github.com/DesaleRohit/Contact-Manager-jdbc.git
cd Contact-Manager-jdbc
```
### **2. Open project in IntelliJ / Eclipse 

### **3. Add MySQL JDBC Driver**

Download & add:
```
mysql-connector-j-8.x.x.jar
```

### **4. Ensure MySQL is running**

### **5. Run App.java**