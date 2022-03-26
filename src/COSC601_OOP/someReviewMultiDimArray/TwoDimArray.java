package someReviewMultiDimArray;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][]matrix;
        matrix= new int[5][5];

        for(int i=0 ; i<matrix.length; i++){
            for(int j=0 ; j<matrix[i].length; j++){
                matrix[i][j]= (int) (Math.random() * 100);
            }
        }

        int[][] my2DArray={
                {3,5,2,6},
                {8,2,6,1},
                {0,0,0,0},
                {5,8,3,7}
        };

        int[][] myDiffreentArray={
                {3,5,2,6},
                {8,2,6,1},
                {0,0,0,0},
        };

        int[][] myRandomArray={
                {3,5,3,8,6},
                {5,9},
                {3,6,8,9}
        };

        for(int k=0; k<myDiffreentArray.length; k++){
            for(int j=0; j<myDiffreentArray[k].length; j++) {
                System.out.print(myDiffreentArray[k][j] + " ");
            }
            System.out.println();
        }


    }
}
