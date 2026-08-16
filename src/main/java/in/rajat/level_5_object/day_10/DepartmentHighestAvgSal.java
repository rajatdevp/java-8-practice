package in.rajat.level_5_object.day_10;

import in.rajat.level_5_object.utils.Employee;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class DepartmentHighestAvgSal {

    public static void main(String[] args) {

       Optional<Map.Entry<String, Double>> result = EMPLOYEES.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)))
                .entrySet()
               .stream()
               .max(Comparator.comparingDouble(Map.Entry::getValue));

       result.ifPresent(System.out::println);
    }
}
