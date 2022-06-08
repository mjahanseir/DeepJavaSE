package SearchandSortAlgorithm;

public class LinearSearch {
    public static void main(String[] args) {

        int[] myList=new int[10];

        for (int i=0; i<myList.length; i++){
            myList[i] = (int)(Math.random()*100);
        }

        int searchItem=56;

        //linear search

//        for(int i=0; i<myList.length;i++){
//            if(searchItem== myList[i])
//                System.out.println("found");
//        }
        //Not  efficient


    }

    public static int linearSearch(int[] list, int key){
        for(int i=0; i<list.length;i++){
            if(key== list[i])
                return i;
        }
        return -1;
    }


}
