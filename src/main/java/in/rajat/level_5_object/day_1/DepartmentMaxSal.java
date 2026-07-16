package in.rajat.level_5_object.day_1;

import in.rajat.level_5_object.utils.Employee;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class DepartmentMaxSal {

    public static void main(String[] args){
      Map<String, Optional<Employee>> result =  EMPLOYEES.stream()
              .collect(Collectors.groupingBy(Employee::getDepartment,
                      Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

      System.out.println(result);
    }
}
