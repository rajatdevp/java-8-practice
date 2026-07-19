package in.rajat.level_5_object.day_2;

import in.rajat.level_5_object.utils.Employee;

import java.util.Comparator;
import java.util.List;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class DescendingBySalaryAndName {

public static void main(String[] args) {

   List<Employee> result =  EMPLOYEES.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary)
                    .thenComparing(Employee::getName).reversed())
            .toList();

   System.out.println(result);
}
}
