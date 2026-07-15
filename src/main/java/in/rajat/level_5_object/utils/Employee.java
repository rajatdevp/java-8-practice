package in.rajat.level_5_object.utils;

import java.util.List;

public class Employee {

    int id;
    String name, department, city, gender;
    double salary;
    int age, experience;

    public Employee() {
    }
    public Employee(int id, String name, String department, String city, String gender, double salary, int age, int experience) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.salary = salary;
        this.age = age;
        this.experience = experience;
    }

    public static final List<Employee> EMPLOYEES = List.of(
            new Employee(101, "Rajat", "IT", "Bangalore","Male", 85000, 29, 6),
            new Employee(102, "Priya", "HR", "Hyderabad","Female", 60000, 27, 4),
            new Employee(103, "Amit", "Finance", "Pune","Male", 75000, 32, 8),
            new Employee(104, "Neha", "IT", "Delhi", "Female", 95000, 30, 7),
            new Employee(105, "Rahul", "Sales", "Delhi", "Male", 55000, 26, 3),
            new Employee(106, "Sneha","Marketing", "Chennai","Female", 70000, 31, 6),
            new Employee(107, "Vikas", "IT", "Bangalore", "Male", 105000, 35, 10),
            new Employee(108, "Anjali", "Finance", "Jaipur","Female", 80000, 28, 5)
    );

    public static final List<Employee> UNSTRUCTUREDEMPLOYEES = List.of(

            // Normal Records
            new Employee(101, "Rajat", "IT", "Bangalore", "Male", 85000, 29, 6),
            new Employee(102, "Priya", "HR", "Hyderabad", "Female", 60000, 27, 4),
            new Employee(103, "Amit", "Finance", "Pune", "Male", 75000, 32, 8),

            // Duplicate Department
            new Employee(104, "Neha", "IT", "Delhi", "Female", 95000, 30, 7),

            // Duplicate Name
            new Employee(105, "Rajat", "Sales", "Mumbai", "Male", 55000, 26, 3),

            // Null Name
            new Employee(106, null, "Marketing", "Chennai", "Female", 70000, 31, 6),

            // Empty Department
            new Employee(107, "Vikas", "", "Bangalore", "Male", 105000, 35, 10),

            // Null Department
            new Employee(108, "Anjali", null, "Pune", "Female", 80000, 28, 5),

            // Empty City
            new Employee(109, "Karan", "IT", "", "Male", 90000, 33, 9),

            // Null City
            new Employee(110, "Sneha", "HR", null, "Female", 65000, 29, 5),

            // Zero Salary
            new Employee(111, "John", "Support", "Noida", "Male", 0, 24, 1),

            // Negative Salary (Bad Data)
            new Employee(112, "Alice", "Support", "Noida", "Female", -1000, 25, 2),

            // Age = 0 (Invalid)
            new Employee(113, "Rohan", "IT", "Delhi", "Male", 72000, 0, 4),

            // Negative Experience
            new Employee(114, "Pooja", "Finance", "Jaipur", "Female", 82000, 30, -1),

            // Different Case Department
            new Employee(115, "Arjun", "it", "Bangalore", "Male", 91000, 28, 5),

            // Leading/Trailing Spaces
            new Employee(116, "  Meena  ", " HR ", " Bangalore ", "Female", 62000, 27, 4)

    );

}
