package in.rajat.level_5_object.day_4;

import in.rajat.level_5_object.utils.Employee;

import java.util.Map;
import java.util.stream.Collectors;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class CountMaleFemale {

    public static void main(String[] args) {

       Map<String, Long> result =  EMPLOYEES.stream()
               .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

       System.out.println(result);
    }
}
