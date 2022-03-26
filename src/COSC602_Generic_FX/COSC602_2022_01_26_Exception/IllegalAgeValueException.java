package COSC60220220126Exception;

public class IllegalAgeValueException extends Exception{
    public IllegalAgeValueException() {
        super("Illegal Age Value");
    }
    public IllegalAgeValueException(int age) {
        super(age + " is not a valid age value. ");
    }
}
