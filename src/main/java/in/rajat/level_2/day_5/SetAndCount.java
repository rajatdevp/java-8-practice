package in.rajat.level_2.day_5;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SetAndCount {

     public static void main(String[] args) {
         List<Integer> list = List.of(10,20,10,30,20,40);

         long result = list.stream().collect(Collectors.toCollection(HashSet::new)).size();
         long result1 = new HashSet<>(list).size();
         long result3 = list.stream().collect(Collectors.toSet()).stream().count();

         System.out.println(result);
         System.out.println(result1);
         System.out.println(result3);
     }
}
