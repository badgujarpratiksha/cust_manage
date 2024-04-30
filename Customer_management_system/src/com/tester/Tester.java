package com.tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.customer_management_system.Customer_Management;
import com.customer_management_system.ServicePlans;

public class Tester {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in))
		{
			
			System.out.println("Enter number of customer");
			Customer_Management[] cs=new Customer_Management[sc.nextInt()];
			boolean exit=false;
			while(!exit)
			{
			  try
			  {
			  System.out.println("1.Sign up /n 2.Exit");
			  System.out.println("Enter your choice");
			   switch(sc.nextInt())
			   {
			   case 1:
				   System.out.println("Enter Customer details");
				   System.out.println("fname, lname, email, password,  registrationamount,dob,serviceplans");
				 
				   break;
			   case 2:
				   exit=true;
				   break;
			   
			   }}
			   catch(Exception e)
			  {
				System.out.println(e.getMessage());   
			    sc.nextLine();
			  }
			}
			
			
			
		}

	}

}
