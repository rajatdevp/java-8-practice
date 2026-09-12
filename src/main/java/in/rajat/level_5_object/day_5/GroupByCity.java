package in.rajat.level_5_object.day_5;

import in.rajat.utils.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static in.rajat.utils.Employee.EMPLOYEES;

public class GroupByCity {

    public static void main(String[] args) {

       Map<String, List<Employee>> result = EMPLOYEES.stream()
               .collect(Collectors.groupingBy(Employee::getCity));
       System.out.println(result);
    }
}
