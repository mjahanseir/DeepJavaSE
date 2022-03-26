package S12Interface;

public interface Ediable {

    //All data fields are public final static
    //All methods are public abs.

    int x=0; //  public final static  -> CONSTANT

   // String howToEat();   // is correct
    public abstract String howToEat();
}
