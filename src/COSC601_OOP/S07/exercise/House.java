package S07.exercise;

public class House {
    private String color;
    private String address; // or better private Address address;
    private double  length;
    private double width;

    public double getSquareFeet(){
        return (this.length* this.width);
    }
    public void sellHouse(){
        System.out.println("Sold!");
    }
}
