package aaMID601;

import S10p2InheritanceEquals.House;

import java.util.Objects;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return (this.value % 2 == 0);
    }
    public boolean isOdd() {
        return  (this.value % 2 != 0);
    }
    public boolean isPrime() {
        for (int i = 2; i < this.value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isEven(MyInteger value) {
        return value.isEven();
    }
    public boolean isOdd(MyInteger value) {
        return value.isOdd();
    }
    public boolean isPrime(MyInteger value) {
        return value.isPrime();
    }

    public boolean equals(int value){
        return (this.value==value);
    }

    public boolean equals(MyInteger value) {
        return (this.value==value.getValue());
    }


    public static int parseInt(char[] s){
        int temp=0;
        for(int i=0;i<s.length;i++)
            if(Character.isDigit(s[i]))
                temp=temp*10+Integer.parseInt(""+s[i]);
            else
                return -1;
        return temp;
    }


    public static int parseInt(String s){
        int temp=0;
        for(int i=0;i<s.length();i++)
            if(Character.isDigit(s.charAt(i)))
                temp=temp*10+Integer.parseInt(""+s.charAt(i));
            else return -1;
        return temp;
    }
}
