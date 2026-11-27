CREATE TABLE Attendance (
    attendance_id INT PRIMARY KEY,
    employee_id INT NOT NULL,
    attendance_percentage DECIMAL(5,2) CHECK (attendance_percentage BETWEEN 0 AND 100),
    attendance_status VARCHAR(20) DEFAULT 'Present'
);




PROBLEM STATEMENT
A company wants to maintain employee attendance records. Each attendance record must have a unique attendance ID.
The attendance percentage must always be between 0 and 100. If no attendance status is specified, the system should consider the employee as Present.

TASK
Write a SQL statement to create the attendance table with:
• attendance_id as the primary key.
• employee_id as NOT NULL.
• attendance_percentage between 0 and 100.
• attendance_status with a default value of Present.
