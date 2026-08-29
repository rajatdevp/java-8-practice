package in.rajat.level_5_object.day_11;

import in.rajat.level_5_object.utils.Employee;

import java.util.Comparator;
import java.util.Optional;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class HighestSalaryToExperienceRatio {

    public static void main(String[] args) {
      Optional<Employee> result = EMPLOYEES.stream()
                .max(Comparator.comparingDouble(e -> e.getSalary() / e.getExperience()));

      result.ifPresent(System.out::println);
    }
}