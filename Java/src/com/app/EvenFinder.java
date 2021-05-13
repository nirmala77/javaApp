package com.app;

public class EvenFinder {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			System.out.println(num%2==0);
		}catch(Exception e)
		{
			System.out.println("error");
		}
	}

}
