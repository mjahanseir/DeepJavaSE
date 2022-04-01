package Stream;

import java.util.*;
import java.util.function.Predicate;
public class JavaCup20_Java8_1 {
    public static void main(String[] args) {
        List<Apple> apples= Arrays.asList(
                new Apple(1),
                new Apple(2),
                new Apple(2),
                new Apple(3),
                new Apple(5) );
        List<Apple> filtered=filter(apples, a->a.size>2);
        Collections.sort(apples, (o1, o2) ->o1.size-o2.size);
        System.out.println(apples);
    }


    static List<Apple> filter(List<Apple> list, Predicate<Apple> condition) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : list)
            if (condition.test(apple))
                result.add(apple);
        return list;
    }
}

class Apple{
    int size;
    public Apple(int size){
        this.size=size;
    }
}

