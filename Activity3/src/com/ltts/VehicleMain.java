package com.ltts;

import java.util.Scanner;

public class VehicleMain 
{
	public static void main(String[] args) 
	{
		int a=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Two Wheeler");
		System.out.println("2.Four Wheeler");
		System.out.println("Enter the vehicle type:");
		a = sc.nextInt();
		if (a==2) {
		Fourwheeler veh =  new Fourwheeler("Benz","KA48V1999","Diesel", 400, 1000, "beats", 5);
		veh.displayMake();
		veh.displayBasicInfo();
		veh.displayDetailInfo();
	}
		else if (a==1) {
			Twowheeler two = new Twowheeler("Hero", "KA48V1998", "Petrol", 10, 100, false);
			two.displayMake();
			two.displayBasicInfo();
			two.displayDetailInfo();
		}
}
}
