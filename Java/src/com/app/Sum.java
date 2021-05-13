package com.app;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		if(num1>0 &&num2>0 &&num3>0) {
			int res1=((num1/10)+1)*10;
			int res2=((num2/10)+1)*10;
			int res3=((num3/10)+1)*10;
			int result=res1+res2+res3;
			System.out.println("sum of the rounded values:" +result);
		}
		else {
			System.out.println("error");
			
		}
	}
		catch(Exception e) {
			System.out.println("error");
		}

	}
}



