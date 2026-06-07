package in.rajat.level_3_string.day_1;

import java.util.List;
import java.util.stream.Collectors;

public class StringJoin {

    public static void main(String[] args){
        List<String> soc  = List.of("Facebook","Twitter","YouTube","Instagram");

        String result = soc.stream()
                .collect(Collectors.joining(", ", "[","]"));
        //concatenates the input elements
        // delimiter – the delimiter to be used between each element
        // prefix – the sequence of characters to be used at the beginning of the joined result
        // suffix – the sequence of characters to be used at the end of the joined result

        System.out.println(result);
        //[Facebook, Twitter, YouTube, Instagram]
    }
}
