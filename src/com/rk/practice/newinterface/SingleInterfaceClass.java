package com.rk.practice.newinterface;

public class SingleInterfaceClass implements Interface1 {
	
	public void method1() {
		// Can use default and static methods in implementations
		log("Method1");
		
		// static reference
		Interface1.print("Method1");
	}
	
	public static void main(String[] args) {
		SingleInterfaceClass obj = new SingleInterfaceClass();
		obj.method1();
	}
}
