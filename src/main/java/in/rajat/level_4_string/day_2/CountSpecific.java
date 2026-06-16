package in.rajat.level_4_string.day_2;

import java.util.Arrays;
//Count occurrences of a specific substring
public class CountSpecific {

    public static void main(String[] args){

        String str = "Java is great. Java is awesome";// substring="Java"

       long result = Arrays.stream(str.split(" "))
               .filter(s-> s.equals("Java"))
               .count();

        long correct = Arrays.stream(str.split("\\s+"))//can remove multiple space
                        .filter("Java"::equals)//null handle
                        .count();

       System.out.println(result);
       System.out.println(correct);
    }
}
