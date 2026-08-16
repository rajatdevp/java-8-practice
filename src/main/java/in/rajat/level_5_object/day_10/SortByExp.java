package in.rajat.level_5_object.day_10;

import in.rajat.level_5_object.utils.Employee;

import java.util.Comparator;
import java.util.List;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class SortByExp {

    public static void main(String[] args) {

       List<Employee> result = EMPLOYEES.stream().sorted(
                Comparator.comparingInt(Employee::getExperience)
                        .reversed())
                .toList();

       for (Employee employee : result) {
           System.out.println(employee);
       }
    }
}
