package com.service;

import java.util.Scanner;

import com.model.User;

public class VaultAcess {

	User u= new User();
	
	Scanner s = new Scanner(System.in);
	
	public void get_info() {
		System.out.println("\nRegistration Id : "+u.getId());
		System.out.println("Name of Model : "+u.getVehicaleModel());
		System.out.println("Price of Vehicle : "+u.getPrice());
		System.out.println("Colour of vehicle : "+u.getColour());
		System.out.println("Area : " +u.getArea());
		System.out.println("Owner Name : "+u.getOwnerName());
		System.out.println("Mobile number : "+u.getMobNo());
		System.out.println("Aadhar Number : "+u.getAdharNO());
		System.out.println("\nDetails showed successfully...");
    }
	
	public void Registration() {
		
		System.out.println( "Enter Registration Id : ");
		int id = s.nextInt();
		s.nextLine();
		System.out.println( "Enter Model Name : ");
		String VehicaleModel = s.nextLine();
		System.out.println( "Enter Price of vehicle : ");
		int price = s.nextInt();
		s.nextLine();
		System.out.println( "Enter Colour : ");
		String colour = s.nextLine();
		System.out.println( "Enter Area : ");
		String Area = s.nextLine();
		System.out.println( "Enter Owner Name : ");
		String OwnerName = s.nextLine();
		System.out.println( "Enter Mobile Number : ");
		long mobNo = s.nextLong();
		System.out.println( "Aadhar Card Number : ");
		long AdharNO = s.nextLong();
		
		u.setId(id);
		u.setVehicaleModel(VehicaleModel);
		u.setPrice(price);
		u.setColour(colour);
		u.setArea(Area);
		u.setOwnerName(OwnerName);
		u.setMobNo(mobNo);
		u.setAdharNO(AdharNO);
		
		System.out.println("\nRegistration completed successfully...");
	}
	
	public void Update() {
		int choice = 0;
		
		System.out.println("\n~~~~~~~~~~~~~~~ options for updation ~~~~~~~~~~~~~~~\n\n1.Update Registration id\n2.Update Model Name\n3.Update Price\n4.Update colour\n5.Area\n6.Owner\n7.Mobile no.\n8.Adhar no.\n\nEnter your choice : ");
		choice = s.nextInt();
			
		switch (choice) {
			
			case 1:
				System.out.println( "Enter Registration Id : ");
				int id = s.nextInt();
				u.setId(id);
				System.out.println("\nUpdated successfully...");
				break;
				
			case 2:
				s.nextLine();
				System.out.println("Enter model name : ");
				String VehicaleModel = s.nextLine();
				u.setVehicaleModel(VehicaleModel);
				System.out.println("\nUpdated successfully...");
				break;
			
			case 3 :
				System.out.println("Enter new price : ");
				int price = s.nextInt();
				u.setPrice(price);
				System.out.println("\nUpdated successfully...");
				break;
				
			case 4 :
				s.nextLine();
				System.out.println( "Enter new Colour : ");
				String colour = s.nextLine();
				u.setColour(colour);
				System.out.println("\nUpdated successfully...");
				break;
				
			case 5 :
				s.nextLine();
				System.out.println( "Enter new Area : ");
				String Area = s.nextLine();
				u.setArea(Area);
				System.out.println("\nUpdated successfully...");
				break;
				
			case 6 :
				s.nextLine();
				System.out.println( "Enter Owner Name : ");
				String OwnerName = s.nextLine();
				u.setOwnerName(OwnerName);
				System.out.println("\nUpdated successfully...");
				break;
				
			case 7 :
				System.out.println( "Enter new Mobile Number : ");
				long mobNo = s.nextLong();
				u.setMobNo(mobNo);
				System.out.println("\nUpdated successfully...");
				break;
				
			case 8 :
				System.out.println( "Aadhar new Card Number : ");
				long AdharNO = s.nextLong();
				u.setAdharNO(AdharNO);
				System.out.println("\nUpdated successfully...");
				break;
		}
	}
}	

