package in.rajat.level_4_string.day_13;

import java.util.List;

public class MedianLength {

    public static void main(String[] args) {

        List<String> words = List.of("a", "bb", "ccc", "dddd", "eeeee");
        List<Integer> lengths =words.stream().map(String::length).sorted().toList();

        int size = lengths.size();

        double median;

        if (size % 2 == 0) {
            median = (lengths.get(size / 2 - 1) + lengths.get(size / 2)) / 2.0;
        } else {
            median = lengths.get(size / 2);
        }

        System.out.println(median);

    }
}
