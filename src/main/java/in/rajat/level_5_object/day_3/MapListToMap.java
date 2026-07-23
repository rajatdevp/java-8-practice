package in.rajat.level_5_object.day_3;

import in.rajat.level_5_object.utils.Employee;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class MapListToMap {

    public static void main(String[] args) {

        EMPLOYEES.stream().collect(Collectors.groupingBy(Employee::getId))
    }
}
