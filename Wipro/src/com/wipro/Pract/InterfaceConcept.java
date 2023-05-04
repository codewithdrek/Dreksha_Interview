package com.wipro.Pract;

public interface InterfaceConcept {

	void m1();

	abstract void m7();

	public void m3();

	default void m5() {
    //ADD BODY
	}

	static void m2() {
		//ADD BODY
	}

	private void m6() {
		//ADD BODY
	}

	
	//protected void m4();

	// public ,static , final
}


// Hence in interface don't allow Default Method rest is fine
//Default , static , private required body
//public and abstarct dont required body
