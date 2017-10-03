package com.rk.practice.newinterface;

public class MultipleInterfaceClass implements Interface1, Interface2 {
	
	public void method1() {
		log("Method1");
		
		Interface2.print("Method1");
	}
	
	public void method2() {
		log("Method2");
		
		Interface1.print("Method2");
	}

	// This method exists in more than one interface. So, we must implement here.
	@Override
	public void log(String str) {
		Interface1.super.log(str);
		Interface2.super.log(str);
	}
	
	public static void main(String[] args) {
		MultipleInterfaceClass obj = new MultipleInterfaceClass();
		obj.method1();
		System.out.println();
		obj.method2();
	}
}
