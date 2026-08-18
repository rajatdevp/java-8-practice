package in.rajat.level_5_object.day_11;

import in.rajat.level_5_object.utils.Employee;

import java.util.Map;
import java.util.stream.Collectors;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class GroupByDepartmentAndCountByFilter_188 {

    public static void main(String[] args) {

       Map<String, Long> result = EMPLOYEES.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list ->
                                        list.stream()
                                                .filter(
                                                        emp-> emp.getSalary()>30000).count())));
       System.out.println(result);

      Map<String, Long> resultBetter = EMPLOYEES.stream()
               .collect(Collectors.groupingBy(
                       Employee::getDepartment,
                       Collectors.filtering(empList-> empList.getSalary()>30000,
                               Collectors.counting())));

      System.out.println(resultBetter);

        Map<String, Long> resultOnlyJava8 = EMPLOYEES.stream()
              .filter(employee ->employee.getSalary()>30000)
              .collect(Collectors.groupingBy(
                      Employee::getDepartment,
                      Collectors.counting()));

        System.out.println(resultOnlyJava8);
    }
}
