package SomeExerciseS10p1.S10p1;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sBuilder= new StringBuilder();

        sBuilder.append("This");
        sBuilder.append(" is ");
        sBuilder.append("String ");

        System.out.println(sBuilder.toString());

        sBuilder.insert(4,"a");

        System.out.println(sBuilder.toString());


//        sBuilder.reverse();
//        System.out.println(sBuilder.toString());

        sBuilder.reverse().append("Whatever").delete(4, 10);
        System.out.println(sBuilder.toString());


    }
}
