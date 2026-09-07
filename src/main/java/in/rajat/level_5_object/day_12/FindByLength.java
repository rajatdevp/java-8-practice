package in.rajat.level_5_object.day_12;

import in.rajat.level_5_object.utils.Employee;

import java.util.List;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class FindByLength {

    public static void main(String[] args) {

       List<String> result = EMPLOYEES.stream()
                .map(Employee::getName)
                .filter(name -> name.length() > 5)
                .toList();
       System.out.println(result);
    }
}
