package in.rajat.day_12;

import java.util.List;

//Find count of numbers greater than average
public class CountGreaterThenAvg {

    public static void main(String[] args){

        List<Integer> list = List.of(10, 20, 30, 40, 50);
        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average: "+avg);

        long count = list.stream().filter(num -> num > avg).count();
        System.out.println("Count: "+count);

    }
}
