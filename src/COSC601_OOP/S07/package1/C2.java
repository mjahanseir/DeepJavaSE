package COSC601Session07.package1;

public class C2 {
    void aMethod(){
        C1 o = new C1();
        System.out.println(o.x);//public
        System.out.println(o.y); // default
        // System.out.println(o.z);  // because it's private

        o.m1();
        o.m2();
        //o.m3();  // because it's private
    }
}
