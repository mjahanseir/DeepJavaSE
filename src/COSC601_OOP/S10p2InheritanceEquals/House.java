package S10p2InheritanceEquals;

public class House {
    private String color;
    private String Address;
    private double value;
    private double length =50;
    private double width=20;

    public House(){
        length=30;
        width=30;
    }
    public House(String c, String a, double val) {
        color = c;
        Address = a;
       value = val;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSquareFeet(){
        return length*width;
    }
    public double getValuePerSquareFoot(){
        return value/getSquareFeet();
    }

    public void sellHouse(){
        System.out.println("SOLD!");
    }

    @Override
    public String toString() {
        return "Length" +length +
                "Width" + width;
    }
    @Override
    public boolean equals(Object o){            //Take an Object as Parameter

        boolean result = false;
        //passing House


        // JAVA does not know is house or object We have to recognize to Java it is a house
        //House is not object yet  >>  We can cast Object


        //CHECK TO MAKE SURE ITS A HOUSE
        if (o instanceof  House) {   // checkin is house is a object by INSTANT OF

           // IT IS EXPLICITLY CAST TO A HOUSE VARIABLE
            House h = (House) o;  // Casting o to a object of House
            // NOW WE CA WORK WITH H INSTANT OF O AS A PROPER HOUSE TYPE
            result = this.Address.equals(h.Address);  //     result = this.Address.equals(o.Address); is going to be house first we need to casting it first

        }

        return result;
    }

}
