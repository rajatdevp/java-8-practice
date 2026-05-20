package in.rajat.day_13;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
//Convert List<Integer> to Set<Integer>
public class ConvertListToSet {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 10, 30, 20);

        Set<Integer> result = list.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toSet());

        System.out.println(result);//[20, 10, 30]
    }
}
