package com.utils;

import java.time.LocalDate;
import java.util.List;

import com.custom_exception.Custom_Exception;
import com.customer_management_system.Customer_Management;
import com.customer_management_system.ServicePlans;

public class ValidationRules {
	
	
	public static void checkDublicateEmail(String em,List<Customer_Management> array) throws Custom_Exception
	{
		//cause contains get object as parameter we have to wrap it 
		Customer_Management cust_val= new Customer_Management(em);
		//contain is list method who check if email is present or not 
		if(array.contains(cust_val))
		{
			throw new Custom_Exception("Dublicate Email Entry!!!");
		}
	}
	
	public static ServicePlans validatePlane(String sp,double amount) throws Custom_Exception
	{
	     ServicePlans serviceplane=ServicePlans.valueOf(sp.toUpperCase());
	     if(serviceplane.getCharges()==amount)
	     {
	    	 return serviceplane;
	     }
	     throw new Custom_Exception("Invalid Plane");
	}
	
	//validateall return customer list
	
	public static Customer_Management validateInput(String fname, String lname, String email, String password, double registrationamount,
			String dob, String  serviceplans,List<Customer_Management> cust_list) throws Custom_Exception
	{
		checkDublicateEmail(email,cust_list);
		ServicePlans ser_plan = validatePlane(serviceplans,registrationamount);
		LocalDate date = LocalDate.parse(dob);
		return new Customer_Management(fname,lname,email,password,registrationamount,date,ser_plan);
		
	}
	
	
	

}
