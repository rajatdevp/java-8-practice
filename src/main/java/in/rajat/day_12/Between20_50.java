package in.rajat.day_12;

import java.util.List;
import java.util.function.Predicate;

public class Between20_50 {

	public static void main(String[] args){

		List<Integer> nums = List.of(10, 25, 35, 55, 40);

		Predicate<Integer> isBetween20_50 = num -> num > 20 && num < 50;

		List<Integer> result = nums.stream().filter(isBetween20_50).toList();

		System.out.println(result);
        //[25, 35, 40]
	}
}
