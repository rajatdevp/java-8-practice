package in.rajat.level_5_object.day_4;

import in.rajat.level_5_object.utils.Employee;

import java.util.Comparator;
import java.util.Optional;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class YoungestEmp {

    public static void main(String[] args) {

       Optional<Employee> result = EMPLOYEES.stream()
               .min(Comparator.comparingInt(Employee::getAge));

       result.ifPresent(System.out::println);
    }
}
