package in.rajat.level_5_object.day_9;

import in.rajat.level_5_object.utils.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class CovertMap {

    public static void main(String[] args) {

        Map<String, List<String>> result = EMPLOYEES.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.toList(),
                el-> el.stream()
                        .map(Employee::getName)
                        .collect(Collectors
                                .toList())
                )));

        System.out.println(result);
    }
}
