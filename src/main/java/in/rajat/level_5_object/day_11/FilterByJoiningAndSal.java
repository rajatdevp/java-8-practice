package in.rajat.level_5_object.day_11;

import in.rajat.level_5_object.utils.Employee;

import java.util.List;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class FilterByJoiningAndSal {

    public static void main(String[] args) {

       List<Employee> result = EMPLOYEES.stream()
               .filter(emp->
                       (emp.getSalary()>90000
                               && emp.getJoiningDate()
                               .getYear()<2020))// better emp.isBefore(LocalDate.of(2020,1,1));
               .toList();

       for (Employee employee : result) System.out.println(employee);
    }
}
