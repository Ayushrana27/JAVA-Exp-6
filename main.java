import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + " - " + name + " - " + salary;
    }
}

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " - " + marks;
    }
}

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return id + " - " + name + " - " + price;
    }
}

public class StreamDemo {
    public static void main(String[] args) {

        // ===================== Part (a): Employee Sorting =====================
        System.out.println("=== Part (a): Sorting Employee Objects Using Lambda ===");
        List<Employee> employees = Arrays.asList(
            new Employee(101, "Ayush", 50000),
            new Employee(103, "Rohit", 40000),
            new Employee(102, "Karan", 60000)
        );

        // Sort by Salary
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
        System.out.println("Sorted by Salary:");
        employees.forEach(System.out::println);

        // Sort by Name
        employees.sort((e1, e2) -> e1.name.compareTo(e2.name));
        System.out.println("\nSorted by Name:");
        employees.forEach(System.out::println);


        // ===================== Part (b): Student Filtering & Sorting =====================
        System.out.println("\n=== Part (b): Filtering and Sorting Students Using Streams ===");
        List<Student> students = Arrays.asList(
            new Student("Ayush", 85),
            new Student("Riya", 92),
            new Student("Karan", 60),
            new Student("Simran", 75)
        );

        System.out.println("Students with marks > 70 (Sorted by marks descending):");
        students.stream()
                .filter(s -> s.marks > 70)
                .sorted((s1, s2) -> s2.marks - s1.marks)
                .forEach(System.out::println);


        // ===================== Part (c): Stream Operations on Products =====================
        System.out.println("\n=== Part (c): Stream Operations on Product Dataset ===");
        List<Product> products = Arrays.asList(
            new Product(1, "Laptop", 60000),
            new Product(2, "Mouse", 700),
            new Product(3, "Keyboard", 1500),
            new Product(4, "Monitor", 12000)
        );

        // Filter products with price > 1000
        System.out.println("Products priced above 1000:");
        products.stream()
                .filter(p -> p.price > 1000)
                .forEach(System.out::println);

        // Find average price
        double avgPrice = products.stream()
                                  .mapToDouble(p -> p.price)
                                  .average()
                                  .orElse(0);
        System.out.println("\nAverage Price: " + avgPrice);

        // Find most expensive product
        Product maxProduct = products.stream()
                                     .max(Comparator.comparingDouble(p -> p.price))
                                     .get();
        System.out.println("Most Expensive Product: " + maxProduct);
    }
}
