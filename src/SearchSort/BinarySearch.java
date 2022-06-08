package SearchandSortAlgorithm;

public class BinarySearch {
    public static void main(String[] args) {

//        int[] myList=new int[10];

//        for (int i=0; i<myList.length; i++){
//            myList[i] = (int)(Math.random()*100);
//        }

//        int searchItemint[] myList=new int[10];=56;

        //linear search

//        for(int i=0; i<myList.length;i++){
//            if(searchItem== myList[i])
//                System.out.println("found");
//        }
        //Not  efficient
        int[] myList={1,2,3,4,5,6};
        System.out.println(binarySearch(myList,2));

    }

    public static int binarySearch(int[] list, int key){
        int low=0;
        int high= list.length-1;

        while (high >= low) {
            int mid = (low + high)/2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1; }

        return -1;
    }


}
