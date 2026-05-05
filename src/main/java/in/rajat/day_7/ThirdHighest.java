package in.rajat.day_7;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ThirdHighest {

    public  static void main(String[] arg){

        List<Integer> nums =  List.of(75, 50, 65, 35, 20, 65, 10);

        Consumer<Integer> printConsumer = System.out::println;

        Optional<Integer>  optionalResult = nums.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst();

        optionalResult.ifPresent(printConsumer);

    }
}
