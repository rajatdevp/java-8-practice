package in.rajat.day_8;

import java.util.Comparator;
import java.util.List;

public class TopFive {
    public static void main(String[] arg){
        List<Integer> list = List.of(5, 15, 25, 35, 45, 55, 65, 75);
        List<Integer> result = list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(5).toList();

        System.out.println(result);

    }
}
