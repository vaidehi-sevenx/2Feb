package com.vehicledekho;
import java.util.List;

import com.vehicledekho.ui.*;
import com.vehicledekho.*;


public class vehicleManagement {
	public static void main(String[]args) {
		Car car = new Car();
		bike bike = new bike();
		Display display = new Display();
		System.out.println("----------------Welcome to Vehiclebazaar.com----------------");
		
		car.setBrand("Hyundai");
		car.setModel("Creta");
		car.setColor("Silver");
		car.setFuelType("Petrol");
		car.setMaximumSpeed(195);
		car.setNumberOfPassengers(5);
		car.setPrice(100000);
		car.setReviews("Best");
		
		bike.setBrand("Bajaj");
		bike.setModel("Platina");
		bike.setColor("Black");
		bike.setMaximumSpeed(120);
		bike.setPrice(60000);
		bike.setFuelType("Petrol");
		bike.setReviews("Good");
		
		
	}


}
