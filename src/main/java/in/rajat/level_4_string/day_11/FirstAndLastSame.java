package in.rajat.level_4_string.day_11;

import java.util.List;

public class FirstAndLastSame {

    public static void main(String[] args){

        List<String> list = List.of("radar", "level", "hello", "kayak");

        List<String> result = list.stream()
                .filter(s-> s.charAt(0)== s.charAt(s.length()-1))
                .toList();

        System.out.println(result);
    }
}
