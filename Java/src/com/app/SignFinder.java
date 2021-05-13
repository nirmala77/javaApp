package com.app;

public class SignFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int num=Integer.parseInt(args[0]);
		if(num==0) {
			System.out.println("zero values");
		}
		else if(num>0) {
			System.out.println("positive values");
		}
		else {
			System.out.println("negative values");
		}
		}
		catch(Exception e) {
			System.out.println("error");
		}

	}

}
