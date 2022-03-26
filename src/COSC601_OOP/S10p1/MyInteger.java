package S10p1;

public class MyInteger {
    private int num;

    public MyInteger(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String toString(){
        return num + "";
    }
    public double toDouble(){
        double result;
        result=(double) num;
        return result;
    }

}
