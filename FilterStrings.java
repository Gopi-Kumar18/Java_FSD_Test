
import java.util.*;
import java.util.stream.Collectors;

public class FilterStrings {
    public static void main(String[] args) {
        List<String>li =  Arrays.asList("alex", "is", "from", "newyork", "usa", "hello");

         List<String>al = li.stream()
                .filter(s -> s.length() >= 4)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(al);
    }
}
