package in.rajat.level_5_object.day_1;

import in.rajat.level_5_object.utils.Employee;

import java.util.Map;
import java.util.stream.Collectors;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;
import static in.rajat.level_5_object.utils.Employee.UNSTRUCTURED_EMPLOYEES;

public class DepartmentAvgSal {

    public static void main(String[] args) {

      Map<String,Double> result =  EMPLOYEES.stream()
              .collect(Collectors.groupingBy(Employee::getDepartment,
              Collectors.averagingDouble(Employee::getSalary)));

      System.out.println(result);

        Map<String, Double> resultsInterView = UNSTRUCTURED_EMPLOYEES.stream()
                .filter(e -> e.getDepartment() != null)
                .map(e -> {
                    e.setDepartment(e.getDepartment().trim());
                    return e;
                })
                .filter(e -> !e.getDepartment().isEmpty())
                .collect(Collectors.groupingBy(
                        e -> e.getDepartment().toUpperCase(),
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        System.out.println(resultsInterView);
    }
}
