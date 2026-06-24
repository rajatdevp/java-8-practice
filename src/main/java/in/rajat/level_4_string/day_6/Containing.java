package in.rajat.level_4_string.day_6;

import java.util.List;

public class Containing {

    public static void main(String[] args) {

        List<String> words = List.of("java8", "streamapi", "java17", "guides");
        List<String> result =words.stream().filter(s->s.contains("java") ).toList();
        System.out.println(result);
    }
}
