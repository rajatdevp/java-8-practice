package in.rajat.level_5_object.day_6;

import in.rajat.level_5_object.utils.Employee;

import java.util.Comparator;
import java.util.Optional;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class MostExperienced {

    public static void main(String[] args) {

      Optional<Employee> result =  EMPLOYEES.stream()
              .max(Comparator.comparingInt(Employee::getExperience));

      result.ifPresent(System.out::println);
    }
}
