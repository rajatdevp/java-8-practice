package in.rajat.level_5_object.day_2;

import in.rajat.level_5_object.utils.Employee;

import java.util.List;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class EmpFilterWithSalary {

    public static void main(String[] args) {

        List<Employee> result = EMPLOYEES.stream()
                .filter(employee -> employee.getSalary()>50000 && employee.getAge()<35)
                .toList();

        System.out.println(result);

    }
}
