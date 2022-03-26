package S8p2Inheritance;

public class  SimpleSquare extends GeometricObject{
    private double side;


    public SimpleSquare(){
        this.side=1;
        setColor("green");
    }
    public SimpleSquare(double side){
        this.side=side;
    }

}
