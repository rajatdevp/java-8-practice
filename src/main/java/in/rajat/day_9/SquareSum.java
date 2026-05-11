package in.rajat.day_9;


import java.util.List;
import java.util.Optional;
import java.util.function.Function;

//Find sum of squares of all numbers
public class SquareSum {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        Function<Integer, Integer> squareFun = num -> num * num;

        Optional<Integer> result = nums.stream()
                .map(squareFun)
                .reduce(Integer::sum);

        System.out.println(result.orElse(null));
        //55
    }
}
