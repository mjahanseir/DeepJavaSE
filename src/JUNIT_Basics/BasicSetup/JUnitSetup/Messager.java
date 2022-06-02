package JUnitSetup;

public class Messager {
    private String message;

    public Messager(String message) {
        this.message = message;
    }
    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
