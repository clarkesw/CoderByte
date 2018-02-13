package mistake;

import java.util.Arrays;

public class TestMis {
    public static void main(String[] args){
        Arrays.stream(new String[]{
                "Robin", "Ram","Robert","Rahin"
        }).filter(s -> s.startsWith("Ro"))
                .sorted()
                .forEach(System.out::println);
    }
}
