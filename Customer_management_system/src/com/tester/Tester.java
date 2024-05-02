package com.tester;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import static com.utils.ValidationRules.validateInput;
import static com.utils.CMSutils.loginValidation;
import static com.utils.CMSutils.unsubscribeUser;
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
			  System.out.println("1.Registration(Sign Up)  2.Login 3.Change Password  3.Display plane  4.Exit");
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
				   cust=loginValidation(sc.next(),sc.next(),cs);
				   System.out.println("Login success"+cust);
			       break;
			   case 3:
				   System.out.println("===================Change Password====================");
				    System.out.println("Enter new pass");
				    cust=loginValidation(sc.next(),sc.next(),cs);
				    cust.setPassword(sc.next());
				    System.out.println("Password changed");
				    
				   break;
			   case 4:
				   System.out.println("==================Customer Details======================");
				   for(Customer_Management a:cs)
					   System.out.println(a);
				   break;
			   case 5:
				   System.out.println("==================Unsubscribe=========================");
				   System.out.println("Enter email pass");
				   System.out.println("Remove Successfull"+ unsubscribeUser(sc.next(),cs));
			   case 6:
				   Collection.sort(cs<Customer_Managemt>);
				   break;
			   case 7:
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
