package in.rajat.level_5_object.day_7;

import in.rajat.utils.Employee;

import java.util.Map;
import java.util.stream.Collectors;

import static in.rajat.utils.Employee.EMPLOYEES;

public class AverageAgePreDep {

    public static void main(String[] args) {

     Map<String, Double> result = EMPLOYEES.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingInt(Employee::getAge)));

     System.out.println(result);
    }
}
