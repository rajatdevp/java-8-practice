package in.rajat.level_5_object.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    int id;
    String name, department, city, gender;
    double salary;
    int age, experience;
    private LocalDate joiningDate;


    // Reusable formatter instance
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static final List<Employee> EMPLOYEES = List.of(
            new Employee(101, "Rajat", "IT", "Bangalore", "Male", 85000, 29, 6, date("15-06-2020")),
            new Employee(102, "Priya", "HR", "Hyderabad", "Female", 60000, 27, 4, date("10-08-2022")),
            new Employee(103, "Amit", "Finance", "Pune", "Male", 75000, 32, 8, date("01-04-2018")),
            new Employee(104, "Neha", "IT", "Delhi", "Female", 95000, 30, 7, date("20-09-2019")),
            new Employee(105, "Rahul", "Sales", "Delhi", "Male", 55000, 26, 3, date("05-05-2026")),
            new Employee(106, "Sneha", "Marketing", "Chennai", "Female", 70000, 31, 6, date("11-11-2020")),
            new Employee(107, "Vikas", "IT", "Bangalore", "Male", 105000, 35, 10, date("15-03-2016")),
            new Employee(108, "Anjali", "Finance", "Jaipur", "Female", 80000, 28, 5, date("18-07-2021"))
    );
    public static final List<Employee> UNSTRUCTURED_EMPLOYEES = List.of(

            new Employee(101, "Rajat", "IT", "Bangalore", "Male", 85000, 29, 6, date("15-06-2020")),
            new Employee(102, "Priya", "HR", "Hyderabad", "Female", 60000, 27, 4, date("10-08-2022")),
            new Employee(103, "Amit", "Finance", "Pune", "Male", 75000, 32, 8, date("01-04-2018")),

            // Duplicate name
            new Employee(104, "Rajat", "IT", "Delhi", "Male", 90000, 30, 7, date("20-09-2019")),

            // Null name
            new Employee(105, null, "Sales", "Mumbai", "Male", 55000, 26, 3, date("05-01-2023")),

            // Blank name
            new Employee(106, "", "Marketing", "Chennai", "Female", 70000, 31, 6, date("11-11-2020")),

            // Spaces in name
            new Employee(107, "  Meena  ", " HR ", " Bangalore ", "Female", 62000, 27, 4, date("12-12-2021")),

            // Null department
            new Employee(108, "Anjali", null, "Jaipur", "Female", 80000, 28, 5, date("18-07-2021")),

            // Blank department
            new Employee(109, "Vikas", "", "Bangalore", "Male", 105000, 35, 10, date("15-03-2016")),

            // Lowercase department
            new Employee(110, "Arjun", "it", "Bangalore", "Male", 91000, 28, 5, date("25-10-2020")),

            // Null city
            new Employee(111, "John", "Support", null, "Male", 45000, 24, 1, date("01-01-2024")),

            // Blank city
            new Employee(112, "Alice", "Support", "", "Female", 47000, 25, 2, date("15-05-2023")),

            // Zero salary
            new Employee(113, "Rohan", "IT", "Delhi", "Male", 0, 23, 1, date("01-02-2025")),

            // Negative salary
            new Employee(114, "Pooja", "Finance", "Jaipur", "Female", -1000, 30, 6, date("15-08-2019")),

            // Zero age
            new Employee(115, "Karan", "IT", "Noida", "Male", 72000, 0, 4, date("01-07-2022")),

            // Negative experience
            new Employee(116, "Sneha", "HR", "Pune", "Female", 65000, 29, -1, date("20-04-2023")),

            // Future joining date
            new Employee(117, "David", "DevOps", "Hyderabad", "Male", 98000, 30, 5, date("01-01-2030")),

            // Very high salary
            new Employee(118, "CEO", "Management", "Mumbai", "Male", 1_000_000, 50, 25, date("01-01-2005")),

            // Duplicate ID
            new Employee(101, "DuplicateId", "IT", "Bangalore", "Male", 88000, 29, 6, date("01-01-2021"))
    );

    private static LocalDate date(String date) {
        return LocalDate.parse(date, FORMATTER);
    }
}
