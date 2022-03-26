public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));

    }

    public static boolean hasTeen(int x1,int x2,int x3){

        if((x1>=13 && x1<=19) || (x2>=13 && x2<=19) || (x3>=13 && x3<=19)){
            return true;
    } else
            return false;
    }
}
