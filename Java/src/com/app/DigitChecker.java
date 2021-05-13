package com.app;

public class DigitChecker {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int fno=num/10;//fno=70%10=> fno =0
		int sno=num%10;//sno=74/10=> sno =7
		int checker = fno-sno;
		System.out.println(checker);
	}

}
