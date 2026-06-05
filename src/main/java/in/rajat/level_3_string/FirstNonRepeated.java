package in.rajat.level_3_string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {

    public static void main(String[] args){

      String str = "JavaGuides";

     String result = Arrays.stream(str.split(""))
             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
             .entrySet()
             .stream()
             .findFirst()
             .get().getKey();

     System.out.println(result);


    }

}
