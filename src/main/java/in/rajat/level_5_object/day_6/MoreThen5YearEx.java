package in.rajat.level_5_object.day_6;

import in.rajat.level_5_object.utils.Employee;

import java.time.LocalDate;
import java.util.List;

import static in.rajat.level_5_object.utils.Employee.EMPLOYEES;

public class MoreThen5YearEx {

    public static void main(String[] args) {
      List<Employee> result =  EMPLOYEES.stream().map(emp->{
            emp.setExperience(emp.getExperience() + LocalDate.now().getYear() - emp.getJoiningDate().getYear());
            return emp;}).filter(emp->emp.getExperience()>15).toList();

      System.out.println(result);
      System.out.println(result.size());
     ///EMPLOYEES is mutated 6 + (2026 - 2020)
     /// = 6 + 6
     /// = 12
     /// if you need consisted result run one by one
      List<Employee> result2 =EMPLOYEES.stream().filter(emp-> {
          emp.setExperience(emp.getExperience() + LocalDate.now().getYear()-emp.getJoiningDate().getYear());
          return emp.getExperience()>15;
      }).toList();

      System.out.println(result2);
      System.out.println(result2.size());
    }
}
