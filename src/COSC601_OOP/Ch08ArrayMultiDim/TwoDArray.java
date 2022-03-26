package Ch08ArrayMultiDim;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] matrix;
        matrix= new int[5][5];

        for (int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]= (int)(Math.random()*100);
            }
        }
        int[][] my2DArray={
                {3,5,2,6},
                {8,2,6,1},
                {0,0,0,0},
                {5,8,3,7}
        };

        int[][]myDiffrent2DArray={
                {3,5,2,6},
                {8,2,6,1},
                {0,0,0,0},
        };

        int[][] myRaggedArray={
                {3,5,3,8,6},
                {5,9},
                {3,6,8,9}
        };

        for (int k=0 ; k<myDiffrent2DArray.length;k++){
            for (int j=0; j<myDiffrent2DArray[k].length;j++){
                System.out.print(myDiffrent2DArray[k][j]+ " ");
            }
            System.out.println();
        }
    }
}
