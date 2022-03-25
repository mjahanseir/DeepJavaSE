package COSC603_2022_03_18_IO;

import java.io.*;
import java.util.Date;

public class C1_ObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        MyClass someclass= new MyClass();
        AnotherClass anotherClass= new AnotherClass();

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src/COSC603_2022_03_18/object.dat")))
        {
            output.writeUTF("Dave");
            output.writeDouble(100.5);
            output.writeObject(new Date());
            //output.writeObject(someclass); /// it cause runtime error error because some class are not Seriazabale
            output.writeObject(anotherClass); /// it is ok because impelements  Seriazabale
        }
        File file= new File("src/COSC603_2022_03_18/object.dat");
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file)))
        {
            String name= input.readUTF();
            double score= input.readDouble();
            Date today= (Date)input.readObject(); // We can use try and catch or throws new exception:  ClassNotFoundException

            AnotherClass aClass= (AnotherClass)input.readObject();


            System.out.println(name+ " " + score + " " + today);
            System.out.println(aClass.x);
        }

    }
}



///////////////////////////////////////////////////////////////////////////////////////


class MyClass{

}
class AnotherClass implements Serializable{
    public int  x=100;
    private static int y=1000;
    private transient MyClass someclass;
}