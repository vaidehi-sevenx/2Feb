package com.vehicledekho.ui;
import java.util.List;

import com.vehicledekho.*;

public class Display {
	public static void printVehicle(List<Vehicle> vehicle) {
		for (Vehicle vehicles : vehicle) {
			if(vehicles instanceof Car) {
				Car car = (Car) vehicles;
				System.out.println("Company name\t" +car.getBrand());
				System.out.println("Fuel type\t" +car.getFuelType());
				System.out.println("Color\t" +car.getColor());
				System.out.println("Price\t" +car.getPrice());
				System.out.println("Maximum Speed\t" +car.getMaximumSpeed());
				System.out.println("Model\t" +car.getModel());
				System.out.println("Reviews\t" +car.getReviews());
			}else if(vehicles instanceof bike) {
				bike bike = (bike)vehicles;
				System.out.println("Company name\t" +bike.getBrand());
				System.out.println("Fuel type\t" +bike.getFuelType());
				System.out.println("Color\t" +bike.getColor());
				System.out.println("Price\t" +bike.getPrice());
				System.out.println("Maximum Speed\t" +bike.getMaximumSpeed());
				System.out.println("Model\t" +bike.getModel());
				System.out.println("Reviews\t" +bike.getReviews());
			}
		}
		
	}

}
