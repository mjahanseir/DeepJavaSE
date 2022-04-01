package Stream;
import java.util.*;
public class JavaCup20_Java8_2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("log:Hello World");
        set.add("log:Ok");
        set.add("log:Warning");
        set.add("log:Fatal Error");
        set.add("Hi");
        set.add("Java8");
        set.add("Streams are great!");

        Optional<Integer> sum=
                set.stream()
                        .filter(s->s.startsWith("log"))
                        .sorted()
                        .limit(2)
                        .map(s->s.length())
                        .reduce((a,b)-> a+b);
        System.out.println(sum.get());
    }
}
