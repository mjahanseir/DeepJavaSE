package LiangExcercise10thAll.Exercise_13.Exercise_13_18; /*********************************************************************************
* (Use the Rational class) Write a program that computes the following summation *
* series using the Rational class:                                               *
*                                                                                *
*          1 / 2 + 2 / 3 + 3 / 4 + ... + 98 / 99 + 99 / 100                      *
*                                                                                *
* You will discover that the output is incorrect because of integer overflow     *
* (too large). To fix this problem, see Programming Exercise 13.15.              *
*********************************************************************************/
import LiangExcercise10thAll.Exercise_13.Exercise_13_19.Rational;

import java.math.BigInteger;

public class Exercise_13_18 {
	/** Main method */
	public static void main(String[] args) {
		// Create a Rational object
		LiangExcercise10thAll.Exercise_13.Exercise_13_19.Rational r = new LiangExcercise10thAll.Exercise_13.Exercise_13_19.Rational(BigInteger.ONE, new BigInteger("2"));

		// Add a series of Rationol objects to r
		for (BigInteger i = r.getNumerator().add(BigInteger.ONE);
			  i.compareTo(new BigInteger("100")) <= 0;
			  i = i.add(BigInteger.ONE)) {
			r = r.add(new Rational(i, i.add(BigInteger.ONE)));
		}

		// Display results
		System.out.println(r);
	}
}