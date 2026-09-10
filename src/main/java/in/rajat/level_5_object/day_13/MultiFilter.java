package in.rajat.level_5_object.day_13;

import in.rajat.level_5_object.utils.Employee;

import java.util.List;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class MultiFilter {

    public static void main(String[] args) {

        List<Employee> result =EMPLOYEES.stream()
                .filter(employee -> employee.getGender().equals("Male"))
                .filter(employee -> employee.getCity().equals("Bangalore"))
                .toList();

        System.out.println(result);
    }
}