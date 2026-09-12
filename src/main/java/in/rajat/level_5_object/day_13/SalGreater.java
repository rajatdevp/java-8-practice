package in.rajat.level_5_object.day_13;

import in.rajat.utils.Employee;

import java.util.List;

import static in.rajat.utils.Employee.EMPLOYEES;

public class SalGreater {

    public static void main(String[] args) {

       List<Employee> result = EMPLOYEES.stream()
                .filter(emp-> emp.getSalary() > 100000)
                .toList();

       System.out.println(result);
    }
}
