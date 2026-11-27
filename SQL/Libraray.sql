CREATE TABLE LibraryMembers (
    member_id INT PRIMARY KEY,
    member_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    phone VARCHAR(15)
);




PROBLEM STATEMENT
A library wants to maintain the details of its registered members. Each member must have a unique member ID.
The member&#39;s name and email address are mandatory. No two members should be registered using the same email address.


TASK
Write a SQL statement to create the library_members table with:
• member_id as the primary key.
• member_name as NOT NULL.
• email as NOT NULL and UNIQUE.
• phone as an optional field.
