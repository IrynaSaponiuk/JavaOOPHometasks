package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class Task7 {

    public static List<Integer> getSortedDifferenceBetweenSubsets(int number, List<Integer> integerList) {
        return integerList.stream()
                .filter(n -> n%2==0 ^ n>=integerList.get(n-1))
                .distinct()
                .collect(Collectors.toList());
    }
}
