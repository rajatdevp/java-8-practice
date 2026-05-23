package in.rajat.level_1.day_11;

import java.util.List;
import java.util.Optional;

public class FirstAndLast {

    public static void main(String[] args) {

        List<Integer> list = List.of(10, 20, 30, 40, 50);
        // Find Last
        //Option 1
        Optional<Integer> result1 = list.stream()
                .skip(list.size()-1)
                .findFirst();
        result1.ifPresent(System.out::println);//50

        Optional<Integer> result2 = list.stream()
                 .reduce((first, second) -> second);

        //Option 1
        result2.ifPresent(System.out::println);//50

        //Find First
        Optional<Integer> result3 = list.stream().findFirst();

        result3.ifPresent(System.out::println);//10
    }
}
