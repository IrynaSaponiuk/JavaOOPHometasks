package Java8;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<Integer> sortAscLengthsOfStrings(List<String> stringList) {
        return stringList.stream()
                .sorted()
                .map(String::length)
                .collect(Collectors.toList());
    }
}
