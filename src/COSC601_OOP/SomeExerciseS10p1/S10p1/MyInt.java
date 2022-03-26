package SomeExerciseS10p1.S10p1;

public class MyInt {
    private  int num;

    public MyInt(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return num +" ";
    }

    public double toDouble(){
        double result;
        result=(double) num;
        return result;
    }
}
