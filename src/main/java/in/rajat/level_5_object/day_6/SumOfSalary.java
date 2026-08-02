package in.rajat.level_5_object.day_6;

import in.rajat.level_5_object.utils.Employee;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class SumOfSalary {

    public static void main(String[] args) {

        Double sum = EMPLOYEES.stream().mapToDouble(Employee::getSalary).sum();

        System.out.println(sum);
    }
}
