package in.rajat.level_5_object.day_3;

import in.rajat.level_5_object.utils.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class MapListToMap {

    public static void main(String[] args) {

       Map<Integer, String> result =  EMPLOYEES.stream()
               .collect(Collectors.toMap(
                       Employee::getId,
                       Employee::getName, //just Exception in thread "main" java.lang.IllegalStateException: Duplicate key 101
                       (existing, duplicate) -> duplicate));//for last duplicate
                       //

       System.out.println(result);

        Map<Integer, List<String>> result2 = EMPLOYEES.stream()
                .collect(Collectors.groupingBy(
                        Employee::getId,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));//if result need to be list of all names

        System.out.println(result2);

    }
}
