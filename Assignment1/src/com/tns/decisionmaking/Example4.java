package com.tns.decisionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args)
	{
		//switch 
		Scanner s=new Scanner(System.in);
		int a=s.next().charAt(0);
		switch(a)
		{
			case 'a':
				System.out.println("Radha");
				break;
				case 'b':
				System.out.println("Hello");
				break;
				case 'c':
				System.out.println("Ram");
				break;
				default:
					System.out.println("invalid input");
					s.close();
	        	}
			}

}
