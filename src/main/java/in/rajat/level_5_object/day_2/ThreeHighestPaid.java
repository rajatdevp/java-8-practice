package in.rajat.level_5_object.day_2;

import in.rajat.level_5_object.utils.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class ThreeHighestPaid {

    public static void main(String[] args) {

        List<Employee> result = EMPLOYEES.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .reversed())
                .limit(3)
                .toList();

        System.out.println(result);

        PriorityQueue<Employee> priorityQueue = new PriorityQueue<>(Comparator.comparingDouble(Employee::getSalary));


        for (Employee emp : EMPLOYEES) {
            priorityQueue.offer(emp);
            if (priorityQueue.size() > 3) {
                priorityQueue.poll();
            }
        }

        List<Employee> resultr = priorityQueue.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .toList();
        System.out.println(resultr);

        List<Employee> resultTop5 = EMPLOYEES.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(5)
                .toList();

        System.out.println(resultTop5);
    }
}
