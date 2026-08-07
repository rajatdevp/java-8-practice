package in.rajat.level_5_object.day_8;

import in.rajat.level_5_object.utils.Employee;

import java.time.LocalDate;
import java.util.List;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class JoinedLastSix {

    public static void main(String[] args) {
    List<Employee> result =  EMPLOYEES.stream()
                .filter(emp->
                        emp.getJoiningDate()
                                .isAfter(
                                        LocalDate.now()
                                                .minusMonths(6)))
                .toList();

    System.out.println(result);
    }
}
