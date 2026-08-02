package in.rajat.level_5_object.day_6;

import in.rajat.level_5_object.utils.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class GroupByJoiningYear {
    public static void main(String[] args) {

      Map<Integer, List<Employee>> result =  EMPLOYEES.stream()
              .collect(Collectors.groupingBy(emp-> emp.getJoiningDate().getYear()));

      System.out.println(result);
    }
}
