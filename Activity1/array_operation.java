package com.ltts;

import java.util.Scanner;

public class array_operation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[5];
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 7;
		arr[3] = 8;
		arr[4] = 9;
		
		for(int i = 0; i < 5; i++)
		{
			System.out.print(arr[i]);
		}
		
		//System.out.println(arr[0]);
		for(int i = 0; i < 5; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < 5; i++)
		{
			sum = sum + arr[i];
			System.out.println(arr[i]);
		}
		
		System.out.println("sum :"+sum);
		System.out.println("end");
	}

}
