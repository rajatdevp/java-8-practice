package in.rajat.level_5_object.day_9;

import in.rajat.level_5_object.utils.Employee;

import java.util.Comparator;
import java.util.Optional;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class SecondOldestEmp {

    public static void main(String[] args) {

       Optional<Employee> result = EMPLOYEES.stream()
               .sorted(Comparator.comparing(Employee::getJoiningDate).reversed())
               .skip(1)
               .findFirst();

       result.ifPresent(System.out::println);

        Optional<Employee> result2 = EMPLOYEES.stream()
                .sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .skip(1)
                .findFirst();

        result2.ifPresent(System.out::println);
    }
}
