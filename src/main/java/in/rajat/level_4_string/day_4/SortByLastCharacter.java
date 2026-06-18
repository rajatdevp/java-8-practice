package in.rajat.level_4_string.day_4;

import java.util.List;

public class SortByLastCharacter {

    public static void main(String[] args){

        List<String> words = List.of("\"apple\", \"banana\", \"cherry\", \"date\"");

        System.out.println(words);

       List<String> result = words.stream().sorted((a,b) -> a.charAt(a.length()-1)+"".compareTo(b.charAt(b.length()-1)+"")).toList();

    System.out.println(result);
    }
}
