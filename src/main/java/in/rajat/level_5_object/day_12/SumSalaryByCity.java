package in.rajat.level_5_object.day_12;

import in.rajat.utils.Employee;

import java.util.Map;
import java.util.stream.Collectors;

import static in.rajat.utils.Employee.EMPLOYEES;

public class SumSalaryByCity {

    public static void main(String[] args) {

       Map<String, Double> result = EMPLOYEES.stream()
                .collect(Collectors.groupingBy(
                        Employee::getCity,
                        Collectors.summingDouble(Employee::getSalary)));

       System.out.println(result);

    }
}
