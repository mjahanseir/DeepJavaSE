package COSC60220220126Exception;

public class EmployeeTest {
    public static void main(String[] args) {
        try{
            Employee o = new Employee();
        }catch (IllegalAgeValueException ie){
            System.out.println(ie.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
