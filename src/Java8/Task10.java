package Java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task10 {
    public static List<Character> getSortedLastLettersInUpperCase(List<String> stringList) {
        return stringList.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.comparingInt(String::length)
                        .reversed())
                .map(x -> x.charAt(x.length()-1))
                .collect(Collectors.toList());
    }
}

