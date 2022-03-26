package COSC60220220126Exception;
public class IllegalOperatorException extends Exception{
    public IllegalOperatorException(){
        super("Illegal Operator used.");
    }

    public IllegalOperatorException(char op){
        super("Error: -- "+ op);
    }

    public IllegalOperatorException(String op){
        super("Error: -- "+ op);
    }
}
