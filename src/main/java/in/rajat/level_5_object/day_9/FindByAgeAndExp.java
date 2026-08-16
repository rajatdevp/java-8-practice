package in.rajat.level_5_object.day_9;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class FindByAgeAndExp {

    public static void main(String[] args) {

        EMPLOYEES.stream().filter(emp-> emp.getExperience()/2 == emp.getAge())
                .forEach(System.out::println);
    }
}
