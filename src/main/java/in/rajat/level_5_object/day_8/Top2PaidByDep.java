package in.rajat.level_5_object.day_8;

import in.rajat.level_5_object.utils.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class Top2PaidByDep {

    public static void main(String[] args){

     Map<String, List<Employee>> result = EMPLOYEES.stream()
             .collect(Collectors.groupingBy(
                     Employee::getDepartment,
                     Collectors.collectingAndThen(
                             Collectors.toList(),
                             list-> list.stream()
                                .sorted(Comparator.comparingDouble(Employee::getSalary)
                                        .reversed())
                                     .limit(2)
                                     .toList()
                )));


     result.forEach((department,employees) -> System.out.println(department+"-> "+employees));
    }
}
