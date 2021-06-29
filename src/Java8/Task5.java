package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {

    public static List<String> getSortedAscOddValues(List<Integer> intList) {
        return intList.stream()
                .filter(x -> x % 2 == 1)
                .sorted()
                .map(n -> n.toString())
                .collect(Collectors.toList());
    }
}
