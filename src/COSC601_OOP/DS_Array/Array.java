package DS_Array;

public class Array {
    private int size;
    private int[] items;

    public Array(int length) {
        items= new int[length];
    }

    public void insert (int item){
        if(items.length==size){
            int[] newItems= new int[size*2];
            for(int i=0 ; i< size ; i++){
                newItems[i]=items[i];
            }
            items= newItems;
        }

        items[size++]=item;
    }

    public void removeAt (int index) {
        if(index<0 || index>=size)
            throw  new IllegalArgumentException();
        for(int i=index; i<size ; i++)
            items[i]=items[i+1];
        size--;
    }

    public int indexOf (int item) {
        for(int i=0; i<size ; i++)
            if(items[i]==item)
                return i;
        return -1;
    }


    public void print(){
        for(int i=0 ; i< size ; i++)
            System.out.println(items[i]);
    }
}
