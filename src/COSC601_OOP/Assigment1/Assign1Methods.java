package Assigment1;

import com.sun.source.tree.BreakTree;

public class Assign1Methods {
    public static void main(String[] args) {

        System.out.println(" ******  TEST QUESTION 1  *********\n" +
                "Take 2 arrays and returns an array composed of entries which exist in both arrays:  ");
        int[] naOne = {3, 19, 22, 14, 7, 8, 9};
        int[] naTwo = {12, 7, 2, 8, 4};
        int[] b = arrayUnion(naOne, naTwo);
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println("\n ******  TEST QUESTION 2  ********* \n" +
                "Smallest element in an array: ");
        System.out.println(arrayMin(naOne));
        System.out.println(" ******  TEST QUESTION 3  ********* \n" +
                "Composed of only odd values: ");
        int[] naTest1 = {17, 4, 12, 11, 3, 14, 7};
        int[] c = getOddValues(naTest1);
        for (int i = 0; i < b.length; i++)
            System.out.print(c[i] + " ");
        System.out.println("\n ******  TEST QUESTION 4  ********* \n" +
                "Join Array: ");
        int[] d = joinArray(naOne, naTwo);
        for (int i = 0; i < d.length; i++)
            System.out.print(d[i] + " ");
        System.out.println("\n ******  TEST QUESTION 5  ********* \n" +
                "Add Matrices: ");
        int[][] arr1 = {{1, 2}, {3, 4}};
        int[][] arr2 = {{5, 6}, {7, 8}};
        int[][] sum = addMatrices(arr1, arr2);
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ******  TEST QUESTION 6  ********* \n" +
                " First 50 palindromic primes: ");
        int[] pallPrime = pallPrimeInt();
        for (int i = 0; i < pallPrime.length; i++)
            System.out.print(pallPrime[i] + "  ");
        System.out.println("\n ******  TEST QUESTION 7  ********* \n" +
                "Sum of Array Row: ");
        int[][] input = {
                {3, 19, 22, 14, 7, 8, 9},
                {3, 1, 12, 4, 3, 8, 2},
                {13, 9, 2, 8, 7, 14, 9},
                {8, 27, 7, 11, 7, 5, 20}
        };
        int[] result = sumArrayRows(input);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + "  ");
        System.out.println("\n ******  TEST QUESTION 8  ********* \n" +
                "A square 2 dimensional array of chars and return a boolean that indicates whether or not the given 2d array has 4 consecutive identical chars occurring in a row, a column or diagonally: ");
        char[][] sample1= {
                {'K','R','C','N','K'},
                {'B','B','J','M','E'},
                {'B','R','Y','C','E'},
                {'B','A','N','B','F'},
                {'B','W','R','K','E'}
        };
        char[][] sample2= {
                {'K','D','C','N','K'},
                {'R','B','J','M','E'},
                {'E','R','Y','C','E'},
                {'C','A','R','B','F'},
                {'B','W','R','R','E'}
        };

        char[][] sample3= {
                {'K','K','K','N','K'},
                {'B','B','J','M','E'},
                {'B','R','Y','C','E'},
                {'B','A','N','B','F'},
                {'B','W','R','K','E'}
        };
        System.out.println("in sample1(TRUE) is required and answer is: "+isCons4(sample1));
        System.out.println("in sample2(FALSE) is required and answer is: "+isCons4(sample2));
        System.out.println("in sample3(TRUE) is required and answer is: "+isCons4(sample3));

    }

    //   ************** Question 1 *****************
    public static int[] arrayUnion(int[] aOne, int[] aTwo) {
        int aOneSize = aOne.length;
        int aTwoSize = aTwo.length;
        int[] composed = new int[(aOneSize > aTwoSize) ? aOneSize : aTwoSize];
        int counter = 0;
        for (int i = 0; i < aOneSize; i++) {
            for (int j = 0; j < aTwoSize; j++) {
                if (aOne[i] == aTwo[j])
                    composed[counter] = aOne[i];
            }
            counter++;
        }
        return composed;
    }
    //   ************** Question 2 *****************
    public static int arrayMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }
    //   ************** Question 3 *****************
    public static int[] getOddValues(int[] naTest) {
        int[] result = new int[naTest.length];
        int count = 0;
        for (int i = 0; i < naTest.length; i++) {
            if (naTest[i] % 2 != 0) {
                result[count] = naTest[i];
                count++;
            }
        }
        for (int i = 1; i < result.length; i++) {
            for (int j = 0; j < result.length - i; j++) {
                if (result[j] < result[j+1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
//                    morePasses=true;
                }
            }
        }
        return result;
    }

    //   ************** Question 4 *****************
    public static int[] joinArray(int[] naOne, int[] naTwo) {
        int naOneSize = naOne.length;
        int naTwoSize = naTwo.length;
        int[] join = new int[naOneSize + naTwoSize];
        int counter = 0;
        for (int i = 0; i < naOneSize; i++) {
            join[counter] = naOne[i];
            counter++;
        }
        for (int j = 0; j < naTwoSize; j++) {
            join[counter] = naTwo[j];
            counter++;
        }
        return join;
    }

    //   ************** Question 5 *****************
    public static int[][] addMatrices(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col = arr1[arr1.length - 1].length;
        int[][] sum = new int[row][col];

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j]=arr1[i][j] + arr2[i][j];
            }
        }
        return sum;
    }
    //   ************** Question 6 *****************
    public static int[]  pallPrimeInt(){
        int count=50;
        int[] pp=new int[count];
        int counter=0;
        int number=2;
        while(counter<count){
            if(isPalindromic(number)) {
                pp[counter] = number;
                counter++;
            }
            number++;
        }
        return pp;
    }
    public static boolean isPrime(int input) {
        for (int divisor = 2; divisor <= input / 2; divisor++) {
            if (input % divisor == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindromic(int num){

        while (isPrime(num)){
            int sum=0;
            int tmp=num;
            while(num>0){
                sum=(sum*10)+(num%10);
                num/=10;
            }
            return (tmp==sum)?  true: false;
        }
        return false;
    }
    //   ************** Question 7 *****************
    public static int[] sumArrayRows (int[][] arr){
        int[] sum= new int[arr.length];
        int add=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                add+=arr[i][j];
            }
            sum[i]=add;
            add=0;
        }
        return sum;
    }
    //   ************** Question 8 *****************
    public static boolean isCons4(char[][] aSample) {
        for (int i = 0; i < aSample.length; i++) {
            for (int j = 0; j < aSample[i].length; j++) {
                char charSample = aSample[i][j];
                if (j <= aSample[i].length - 4 &&
                        charSample == aSample[i][j + 1] &&
                        charSample == aSample[i][j + 2] &&
                        charSample == aSample[i][j + 3])
                    return true;
                if (i <= aSample.length - 4 &&
                        charSample == aSample[i + 1][j] &&
                        charSample == aSample[i + 2][j] &&
                        charSample == aSample[i + 3][j])
                    return true;
                if (i <= aSample.length - 4 &&
                        j <= aSample[i].length - 4) {
                    if (charSample == aSample[i + 1][j + 1] &&
                            charSample == aSample[i + 2][j + 2] &&
                            charSample == aSample[i + 3][j + 3])
                        return true;
                }
                if (i <= aSample.length - 4 &&
                        j >= aSample[i].length - 4) {
                    if (charSample == aSample[i + 1][j - 1] &&
                            charSample == aSample[i + 2][j - 2] &&
                            charSample == aSample[i + 3][j - 3])
                        return true;
                }
            }
        }
        return false;
    }
}


