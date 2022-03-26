package COSC60220220124Exception;

public class ChainedException {
    public static void main(String[] args) {
        try{
            method1();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void method1() throws Exception{
        try{
            method2();
        }catch(Exception e){
            throw new Exception("Exception info from method1", e);
        }
    }
    public static void method2() throws Exception{
        throw new Exception("Exception info from method2");
    }
}
