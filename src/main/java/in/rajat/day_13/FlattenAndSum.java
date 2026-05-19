package in.rajat.day_13;

import java.util.Arrays;

public class FlattenAndSum {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5}, {6}};
        int sum = Arrays.stream(arr).flatMapToInt(Arrays::stream).sum();
        System.out.println("The sum of all elements is: " + sum);
    }
}
