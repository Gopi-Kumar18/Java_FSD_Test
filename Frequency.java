import java.util.*;

public class Frequency {
    public static void main(String[] args) {

        String line = "hello world";

        Map<Character,Integer>m = new HashMap<>();

        for(char ele : line.toCharArray()) {
            m.put(ele,m.getOrDefault(ele,0)+1);
        }

        for(Map.Entry<Character,Integer>map : m.entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
        }

    }
}
