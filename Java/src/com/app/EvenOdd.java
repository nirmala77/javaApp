package com.app;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				try {
					
					int num = Integer.parseInt(args[0]);
					if(num%2==0)
					{
						System.out.println("even");
					}else
						System.out.println("odd");
				}catch(Exception e)
				{
					System.out.println("error");
				}
	}
}

		


	


