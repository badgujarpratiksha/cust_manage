package com.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.utils.ValidationRules.validateInput;
import static com.utils.ValidationRules.loginValidation;

import com.customer_management_system.Customer_Management;

public class Tester {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in))
		{
			
			System.out.println("Enter number of customer");
			List<Customer_Management> cs=new ArrayList<>();
			boolean exit=false;
			while(!exit)
			{
			  System.out.println("1.Registration(Sign Up) /n 2.Login /n 3.Display plne /n .Exit");
			  System.out.println("Enter your choice");
			  try
			  {
			   switch(sc.nextInt())
			   {
			   case 1:
				   //registor new customer
				   System.out.println("=================Enter Customer details:=================");
				   System.out.println("fname, lname, email, password,  registrationamount,dob,serviceplans");
				   Customer_Management cust=validateInput(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),cs);
				   cs.add(cust);
				   System.out.println("Customer Rigistered");
				   break;
			   case 2:
				   System.out.println("==================Login=============================");
				   System.out.println("Enter Email and password");
				   System.out.println(loginValidation(sc.next(),sc.next(),cs));
			       break;
			   case 3:
				   System.out.println("==================Customer Details======================");
				   for(Customer_Management a:cs)
					   System.out.println(cs);
				   break;
			   case 4:
				   exit=true;
				   break;
			   
			   }
			   }
			   catch(Exception e)
			  {
				System.out.println(e.getMessage());   
			    sc.nextLine();
			  }
			}
			
			
			
		}

	}

}
