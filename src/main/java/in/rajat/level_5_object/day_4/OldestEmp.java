package in.rajat.level_5_object.day_4;

import in.rajat.level_5_object.utils.Employee;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class OldestEmp {

    public static void main(String[] args) {

       Employee result = EMPLOYEES.stream()
               .max(Comparator.comparingInt(Employee::getAge))
               .orElse(null);

       System.out.println(result);

      Map<String, Optional<Employee>>  result1 = EMPLOYEES.stream()
              .collect(Collectors.groupingBy(Employee::getDepartment,
                      Collectors.maxBy(Comparator.comparingInt(Employee::getAge))));
      System.out.println(result1);


    }
}
