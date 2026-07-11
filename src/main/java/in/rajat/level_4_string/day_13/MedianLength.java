package in.rajat.level_4_string.day_13;

import java.util.IntSummaryStatistics;
import java.util.List;

public class MedianLength {

    public static void main(String[] args) {

        List<String> words = List.of("a", "bb", "ccc", "dddd", "eeeee");

        IntSummaryStatistics re = words.stream().mapToInt(String::length).summaryStatistics();

        System.out.println(re.getAverage());
    }
}
