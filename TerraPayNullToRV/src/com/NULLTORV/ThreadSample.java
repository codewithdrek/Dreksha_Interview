package com.NULLTORV;

class ThreadSample{
	
	public static void main(String[] args) {
		
	/*	new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread is started");
			}
		}).start();*/
		
	Runnable r1= () -> System.out.println("Thread is started");
		
	new Thread(r1).start();
		
		
	}
}

//sample rest api that will take an input string and
//response will be hello <input string>
