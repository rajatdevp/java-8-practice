package in.rajat.level_4_string.day_1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesByFreq {

    public static void main(String[] args){

        String str = "java is fun java is powerful";

        Map<String, Long> result = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(node-> node.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(result);
    }
}
