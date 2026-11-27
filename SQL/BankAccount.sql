CREATE TABLE bankAccounts (
    account_id INT PRIMARY KEY,
    customer_name VARCHAR(100) NOT NULL,
    account_number VARCHAR(20) NOT NULL UNIQUE,
    balance DECIMAL(12,2),
    status VARCHAR(20) DEFAULT 'Active'
);



PROBLEM STATEMENT
A bank wants to maintain customer account details. The system should store the account ID, customer name, account number, balance, and status.
Every account must have a unique account ID and account number. The customer name and account number are mandatory. A newly created account should have the status Active by default.

TASK
Write a SQL statement to create the bank_accounts table with:
• account_id as the primary key.
• customer_name as NOT NULL.
• account_number as NOT NULL and UNIQUE.
• balance as an optional field.
• status with a default value of Active.
