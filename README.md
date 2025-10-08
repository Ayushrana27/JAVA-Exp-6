Java Stream and Lambda Expressions Project
📌 Overview

This project demonstrates the use of Lambda Expressions and Java Stream API for performing sorting, filtering, and aggregation operations on different data types — Employees, Students, and Products.

🧩 Part (a): Sorting Employee Objects Using Lambda Expressions
Description

Demonstrates how to sort a list of Employee objects using Lambda expressions.

Sorting is done based on:

Salary (ascending order)

Name (alphabetical order)

Key Concepts

List.sort((e1, e2) -> ...)

Comparator using Lambda

forEach(System.out::println) for printing

Sample Output
Sorted by Salary:
103 - Rohit - 40000.0
101 - Ayush - 50000.0
102 - Karan - 60000.0

Sorted by Name:
101 - Ayush - 50000.0
102 - Karan - 60000.0
103 - Rohit - 40000.0

🎓 Part (b): Filtering and Sorting Students Using Streams
Description

Uses Java Streams to filter and sort student records.

Displays students with marks greater than 70, sorted in descending order.

Key Concepts

.filter() – filters elements based on condition

.sorted() – sorts stream elements using Lambda

.forEach() – terminal operation to print data

Sample Output
Students with marks > 70 (Sorted by marks descending):
Riya - 92
Ayush - 85
Simran - 75

🛒 Part (c): Stream Operations on Product Dataset
Description

Performs multiple stream operations on a product list:

Filtering products with price > 1000

Calculating average price

Finding the most expensive product

Key Concepts

.filter() for conditional selection

.mapToDouble() for numeric mapping

.average() and .max() for aggregation

Sample Output
Products priced above 1000:
1 - Laptop - 60000.0
3 - Keyboard - 1500.0
4 - Monitor - 12000.0

Average Price: 18550.0
Most Expensive Product: 1 - Laptop - 60000.0

🧠 Technologies Used

Java 8 or above

Stream API

Lambda Expressions

Collections Framework

⚙️ How to Run

Save the code as StreamDemo.java.

Compile using:

javac StreamDemo.java


Run the program:

java StreamDemo

📄 Author

Ayush Rana
Computer Science Engineer | Embedded Systems & Java Enthusiast
