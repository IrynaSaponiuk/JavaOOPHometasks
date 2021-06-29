package Java8;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {

    public static List<String> shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber
            (List<Integer> numbers, List<String> stringList) {

        return numbers.stream().flatMap(i -> {
            List<String> temp = new ArrayList<>();
            boolean isNotFound = true;
            for (int n = 0; n < stringList.size(); n++) {
                if (stringList.get(n).length() == i && Character.isDigit(stringList.get(n).charAt(0))) {
                    temp.add(stringList.get(n));
                    isNotFound = false;
                    break;
                }
            }
            if (isNotFound)
                temp.add("Not Found");
            return temp.stream();
        })
                .map(i -> String.valueOf(i))
                .collect(Collectors.toList());
    }

}
