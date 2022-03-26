package Ch00SomeTesting;

public class ShowStars {
    public static void main(String[] args) {
        showStars(5);
    }
    public static void showStars(int rows){
        String pattern="";
        for(int i=1; i<=rows; i++){
            pattern+="*";
            System.out.println(pattern);
        }
    }
}
