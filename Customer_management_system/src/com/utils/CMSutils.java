package com.utils;

import java.util.List;

import com.custom_exception.Custom_Exception;
import com.customer_management_system.Customer_Management;

public class CMSutils {

	public static Customer_Management loginValidation(String email,String pass,List<Customer_Management> cl) throws Custom_Exception
	{
		Customer_Management cs=new Customer_Management(email);
		int index=cl.indexOf(cs);
	    if(index == -1)
	    {
	    	throw new Custom_Exception("Email not Exits");
	    }
	    Customer_Management cust_s=cl.get(index);
	    if(cust_s.getPassword().equals(pass) )		       
	       {
	    	
	    	return cust_s;
		   };
		   throw new Custom_Exception("Incorrect Password");
		   
//	    for(Customer_Management a:cl)
//	    {
//	        if(a.getPassword().equals(pass) && a.getEmail().equals(email))
//	       {
//	    	return "Login success";
//	       }
//	    }
//	    
	   
	}
   public static String unsubscribeUser(String email,List<Customer_Management> list) throws Custom_Exception
   {
	   Customer_Management cs=new Customer_Management(email);
	   int index = list.indexOf(cs);
	   if(index == -1)
	   {
		   throw new Custom_Exception("User Not Exits");
	   }
	   
	   return "Remove Index"+list.remove(index).getFname();
   }
}

