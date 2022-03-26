package SomeExerciseS9p1Stack.S9p1Stack;

public class StackInteger {
    private int[] elements;
    private int size;

    //first constructor with input capacity
    public StackInteger(int capacity) {
        if(capacity>0)
            elements = new int[capacity];
    }

    //second constructor with no parameter and fix size
    public StackInteger() {
        // elements = new int[20];
        this(20); // previous constructor is called
    }



    // STEP1 >> PUSH

    public void push(int value){
        //optional: to check array is full or not and expand it if necessary
        if(size>= elements.length){
            int[] temp = new int[elements.length *2];// if array is full double sized array
            System.arraycopy(elements, 0 , temp , 0 , elements.length);
            elements=temp;
        }
        elements[size]=value; // here array is empty and we push first item
        size++;  // top of array 1step go forward
        // also we can increament in last line  >>>>  elements[size++]=value;  Correct
    }
    /*   stack view after pushing step 1
    |   |  <<-  pointer now    size=1
    | 5 |  ->> Push(5)


      stack view after pushing step 2
    |   |  <<-  pointer now  size=2
    |10 |  ->> Push(10)
    | 5 |


     */



    //STEP 2  >>>>  POP

    public int pop(){
//        int result = elements[size-1];
//        size--;
//        return result;
        // execpt above lines :
        return elements[--size];

    }



    public int peek(){
        return elements[size-1];
    }

    public int getSize(){
        return size;
    }

    public boolean empty(){
//        if (size==0){
//            return ...
//        } except this is better use :
        return (size==0);
    }

public void printStack(){
//        for(int value : elements){
//
//        }
    for(int i=0;  i<size ; i++){
        System.out.println(elements[i]);
    }
}

    @Override
    public String toString() {
        String result ="";

        for (int i = 0; i < size; i++) {
            result+= elements[i] + " ";
        }
        return result;
    }
}
