package in.rajat.level_5_object.day_10;

import in.rajat.utils.Employee;

import static in.rajat.utils.Employee.EMPLOYEES;

public class FilterAndSum {

    public static void main(String[] args) {

       Double result = EMPLOYEES.stream()
                .filter(emp-> "Bangalore".equals(emp.getCity()))
                .mapToDouble(Employee::getSalary)
                .sum();

       System.out.println(result);
    }
}
