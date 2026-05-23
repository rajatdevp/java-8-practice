package in.rajat.level_1.day_10;

import java.util.List;
import java.util.function.Predicate;
//Check if all numbers are positive (allMatch)
public class CheckPositive {

    public static void main(String[] args){

        List<Integer> list1 = List.of(-1, 2, 3, 4, 5);

        Predicate<Integer> isPositive = n -> n>0;

        boolean list1Result = list1.stream()
                .allMatch(isPositive);//allMatch(Predicate T) return true if all elements are positive, otherwise false

        List<Integer> list2 = List.of(2, 3, 4, 5);

        boolean list2Result = list2.stream()
                .allMatch(isPositive);

        System.out.println(list1Result);//false
        System.out.println(list2Result);//true

    }
}
