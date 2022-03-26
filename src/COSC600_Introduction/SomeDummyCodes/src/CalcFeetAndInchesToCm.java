public class CalcFeetAndInchesToCm {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCm(1,1));
        System.out.println(calcFeetAndInchesToCm(1));
        System.out.println(calcFeetAndInchesToCm(13));
        System.out.println(calcFeetAndInchesToCm(-1));

    }

    public static double calcFeetAndInchesToCm(double feet, double inch){
        if ((feet<0)|| (inch<0 || inch>12))
            return -1;
       return inch *2.54+ feet*30.48;
    }
    public static double calcFeetAndInchesToCm( double inch){
        if (inch>=0 && inch<=12)
           return inch *=2.54;
        return -1;
    }
}
