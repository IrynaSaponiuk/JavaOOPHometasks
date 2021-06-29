package Java8;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static List<String> filterByFirstAndLastCharacter(char symbol, List<String> stringList) {
        return stringList.stream()
                .filter(list -> list.startsWith(String.valueOf(symbol)) && list
                        .endsWith(String.valueOf(symbol))&&list.length()>1)
                .collect(Collectors.toList());

    }

}

