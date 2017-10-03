package com.rk.practice.newinterface;

// Use Default and Static methods in Java 8 Interface
public interface Interface2 {
	
	// Method with no implementation
	public void method2();
	
	// Default method in interface
	default void log(String str) {
		System.out.println("LOG in Interface2:: " + str);
	}
	
	// Static Method in interface
	static void print(String str) {
		System.out.println("Print in Interface2:: " + str);
	}
}
