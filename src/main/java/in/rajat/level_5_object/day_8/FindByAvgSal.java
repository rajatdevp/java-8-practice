package in.rajat.level_5_object.day_8;

import in.rajat.level_5_object.utils.Employee;

import java.util.List;
import java.util.stream.Collectors;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class FindByAvgSal {

    public static void main(String[] args) {

        double avg = EMPLOYEES.stream().mapToDouble(Employee::getSalary).average().orElseThrow();
        List<Employee> result = EMPLOYEES.stream().filter(emp-> emp.getSalary()> avg ).toList();

        System.out.println(result);

        List<Employee> result2 = EMPLOYEES.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            double avg2 = list.stream()
                                    .mapToDouble(Employee::getSalary)
                                    .average()
                                    .orElse(0);

                            return list.stream()
                                    .filter(e -> e.getSalary() > avg2)
                                    .toList();
                        }));

        System.out.println(result2);

    }
}
