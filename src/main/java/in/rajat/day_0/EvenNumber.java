package in.rajat.day_0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class EvenNumber {
    public static void main(String[] args) {

        //1	Find all even numbers from List<Integer>
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        // [2, 4, 6, 8, 10]
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        //List.of(arr).stream().filter(i -> i % 2==0 ).toList(); ❌ It will be List<int[]> not List<Integer>
        //Arrays.asList(arr).stream().filter(i -> i % 2==0 ).toList(); ❌ It will be List<int[]> not List<Integer>
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10); // Initialize like this to get List<Integer>
        //filter(Predicate<? super T> predicate) Stream interface Returns a stream consisting of the elements of this stream that match the given predicate.
        //This is an intermediate operation.
        List<Integer> integerStream = list.stream().filter(i -> i % 2==0 ).toList();
        //Arrays.asList(arr).stream().filter(i -> i[0]==0).toList();//  ❌It will be stream of int[] not Integer ✅
        List<Integer> intStream = Arrays.stream(arr).filter(i -> i%2==0).boxed().collect(Collectors.toList());
                                                               //Use boxed() method IntStream"
                                                               //to convert IntStream to Stream<Integer>
        System.out.println(integerStream);
        System.out.println(intStream);

    }
}
