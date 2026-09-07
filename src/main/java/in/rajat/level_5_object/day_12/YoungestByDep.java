package in.rajat.level_5_object.day_12;

import in.rajat.level_5_object.utils.Employee;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class YoungestByDep {

    public static void main(String[] args) {

        Map<String, Optional<Employee>> result =EMPLOYEES.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .min(Comparator.comparingDouble(Employee::getSalary)))));

        System.out.println(result);

        Map<String, Optional<Employee>> result2 = EMPLOYEES.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));

        System.out.println(result2);


    }
}
