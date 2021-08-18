package com.ltts;
import com.ltts.*;
import java.util.*;

public class DeluxeACRoom extends DeluxeRoom {

	public DeluxeACRoom() {
		super();
		setRatePerSqFeet(12);
	}

	public DeluxeACRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi, 12);
	}
	
	public int calculateTariff() {
		
		return getRatePerSqFeet()*super.getNumberOfSqFeet();
	}

}