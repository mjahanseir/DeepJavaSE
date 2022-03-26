import java.util.ArrayList;

public class GenericStack<T> {

  private ArrayList<T> elements = new ArrayList<>();

  public GenericStack() {

  }

  public int getSize() {
    return elements.size();
  }

  public T peek() {
    return elements.get(getSize() - 1);
  }

  public void push(T o) {
    elements.add(o);
  }

  public T pop() {
    T o = elements.get(getSize() - 1);
    elements.remove(getSize() - 1);
    return o;
  }

  public boolean isEmpty() {
    return elements.isEmpty();
  }

  @Override
  public String toString() {
    return "stack: " + elements.toString();
  }
}
