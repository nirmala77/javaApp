package com.app;

public class OddRounder {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		try {
			if(num%2==0)
				System.out.println("even number");	
			else {
		
		int a=num/10;
		int mul=(a+1)*10;
		System.out.println(mul);
	
			}		
	}
		catch(Exception e) {
			System.out.println("error");
		}

	}

}
