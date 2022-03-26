//public class MyInteger
//{
//    private int value;				// the wrapped value
//
//    public MyInteger(int v)			// 1-arg constructor, we won't bother with a 0-arg constructor
//    {
//        value=v;
//    }
//
//    public int getValue()			// accessor
//    {
//        return value;
//    }
//
//    public boolean isEven()			// methods to determine if the int value stored in this MyInteger is even, odd or prime
//    {
//        return value%2==0;
//    }
//
//    public boolean isOdd()
//    {
//        return value%2==1;
//    }
//
//    public boolean isPrime()
//    {
//        int divisor=2;				// we divide the int value by all numbers between 2 and value-1.  If any divide evenly, then this is not a prime number
//        while(divisor<value&&value%divisor!=0)
//            divisor++;
//        if(divisor==value) return true;		// we found no divisors between 2 and value-1, so this must be prime
//        else return false;					// otherwise we found a divisor, this int value is not prime
//    }
//
//
//
//
//
//
//
//
//    public static boolean isEven(int v)		// static methods to test if an int value is even/odd/prime
//    {
//        MyInteger temp = new MyInteger(v);	// notice how we use modularity here by creating a MyInteger and then using the MyInteger isEven(), isOdd() or isPrime() method
//        return temp.isEven();
//    }
//
//    public static boolean isOdd(int v)
//    {
//        MyInteger temp = new MyInteger(v);
//        return temp.isOdd();
//    }
//
//    public static boolean isPrime(int v)
//    {
//        MyInteger temp = new MyInteger(v);
//        return temp.isPrime();
//    }
//
//    public static boolean isEven(MyInteger m)	// three more static methods to test if a MyInteger object stores an even/odd/prime number
//    {
//        return m.isEven();
//    }
//
//    public static boolean isOdd(MyInteger m)
//    {
//        return m.isOdd();
//    }
//
//    public static boolean isPrime(MyInteger m)
//    {
//        return m.isPrime();
//    }
//
//    public boolean equals(int x)				// is this MyInteger's value equal to the parameter passed?
//    {
//        return value==x;
//    }
//
//    public boolean equals(MyInteger m)			// same method but in this case, we are passed a MyInteger parameter so must withdraw its value for testing
//    {
//        return value==m.getValue();
//    }
//
//    public static int parseInt(char[] array)	// given an array of chars like ['1', '5', '3', '8'], convert to an actual int value, in this case 1538
//    {
//        int temp=0;
//        for(int i=0;i<array.length;i++)			// for each char in the array
//            if(Character.isDigit(array[i]))		// if that char is a digit then add it to the previous number*10
//                temp=temp*10+Integer.parseInt(""+array[i]);
//            else return -1;						// otherwise we found a non-digit, return -1 as an error code
//        return temp;
//    }
//
//    public static int parseInt(String str)		// same method except that we are dealing with a String so we change array[i] to str.charAt(i)
//    {
//        int temp=0;
//        for(int i=0;i<str.length();i++)
//            if(Character.isDigit(str.charAt(i)))
//                temp=temp*10+Integer.parseInt(""+str.charAt(i));
//            else return -1;
//        return temp;
//    }
//
//    public static MyInteger parseIntToMyInt(char[] array)	// same as the above two methods except instead of returning the value as an int (say 1538), we wrap it in a MyInteger and return the new object
//    {
//        int temp=0;
//        for(int i=0;i<array.length;i++)
//            if(Character.isDigit(array[i]))
//                temp=temp*10+Integer.parseInt(""+array[i]);
//            else return new MyInteger(-1);
//        return new MyInteger(temp);
//    }
//
//    public static MyInteger parseIntToMyInt(String str)
//    {
//        int temp=0;
//        for(int i=0;i<str.length();i++)
//            if(Character.isDigit(str.charAt(i)))
//                temp=temp*10+Integer.parseInt(""+str.charAt(i));
//            else return new MyInteger(-1);
//        return new MyInteger(temp);
//    }
//}