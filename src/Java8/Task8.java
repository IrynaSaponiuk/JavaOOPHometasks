package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class Task8 {

    public static List<Integer> getSortedUnionTwoSubsetsIntegers(int d, int k, List<Integer> intList) {
        return intList.stream()
                .filter(x -> x>d)
                .skip(k-1)
                .collect(Collectors.toList());
    }
}
