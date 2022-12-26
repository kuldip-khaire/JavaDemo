package com.velocity.demo;

interface Sayable {
	void saySomething();
}

public class MethodReference {

	public void sayMore() {
		System.out.println("Hello, I am in non static method");
	}
	
	public static void sayNothing() {
		System.out.println("I am silent...!");
	}

	public static void main(String[] args) {
		
		MethodReference mr = new MethodReference();
		
		Sayable s = mr :: sayMore;
		
		s.saySomething();
		
		Sayable s2 = MethodReference :: sayNothing;
		s2.saySomething();

	}

}
