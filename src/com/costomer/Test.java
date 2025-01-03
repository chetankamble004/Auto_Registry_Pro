package com.costomer;

import java.util.Scanner;
import com.service.VaultAcess;

public class Test {

	public static void main(String[] args) {
		
		VaultAcess v = new VaultAcess();
		Scanner s = new Scanner(System.in);
		
		int ch = 0;
		while(ch != 4) {
		System.out.println("\n~~~~~~~~~~~~~~~~~~ Welcome to vehicles registration system options ~~~~~~~~~~~~~~~~~~");
		System.out.println("\nChoose Option From Below :- ");
		System.out.println("1.registration\n2.view\n3.update\n4.Exit\nEnter your choice : ");
		 ch = s.nextInt();
		
		switch(ch)
		{
			case 1 :
				v.Registration();
				break;
			
			case 2 :
				System.out.println("\n----------------------- Your registered details -----------------------");
				v.get_info();
				break;
		
			case 3 :
				v.Update();
				break;
				
			case 4 :
				System.out.println("\nExiting successfully...");
				break;
				
			default :
				System.out.println("Invalid choice!!!" );
		}
		}
	}

}
