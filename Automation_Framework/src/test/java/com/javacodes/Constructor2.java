package com.javacodes;

public class Constructor2 extends ConstructorExample {
	
	Constructor2() {
		
		super();
		System.out.println("hello");
		
		
	}
	
	public void regularMethod() {
		
	}
	
	public void newMethod() {
		
		super.regularMethod();
		
	}

	public static void main(String[] args) {
		
		ConstructorExample obj1 = new ConstructorExample();
	
		Constructor2 obj = new Constructor2();
		Constructor2 obj2 = new Constructor2();
		
	}

}
