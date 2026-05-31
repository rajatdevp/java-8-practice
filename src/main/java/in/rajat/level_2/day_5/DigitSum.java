package in.rajat.level_2.day_5;

import java.util.List;

public class DigitSum {

    public static int getDigitSum(int number) {

        int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
    }

    public static void main(String[] args) {

        List<Integer> nums = List.of(19,28,37,46,55,5);

       List<Integer> result =  nums.stream()
               .filter(n -> getDigitSum(n) >= 10)
               .toList();

       System.out.println(result);
    }
}
