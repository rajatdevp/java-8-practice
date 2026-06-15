package in.rajat.level_4_string.day_2;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {
    public static void main(String[] args){

      String string = "java guides java concept";

      Optional<java.util.Map.Entry<String, Long>> result = Arrays.stream(string.split(" "))
                      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                              .entrySet().stream().filter(node -> node.getValue()==1)
                      .findFirst();

      result.ifPresent(System.out::println);
    }
}
