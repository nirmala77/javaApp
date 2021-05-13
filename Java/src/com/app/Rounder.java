package com.app;

public class Rounder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num=Integer.parseInt(args[0]);
			try {
				if(num%2==0)
				{
					System.out.println("odd");
				}
				else
				{
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
