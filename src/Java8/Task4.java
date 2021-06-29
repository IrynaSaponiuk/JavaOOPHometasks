package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    public static List<String> filterAndSortByLastDigit(int number, List<String> stringList) {
        return stringList.stream()
                .filter(x -> x.length() == number)
                .filter(x -> Character.isDigit(x.charAt(x.length() - 1)))
                .sorted()
                .collect(Collectors.toList());
    }
}
