import java.util.*;

public class Exercise24_02 {
  public static void main(String[] args) {
    new Exercise24_02();
  }

  public Exercise24_02() {
    String[] names = {"Tom", "Susan", "Kim", "George", "Peter", 
        "Jean", "George", "Jane", "Denise", "Jenny", "Susan", "Kathy", "Jane"};
    MyList<String> list = new MyLinkedListExtra<>(names);   

    System.out.println(list);
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a name: ");
    String name = input.next();
    
    System.out.print("Enter an index: ");
    int index = input.nextInt();
    
    System.out.println(name + " is in the list? " + list.contains(name));
    System.out.println("name at index " + index + " is " + list.get(3));
    System.out.println(name + " is at index " + list.indexOf(name));
    System.out.println(name + " is at last index " + list.lastIndexOf(name));
    list.set(index, name);
  }
}

class MyLinkedListExtra<E> extends MyLinkedList<E> {
  /** Create an empty list */
  public MyLinkedListExtra() {
  }

  /** Create a list from an array of objects */
  public MyLinkedListExtra(E[] objects) {
    super(objects);
  }

  @Override /** Return true if this list contains the element e */
  public boolean contains(Object o) {
    // Implement it in this exercise
    Node<E> current = head;
    for (int i = 0; i < size; i++) {
      if (current.element.equals(o))
        return true;
      current = current.next;
    }

    return false;
  }

  @Override /** Return the element from this list at the specified index */
  public E get(int index) {
    // Implement it in this exercise
    if (index < 0 || index > size - 1)
      return null;

    Node<E> current = head;
    for (int i = 0; i < index; i++)
      current = current.next;

    return current.element;
  }

  @Override /** Returns the index of the first matching element in this list.
   *  Returns -1 if no match. */
  public int indexOf(Object o) {
    // Implement it in this exercise
    Node<E> current = head;
    for (int i = 0; i < size; i++) {
      if (current.element.equals(o))
        return i;
      current = current.next;
    }

    return -1;
  }

  @Override /** Returns the index of the last matching element in this list
   *  Returns -1 if no match. */
  public int lastIndexOf(Object o) {
    // Implement it in this exercise
    int lastIndex = -1;
    Node<E> current = head;
    for (int i = 0; i < size; i++) {
      if (current.element.equals(o))
        lastIndex = i;
      current = current.next;
    }

    return lastIndex;
  }

  @Override /** Replace the element at the specified position in this list
   *  with the specified element. */
  public E set(int index, E e) {
    if (index < 0 || index > size - 1)
      return null;

    Node<E> current = head;
    for (int i = 0; i < index; i++)
      current = current.next;

    E temp =  current.element;
    current.element = e;
    
    return temp;
  }
}
