package in.rajat.level_5_object.day_10;

import in.rajat.level_5_object.utils.Employee;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class FilterAndSum {

    public static void main(String[] args) {

       Double result = EMPLOYEES.stream()
                .filter(emp-> emp.getCity().equals("Bangalore"))
                .mapToDouble(Employee::getSalary)
                .sum();

       System.out.println(result);
    }
}
