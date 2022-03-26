package Lab5;

public class Program3 {
    public static void main(String[] args) {

        System.out.println(middle( "Java Programming"));
        System.out.println(middle( "JavaS"));

    }
    public static String middle(String inStr){
        int position,  length;
        if (inStr.length()%2==0){
            //even and  display two middle characters.
            position=(inStr.length()/2)-1;
            length=2;
        }else {
            //odd and display one middle character
            position=inStr.length()/2;
            length=1;
        }
        return inStr.substring(position, position+length);
    }
}
