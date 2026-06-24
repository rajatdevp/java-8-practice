package in.rajat.level_4_string.day_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseOrder {

    public static void main(String[] args){

        String str = "Java 8 Streams are powerful";

       String re = String.join(" ", Arrays.asList(str.split("\\s+")).reversed());
       String result =  Arrays.stream(str.split("\\s+"))
               .collect(
                       Collectors.collectingAndThen(Collectors.toList(),
                               list-> list.reversed().stream().collect(Collectors.joining(" "))));

       System.out.println(re);
       System.out.println(result);

    }
}
