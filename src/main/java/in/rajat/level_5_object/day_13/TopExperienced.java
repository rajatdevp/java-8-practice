package in.rajat.level_5_object.day_13;

import in.rajat.level_5_object.utils.Employee;

import java.util.Comparator;
import java.util.List;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class TopExperienced {

    public static void main(String[] args) {

        List<Employee> result = EMPLOYEES.stream()
                .sorted(Comparator.comparingInt(Employee::getExperience).reversed())
                .limit(2).toList();

        System.out.println(result);
    }
}
