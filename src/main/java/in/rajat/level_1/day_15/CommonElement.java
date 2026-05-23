package in.rajat.level_1.day_15;

import java.util.List;

public class CommonElement {

	public static void main(String[] args){

		List<Integer> num1 = List.of(10,20,30,40);
		List<Integer> num2 = List.of(20,30,50);

		List<Integer> result = num1.stream()
                .filter(num2::contains)
                .toList();

		System.out.println(result);//[20, 30]
	}
}
