package in.rajat.level_5_object.day_13;

import in.rajat.utils.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static in.rajat.utils.Employee.EMPLOYEES;

public class GroupAndSort {
    public static void main(String[] args) {
        // Grouping and sorting logic will go here
    Map<String, List<Employee>> result = EMPLOYEES.stream()
            .collect(Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.collectingAndThen(
                            Collectors.toList(), list -> list.stream()
                            .sorted(Comparator.comparingDouble(
                                    Employee::getSalary)
                                    .reversed())
                                    .toList())));

    System.out.println(result);
    }
}
