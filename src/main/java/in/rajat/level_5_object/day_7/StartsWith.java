package in.rajat.level_5_object.day_7;

import in.rajat.level_5_object.utils.Employee;

import java.util.List;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class StartsWith {

    public static void main(String[] args) {

      List<Employee> result =  EMPLOYEES.stream()
              .filter(emp-> emp.getName().startsWith("A"))
              .toList();

      System.out.println(result);
    }
}
