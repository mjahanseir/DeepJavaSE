package COSC601Session07.package2;

import COSC601Session07.package1.C1;

public class C3 {

    void aMethod(){
        C1 o = new C1();
        System.out.println(o.x);//public
        // System.out.println(o.y); // no access outside Package1
        // System.out.println(o.z);  // because it's private
        o.m1();
        // o.m2();// default access modifier and only accessible in package 1
        //o.m3();  // because it's private

    }


}
