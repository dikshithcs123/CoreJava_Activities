package com.ltts;

import java.util.Scanner;

public class demo_operator {
	public static void main(String[] args) {
		System.out.println("Welcome to the program");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the vallue for a : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the vallue for b : ");
		int b = sc.nextInt();
		
		System.out.println("add : "+(a+b));
		System.out.println("Sub : "+(a-b));
		System.out.println("Mul : "+(a*b));
		System.out.println("Div : "+(a/b));
		System.out.println("Rem : "+(a%b));
		//System.out.print(a+b);
		if( a!= b)
		{
			System.out.println("a is not equal to b");
		}
		else
		{
			System.out.println("a is equal to b");
		}
		
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("b is greater than a");
		}
		
		System.out.println("For loop");
		for( int i = 0; i < 5; i++)
		{
			System.out.print(i);
		}
		System.out.println(" ");
		
		System.out.println("While loop");
		int i = 5;
		while(i <10)
		{
			System.out.print(i);
			i++;
		}
		
		sc.close();
		
	}

}
