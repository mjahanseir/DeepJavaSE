package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class FunctionInput {
    private static List<String> list= Arrays.asList("One","two","Three","four");

    public static void main(String[] args) {

        //This is a static variable but second approach is parametrize it and behaviour with any input is correct
        for (String element:list)
            System.out.println(element.toUpperCase());

        list.forEach(s-> System.out.println(processString(t->t.toUpperCase(),s)));

    }
    //method with different passing
    // first input is function , second is var
    public static  String processString(Function<String,String> operation, String target){
        return operation.apply(target);
    }
}
