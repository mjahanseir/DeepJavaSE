package Lab1;
public class ArrayUtils {




    //     ***********    Q1    ***********
    public static int max(int[] input) {
        int maxValue = input[0];
        for (int i = 0; i < input.length; i++) {
            if (maxValue < input[i]) {
                maxValue = input[i];
            }
        }
        return maxValue;
    }

    public static int min(int[] input) {
        int minValue = input[0];
        for (int i = 0; i < input.length; i++) {
            if (minValue > input[i]) {
                minValue = input[i];
            }
        }
        return minValue;
    }

    //     ***********    Q2    ***********
    public static int total(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
        return sum;
    }

    //     ***********    Q3    ***********
    public static int countOdd(int[] input) {
        int counterOdd = 0;
        for (int value : input) {
            if (value % 2 != 0) {
                counterOdd++;
            }
        }
        return counterOdd;
    }

    //     ***********    Q4    ***********
    public static String toString(int[] input) {
        String result = "[";
        int counter = 0;
        for (int value : input) {
            result = result + value + ", ";
            counter++;
            if (counter % 10 == 0) {
                result += "\n";
            }
        }
        result = (result.substring(0, result.length() - 2)) + "]";
        return result;
    }

    //     ***********    Q5    ***********
    public static String reverseToString(int[] input) {
        String result = "[";
        int counter = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            result = result + input[i] + ", ";
            counter++;
            if (counter % 10 == 0) {
                result += "\n";
            }
        }
        result = (result.substring(0, result.length() - 2)) + "]";
        return result;
    }

    //     ***********    Q6    ***********
    public static int timesOccur(int[] input, int key) {
        int countTimes = 0;
        for (int value : input) {
            if (value == key) {
                countTimes++;
            }
        }
        return countTimes;
    }

    //     ***********    Q7    ***********
    public static int[] reverse(int[] input) {
        int[] returnArr = new int[input.length];
        int counter = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            returnArr[i] = input[counter];
            counter++;
        }
        return returnArr;
    }

    //     ***********    Q8    ***********
    public static boolean isOdd(int input) {
        if (input % 2 != 0)
            return true;
        return false;
    }

    public static boolean isEven(int input) {
        if (input % 2 == 0)
            return true;
        return false;
    }

    //     ***********    Q9    ***********
    public static int[] oddValues(int[] input) {
        int[] returnArr = new int[countOdd(input)];
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 != 0) {    //or if(isOdd(input[i]))
                returnArr[counter] = input[i];
                counter++;
            }
        }
        return returnArr;
    }

    //     ***********    Q10    ***********
    public static int[] copyArr(int[] input) {
        int[] returnArr = new int[input.length];
        int counter = 0;
        for (int arrVal : input) {
            returnArr[counter] = arrVal;
            counter++;
        }
        return returnArr;
    }

    //     ***********    Q11    ***********
    public static void copy(int[] arrSrc, int[] arrDest, int sizeCpy) {
        int minArraySize = arrSrc.length;
        if (minArraySize > arrDest.length) {
            minArraySize = arrDest.length;
        }
        int copySize = minArraySize;
        if (copySize > sizeCpy) {
            copySize = sizeCpy;
        }
        for (int i = 0; i < copySize; i++) {
            arrDest[i] = arrSrc[i];
        }
    }

    //     ***********    Q13    ***********
    public static int[] reduce(int[] input, int value) {
        int sizeInput = input.length;
        if (sizeInput > value)
            sizeInput = value;
        int[] returnArr = new int[sizeInput];
        copy(input, returnArr, sizeInput);
        return returnArr;
    }

    //     ***********    Q14    ***********
    public static int[] grow(int[] input, int value) {
        int newSize = input.length + value;
        if (newSize <= 0)
            return null;
        int[] returnArr = new int[newSize];
        copy(input, returnArr, newSize);
        return returnArr;
    }




    //            --------------------------
    //
    //                    L A B  2
    //
    //            --------------------------




    //     ***********    Lab2-Q1 A random generation method to initialize an array of any size to random number between 1 and 100   ***********
    public static int[] randomGeneration(int size) {
        int[] returnArray = new int[size];

        for (int i = 0; i < size; i++) {
            returnArray[i] = (int) (Math.random() * 100);
        }
        return returnArray;
    }

    //     ***********    Lab2-Q1   swap methods for doubles  ***********
    public static void swap(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    //     ***********    Lab2-Q1  swap methods for  chars   ***********
    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    //     ***********    Lab2-Q1   swap methods for strings   ***********
    public static void swap(String[] str, int i, int j) {
        String temp = str[i];
        str[i] = str[j];
        str[j] = temp;

    }


    //     ***********    Lab2-Q2. create a binary search method for doubles    ***********
    public static int binarySearch(double[] array, double key) {
        int low = 0;
        int high = array.length;
        int mid = array.length / 2;

        while (array.length > 0) {
            if (array[mid] == key)
                return mid;
            else if (key > array[mid])
                low = mid + 1;
            else if (key > array[mid])
                high = mid - 1;
        }
        return -1;
    }

    //     ***********    Lab2-Q3. create a binary search method for strings    ***********
    public static int binarySearch(String[] str, String key) {
        int low = 0;
        int high = str.length;
        int mid = str.length / 2;

        while (str.length > 0) {
            if (str[mid].compareTo(key) == 0) {
                return mid;
            } else if (str[mid].compareTo(key) > 0) {
                high = mid - 1;
            } else if (str[mid].compareTo(key) < 0) {
                low = mid + 1;
            }
        }
        return -1;
    }

    //     ***********    Lab2-Q4. create a selection sort method for double    ***********
    public static void selectionSort(double[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }
            if (min != i)
                swap(array, min, i);

        }
    }

    //     ***********    Lab2-Q5. create a selection sort method for chars    ***********
    public static void selectionSort(char[] chars) {

        for (int ch = 0; ch < chars.length - 1; ch++) {
            int min = ch;
            for (int j = ch + 1; j < chars.length; j++) {
                if (chars[j] < chars[min])
                    min = j;
            }
            if (min != ch)
                swap(chars, min, ch);

        }
    }

    //     ***********    Lab2-Q6. create a selection sort method for strings    ***********
    public static void selectionSort(String[] array) {
        for (int s = 0; s < array.length - 1; s++) {
            int min = s;
            for (int k = s + 1; k < array.length; k++) {
                if (array[k].compareTo(array[min]) < 0)
                    min = k;
            }
            swap(array, min, s);
        }
    }

    //     ***********    Lab2-Q7. create an insertion sort method for doubles    ***********
    public static void insertionSort(double[] input) {
        for (int j = 1; j < input.length; j++) {
            int i = j;
            while (i > 0 && input[i - 1] > input[i]) {
                swap(input, (i-1),i);
                i--;
            }
        }
    }

    //     ***********    Lab2-Q8. create an insertion sort method for chars      ***********
    public static void insertionSort(char[] input) {
        for (int j = 1; j < input.length; j++) {
            int i = j ;
            while (i > 0 && input[i-1]>input[i]) {
                swap(input, (i-1),i);
                i--;
            }
        }
    }

    //     ***********    Lab2-Q9. create an insertion sort method for strings    ***********
    public static void insertionSort(String [] input) {
        for (int j = 1; j < input.length; j++) {
            int i = j ;
            while (i > 0 && input[i-1].compareTo(input[i])>0) {
                swap(input, (i-1),i);
                i--;
            }
        }
    }
}


