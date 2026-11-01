<div align="center">

# ✈️ Airport Management System (Java Swing)

<img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk" alt="Java">
<img src="https://img.shields.io/badge/GUI-Java%20Swing-blue?style=for-the-badge&logo=java" alt="Swing">
<img src="https://img.shields.io/badge/IDE-NetBeans-purple?style=for-the-badge&logo=apache-netbeans" alt="NetBeans">
<img src="https://img.shields.io/badge/Paradigm-OOP-success?style=for-the-badge" alt="OOP">

*A robust desktop-based Airport and Flight Management System engineered using Object-Oriented Programming principles and Java Swing.*

</div>

---

## 🚀 About the Project

The **Airport Management System** is a desktop application designed to streamline core airport administration operations, including user authentication, session state management, and ticket reservations. Built entirely in Java, the architecture emphasizes clean OOP design, modular package structures, and lightweight local binary data persistence without requiring heavy external database servers.

---

## ✨ Key Features

* **🔐 Secure User Authentication**: Dedicated login framework with session persistence to handle user accounts safely[cite: 17, 21].
* **🎟️ Ticket & Passenger Management**: Structured data models handling ticket IDs, passenger details, flight numbers, and source/destination routes[cite: 18].
* **💾 File-Based Serialization**: Utilizes Java Object Serialization (`users.dat`, `tickets.dat`) to persistently store account and booking records locally[cite: 18, 19].
* **🖥️ Dynamic Java Swing GUI**: Clean window frames and control dashboards layout for intuitive navigation[cite: 16, 17].

---

## 🛠️ Tech Stack & Architecture

* **Language:** Java (JDK 8+)
* **GUI Framework:** Java Swing / AWT
* **IDE:** NetBeans IDE
* **Data Storage:** Java Object Serialization (I/O Streams)[cite: 18, 19]

---

## 📂 Project Structure

```text
Airport-Management-System-Java/
├── src/
│   └── project_oops/
│       ├── Project_OOPs.java                # Main application entry point
│       ├── loginFrame.java                  # Authentication login window[cite: 17]
│       ├── Airport_management_System.java   # Main dashboard interface[cite: 16]
│       ├── User.java                        # User account model class
│       ├── UserData.java                    # User accounts persistence handler[cite: 19]
│       ├── TicketData.java                  # Flight ticket model & storage[cite: 18]
│       └── Session.java                     # Active session state manager[cite: 21]
├── nbproject/                               # NetBeans project metadata
├── build.xml                                # Ant build configuration
└── .gitignore
