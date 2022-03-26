package testingSomeFeatures;

public class ArrayBasic<ar> {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        System.out.println(arr1[2]);

        char[] arr2 = new char[3];
        System.out.println(arr2[2]);

        boolean[] arr3 = new boolean[3];
        System.out.println(arr3[2]);


        int[] list = {1, 2, 3, 5, 4};

        for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
            // Swap list[i] with list[j]
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }

        int[][] data = {{11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35}};

        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                System.out.print(data[r][c] + " ");
            }
            System.out.println();
        }

//        int[][] myArray=//0  1   2   3    4  5
//                      { {11, 12, 13, 14, 15, 16},  //0
//                        {21, 22, 23, 24},          //1
//                        {31, 32, 33, 34},          // 2
//                        {41, 42, 43, 44},          //3
//                        {51, 52, 53, 54, 55, 56} };//4
//
//        System.out.println("myArray[4][5]"+myArray[4][5]);
//
////        System.out.println(myArray[3][4]);
//
//    System.out.println(myArray[0][5]);
////
//        System.out.println(myArray[1]);
////
////        System.out.println(myArray[4]);

        System.out.println(createAlphabetArray());






        int[][] matrix = new int[10][10];
        int maxRow = 0;
        int indexOfMaxRow = 0;
        // Get sum of the first row in maxRow
        for(int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
        }
        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++)
                totalOfThisRow += matrix[row][column];
            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row " + indexOfMaxRow
                + " has the maximum sum of " + maxRow);



    }
    public static char[] createAlphabetArray(){
        char[] alphabet = new char[26]; //Declare and create array
        int index = 0;
        for( char letter = 'A'; letter <= 'Z'; letter++ ){
            alphabet[index++] = letter;
        }
        return alphabet;
    }







}

