package in.rajat.level_5_object.day_5;

import in.rajat.level_5_object.utils.Employee;

import java.util.List;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class FilterByCity {

    public static void main(String[] args) {

      List<Employee> result = EMPLOYEES.stream()
              .filter(emp -> emp.getCity().equals("Bangalore"))
              .toList();
      System.out.println(result);
      System.out.println(result.size());
    }
}
