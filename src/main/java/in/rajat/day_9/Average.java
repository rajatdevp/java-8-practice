package in.rajat.day_9;

import java.util.Arrays;
import java.util.OptionalDouble;

//Find average of all numbers
public class Average {
    public static void main(String[] args){

        int[] arr = {10, 20, 30, 40, 50};

        OptionalDouble result= Arrays.stream(arr)
                .average();

        System.out.println(result);
        //30.0
    }
}
