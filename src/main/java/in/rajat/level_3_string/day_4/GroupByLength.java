package in.rajat.level_3_string.day_4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {

    public static void main(String[] args){

        List<String> list = List.of("a","bb","ccc","dddd","eeee");

        Map<Integer, List<String>> result = list.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(result);
    }
}
