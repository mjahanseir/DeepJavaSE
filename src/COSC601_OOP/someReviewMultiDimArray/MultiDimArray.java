package someReviewMultiDimArray;

public class MultiDimArray {
    public static void main(String[] args) {
        double[][][] scores={
                { {10,20.5} , {15,39.3} , {18,56.8}},
                {}
        };


        for(int i=0; i< scores.length;i++){
            for(int j=0; j< scores[i].length;j++){
                for(int k=0; k< scores[i][j].length;k++) {
                    System.out.println(scores[i][j][k]);
                }
            }
        }


    }
}
