package JavaFazli.Generics;
class X {
    public int key;
    public int value;

    public X(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
class Y extends X {
    public int addedValue;

    public Y(int key, int value) {
        super(key, value);
        this.addedValue = 1000;
    }
}
public class GenericsIntro {
    ////////   Generic methods
    public static <E extends X> void printArray(E[] inputArray){
        for (E element:inputArray)
            System.out.print(element.key + "  "+ element.value
            + " " + ((Y)element).addedValue);
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intgerArray={1,2,3,4,5,6,7,8,9};
        printArray2(intgerArray);
        Double[] doubleArray={1.2,3.4,5.6,7.8,};
        printArray2(doubleArray);
        Character[] characterArray={'H','i'};
        printArray2(characterArray);

//        X[] x= {new X(1,2) , new X(2,5), new X(5,10)};
//        printArray(x);

        Y[] y= {new Y(1,2) , new Y(2,5), new Y(5,10)};
        printArray(y);


    }
    public static <E> void printArray2(E[] inputArray){
        for (E element:inputArray)
            System.out.print(element + "  ");
        System.out.println();
    }
    public static <E extends Number> void printNumber(E[] inputArray){
        for (E element:inputArray)
            System.out.print(element + "  ");
        System.out.println();
    }
    public static <T extends Comparable<T>> T maximum(T x, T y , T z){
        T max= x;
        if(y.compareTo(max)>0)
            max=y;
        if(z.compareTo(max)>0)
            max=z;

        return max;
    }

}
