package com.NULLTORV;

 class XYZ {

    static void demo() {
	System.out.println("hi");	
	}
}

public class  NUllToRV{
	
	public static void main(String[] args) {
		XYZ xyz =null;
		xyz.demo();//With RV
		XYZ.demo();//With CLassName 
	}
}
