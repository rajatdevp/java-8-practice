package in.rajat.level_5_object.day_8;

import in.rajat.level_5_object.utils.Employee;

import java.util.Map;
import java.util.stream.Collectors;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class GroupByGenderAndSalary {

    public static void main(String[] args) {

       Map<String, Double> result =  EMPLOYEES.stream().collect(Collectors.groupingBy(
                Employee::getGender,
                Collectors.averagingDouble(
                        Employee::getSalary)));

       System.out.println(result);
    }
}
