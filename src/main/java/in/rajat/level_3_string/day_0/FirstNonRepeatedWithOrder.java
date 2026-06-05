package in.rajat.level_3_string.day_0;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedWithOrder {

    public static void main(String[] args){

      String str = "JavaGuides";

     String result = Arrays.stream(str.split(""))
             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
             .entrySet()
             .stream()
             .filter(strSet -> strSet.getValue()==1)
             .findFirst()
             .get().getKey();

     System.out.println(result);//J

        String result1 = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(strSet -> strSet.getValue()==1)
                .findFirst()
                .get().getKey();

     System.out.println(result1);//s
    }

}
