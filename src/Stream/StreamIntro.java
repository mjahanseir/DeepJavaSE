package Stream;

import java.util.ArrayList;

public class StreamIntro {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        for (int i=0 ; i<1_000; i++)
            list.add((int)(Math.random()*500));

        list.stream().limit(10).forEach(System.out::println);
//same : list.stream().limit(10).forEach(e->System.out.println(e));

        //return 10 value greater than 10
        list.stream().sorted().filter(e->e>10).limit(10).forEach(System.out::println);

        // Average value greater than 200
        long total =list.stream().filter(e->e>200).count();
        System.out.println(total);
        // don't have a sum method, but we can get our own by using the reduce method
        //reduce : 'reduce' a stream to single value using a user defined operation
        long sum=list.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
        long sum2=list.stream().filter(e->e>200).reduce(0,(a,b)->a+b);
        System.out.println(sum2);

        System.out.println("The average of our list is  " + (sum2/total));

        ////////////////////////////////////////////////////////////////////////

        list.stream().sorted((e1,e2)->e2-e1).limit(10).forEach(System.out::println);
        System.out.println("IS 100 in the List? "+ list.stream().anyMatch(e->e==100) );

    }
}
