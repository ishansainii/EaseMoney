# Bank Management System

This Java project is an Automated Teller Machine (ATM) simulation for a bank management system. It provides a user-friendly interface for customers to perform various banking transactions, including user login, account creation, and transactions such as deposit, withdrawal, and balance inquiry.

## Features

- **User Authentication:** Log in with your card number and PIN.
- **Account Creation:** New users can sign up for an account with personal details.
- **Transactions:** Deposit, withdrawal, fast cash, pin change, and balance inquiry.
- **GUI Interface:** Easy-to-use graphical interface.
- **Database Connectivity:** Connects to a MySQL database for user information.

## Requirements

- Java Development Kit (JDK)
- MySQL Database

## Installation

1. Open the project in your Java IDE.

2. **Import SQL Script:**
   - In the repository, you will find an exported SQL script named `SQL_Script.sql`.
   - Import this script into your MySQL database using a MySQL client or command line:
     ```bash
     mysql -u your_user -p your_password bankmanagementsystem < SQL_Script.sql
     ```
   - Replace `your_user` and `your_password` with your MySQL credentials.


3. **Database Setup:**
   - Import the provided SQL file `bankmanagementsystem.sql` into your MySQL database.

4. **Update Database Connection:**
   - In the `Conn` class, update the database connection details (URL, username, password) to match your MySQL server credentials.

5. **Library Dependencies:**
   - Add the following JAR files to your project library. Both JAR files are available in the project folder:
     - `jcalendar-tz-1.3.3-4.jar`
     - `mysql-connector-java-8.0.28.jar`

6. Build and run the application.

## Usage

1. Run the `Login` class to start the application.

2. Log in or sign up for an account.

3. Perform transactions using the provided options.


