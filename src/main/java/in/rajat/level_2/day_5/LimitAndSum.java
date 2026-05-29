package in.rajat.level_2.day_5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LimitAndSum {

        List<Integer> nums = IntStream.rangeClosed(10, 20).boxed().collect(Collectors.toList());

        public static void main(String [] args){

            LimitAndSum l = new LimitAndSum();
            int result = l.nums.stream()
                    .limit(5)
                    .reduce(0,(a,b)->a+b);

            System.out.println(result);
        }

}
