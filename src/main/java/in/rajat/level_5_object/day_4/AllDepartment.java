package in.rajat.level_5_object.day_4;

import in.rajat.level_5_object.utils.Employee;

import java.util.List;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class AllDepartment {
    public static void main(String[] args) {

       List<String> result = EMPLOYEES.stream().map(Employee::getDepartment).toList();

       System.out.println(result);
    }
}
