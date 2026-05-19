package in.rajat.day_13;

import java.util.List;

public class ConvertIntegerToStringStream {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<String> result = numbers.stream()
                .map(String::valueOf)
                .toList();

        System.out.println(result);
    }
}
