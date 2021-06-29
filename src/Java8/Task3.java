package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static List<String> getListExtremeLetters(List<String> list) {
        return list.stream()
                .map(str -> str.substring(0)+str.substring(str.length()-1))
                .collect(Collectors.toList());
    }

}
