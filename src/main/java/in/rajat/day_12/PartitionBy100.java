package in.rajat.day_12;

import java.util.List;
import java.util.stream.Collectors;

//Partition numbers into >100 and <=100
public class PartitionBy100 {

    public static void main(String[] args) {

        var numbers = List.of(50, 150, 30, 200, 80, 120);
        numbers.stream().collect(Collectors.partitioningBy(num -> num > 100))
                .forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
