package com.wipro.Pract;

///// /////////////////////////////////////
public class AccessModifierOverriding {

	protected void add() {

	}

	public static void main(String[] args) {

	}
}

class c extends AccessModifierOverriding {

	public void add() {

	}

}

///////WRONG//////////////////

class AccessModifierOverriding1 {

	public void add() {

	}

	public static void main(String[] args) {

	}
}

class c1 extends AccessModifierOverriding1 {

	/*
	 * protected void add() {
	 * 
	 * }
	 */

}

//Overriding  Access modifier

//WRONG(BDE SE CHOTA IS NOT POSSIBLE)
//Parent class  : public 
//Child  class:  protected   


//RIGHT(CHOTE SE BADA IS POSSIBLE)
//Parent class  : protected 
//Child  class:  public    [bde wala(public) chote ko(Protected) accept kar sakta hai]
