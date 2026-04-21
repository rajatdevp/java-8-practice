package in.rajat.day_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OddNumber {
    public static void main(String[] args) {

       IntStream intStream = IntStream.rangeClosed(1,100);
       intStream.filter(n -> n%2!=0).forEach(System.out::println);

       // List<Integer> toList = intStream.filter(n -> n%2!=0).boxed().collect(Collectors.toList()); #not possible because intStream is already consumed.
       //intStream.filter(n -> n%2!=0).boxed().toList();
       List<Integer> toList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       List<Integer> oddList = toList.stream().filter(n -> n%2==0).collect(Collectors.toList());
       oddList.add(11);// possible because collect(Collectors.toList()) return Mutability
       List<Integer> oddListWithToList = toList.stream().filter(n -> n%2==0).toList();//Performance, Conciseness
       //oddListWithToList.add(11); //Immutability,


       //Learning  https://www.baeldung.com/java-stream-immutable-collection
    }
}
