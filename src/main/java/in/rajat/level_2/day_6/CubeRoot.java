package in.rajat.level_2.day_6;

import java.util.List;

//Count how many numbers are perfect cubes
public class CubeRoot {

    public static void main(String[] args){

        List<Integer> nums = List.of(1,8,27,64,100,125);

        List<Integer> result = nums.stream()
                .filter(num -> {int c = (int) Math.cbrt(num); return num == c * c *c ;})
                .toList();

        System.out.println(result);
        //[3.0, 2.0, 4.0, 5.0, 6.0]
    }
}
