package JavaFazli.Generics;

import java.util.ArrayList;
import java.util.Objects;

class AA{
    public Object f(Object o){
        return "Hossein";
    }
    public Object f(String s){
        return "Reza";
    }
}
class BB extends AA{

}

class Pair<K, V>{
    public K key;
    public V value;

    public K getKey() {
        return this.key;
    }

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.key +" " + value ;
    }


    public boolean equal(Object o) {

        Pair<V,K>  another = null;
        try {
            another = (Pair<V, K>) o;
        }catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return (another.getKey()==this.key)&& (another.getValue()==this.value);
    }

}



public class Generics {
    public static void main(String[] args) {
        AA a = new AA();
        System.out.println(a.f("Ali"));
        System.out.println(a.f("Hasan"));

        System.out.println("======================");

        Pair<Integer, String> student1= new Pair<>();
        student1.setKey(1);
        student1.setValue("Gholi");

        ArrayList<Pair<Integer, String>> students= new ArrayList<>();
        //student1.set((Integer) 0,  student1);

    }
}
