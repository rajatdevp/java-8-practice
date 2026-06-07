package in.rajat.level_3_string.day_1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEach {

    public static void main(String[] args){

        String str = "Hello World Java";
        String result =  Arrays.stream(str.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(result);

    }
}
