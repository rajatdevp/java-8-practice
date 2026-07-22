package in.rajat.level_5_object.day_3;

import in.rajat.level_5_object.utils.Employee;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class DepartmentSecondHighest {

        public static  void main(String[] args) {

          Map<String, Double> result = EMPLOYEES.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                    Collectors.collectingAndThen(Collectors.toList()
                            ,list -> list.stream()
                                    .map(Employee::getSalary)
                                    .sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0.0d))));

          System.out.println(result);
        }
}
