package in.rajat.level_2.day_5;

import java.util.List;

public class SumFirst5Odd {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        int result = list.stream()
                .filter(n -> n%2 != 0)
                .limit(5)
                .reduce(0, Integer::sum);

        System.out.println(result);
        //25
    }
}
