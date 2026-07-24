package in.rajat.level_5_object.day_4;

import in.rajat.level_5_object.utils.Employee;

import java.util.Comparator;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class OldestEmp {

    public static void main(String[] args) {

       Employee result = EMPLOYEES.stream()
               .max(Comparator.comparingInt(Employee::getAge))
               .orElse(null);

       System.out.println(result);


    }
}
