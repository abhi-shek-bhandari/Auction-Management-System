# Auction Management System - Console Application

## Overview
The Auction Management System is a console-based backend application designed to manage buyers, sellers, and items in an auction platform. This system provides core functionalities for buying and selling goods or services through a bidding mechanism, ensuring a seamless and efficient auction process.

## Features
- **User Management**: 
  - Create, update, and manage buyer and seller accounts.
- **Item Management**: 
  - Sellers can list items for auction, while buyers can browse available items.
- **Bidding System**: 
  - Supports placing bids and managing transactions between buyers and sellers.
- **Data Persistence**: 
  - Reliable data storage and retrieval using MySQL and JDBC.

## Tech Stack
- **Programming Language**: Java
- **Database**: MySQL
- **Libraries/Tools**: JDK, JDBC
- **Runtime Environment**: JVM

## Installation and Setup

1. **Prerequisites**: 
   - Install [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) 
   - Install [MySQL](https://www.mysql.com/downloads/).

2. **Clone the Repository**:
   ```bash
   git clone https://github.com/abhi-shek-bhandari/Auction-Management-System
   ```

3. **Database Setup**:  
   - Create a MySQL database using the following command:
     ```sql
     CREATE DATABASE web20sb101db;
     ```
   

4. **Configure Database Connection**:
   - Update the `dbdetails.properties` class or configuration file with your MySQL credentials.

5. **Compile and Run the Application**:
   

##ER Diagram

  ![image](https://github.com/user-attachments/assets/d1b62f99-bddc-491c-9ff7-552a200ba2f8)


## Usage
1. Launch the application from the console.
2. Follow the menu-driven interface to:
   - Register or manage buyers and sellers.
   - Add items to the auction list.
   - Place bids on listed items.
3. View auction results and manage transactions seamlessly.



## Acknowledgments
- Inspired by real-world auction systems.
- Developed to practice backend development and database integration using Java.

---
Feel free to contribute to this project by creating issues or submitting pull requests!
