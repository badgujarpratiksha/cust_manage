package com.utils;

import com.custom_exception.Custom_Exception;
import com.customer_management_system.Customer_Management;

public class ValidationRules {
	
	
	public static void checkDublicateEmail(String em,Customer_Management[] array) throws Custom_Exception
	{
		for(Customer_Management a:array)
		{
			if(a!=null && a.equals(array))
			{
				throw new Custom_Exception("Dublicate Email Entry!!!");
			}
		}
	}
	
//	public static Customer_Management validationInput(String fname,String lname,String email, String password, double registrationamount,String dob,String serviceplans,Customer_Management m)
//	{
//		checkDublicateEmail(email,m);
		
//	}

}
