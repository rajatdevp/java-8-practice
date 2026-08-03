package in.rajat.level_5_object.day_7;

import in.rajat.level_5_object.utils.Employee;

import java.util.Map;
import java.util.stream.Collectors;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class AverageAgePreDep {

    public static void main(String[] args) {

     Map<String, Double> result = EMPLOYEES.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getAge)));

     System.out.println(result);
    }
}
