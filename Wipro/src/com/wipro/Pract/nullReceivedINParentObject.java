package com.wipro.Pract;

public class nullReceivedINParentObject {

	/*
	 * protected double add(int i) { int x = i+10; System.out.println(x); return x;
	 * }
	 */
	public static void main(String[] args) {
		// nullReceivedINParentObject cdf = new nullReceivedINParentObject();
		// CDF cdf2= new CDF();
		CDF cdf2 = null;
		// cdf.add(10);
		cdf2.add(10);
	}

}

class CDF {//extends nullReceivedINParentObject{

	// protected small can become Public big in parent child class
	// bada wala(public) chote ko accept ka rha hai [public[child class] can accept
	// protected[parent class]]
	/*
	 * public double add(int i) { int x = i+8; System.out.println(x); return x; }
	 */

	static double add(int i) {
		int x = i + 10;
		System.out.println(x);
		return x;
	}

}