package in.rajat.level_4_string.day_2;

import java.util.Arrays;
//Count occurrences of a specific substring
public class CountSpecific {

    public static void main(String[] args){

        String str = "Java is great. Java is awesome";

       long result = Arrays.stream(str.split(" "))
               .filter(s-> s.equals("Java"))
               .count();
       System.out.println(result);
    }
}
