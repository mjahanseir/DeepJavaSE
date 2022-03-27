package LiangExcercise10thAll.Exercise_24.Exercise_24_05;

public class GenericQueue<E> extends java.util.LinkedList<E> {

	public void enqueue(E e) {
		addLast(e);
	}

	public E dequeue() {
		return removeFirst();
	}

	public int getSize() {
		return size();
	}
}