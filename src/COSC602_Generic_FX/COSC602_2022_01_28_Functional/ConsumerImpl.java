package COSC60220220128Functional;

import java.util.function.Consumer;

public class ConsumerImpl<T> implements Consumer<T> {

    @Override
    public void accept(T t) {
        System.out.println(t);
    }


}
