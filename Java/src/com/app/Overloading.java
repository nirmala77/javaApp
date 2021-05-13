package com.app;

public class Overloading {
	public void m1() {
		System.out.println("no-arg method");
	}
	public void m2(int i) {
		System.out.println("int-arg method"+i);
	}
	public void m3(double d) {
		System.out.println("double-arg method"+d);
	}
	
	public static void main(String[] arg) {
		Overloading o=new Overloading();
		o.m1();
		o.m2(100);
		o.m3(10.5);
	}

	}

