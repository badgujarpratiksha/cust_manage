package com.customer_management_system;

import java.time.LocalDate;

public class Customer_Management implements Comparable<Customer_Management> {
    private static int custid;
    static {
    	custid=0;
    }
    private String fname,lname,email,password;
    private double registrationamount;
    private LocalDate dob;
    private ServicePlans serviceplans;
	
    
    public Customer_Management(String fname, String lname, String email, String password, double registrationamount,
			LocalDate dob, ServicePlans serviceplans) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.registrationamount = registrationamount;
		this.dob = dob;
		this.serviceplans = serviceplans;
		custid++;
	}


	public Customer_Management(String em) {
		
		this.email=em;
	}


	public static int getCustid() {
		return custid;
	}


	public String getFname() {
		return fname;
	}


	public String getLname() {
		return lname;
	}


	public String getEmail() {
		return email;
	}


	public String getPassword() {
		return password;
	}


	public double getRegistrationamount() {
		return registrationamount;
	}


	public LocalDate getDob() {
		return dob;
	}


	public ServicePlans getServiceplans() {
		return serviceplans;
	}


	public static void setCustid(int custid) {
		Customer_Management.custid = custid;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setRegistrationamount(double registrationamount) {
		this.registrationamount = registrationamount;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public void setServiceplans(ServicePlans serviceplans) {
		this.serviceplans = serviceplans;
	}


	@Override
	public String toString() {
		return "Customer_Management [Customer Details = \"Customer Id "+custid+"fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
				+ password + ", registrationamount=" + registrationamount + ", dob=" + dob + ", serviceplans="
				+ serviceplans + "]";
	}
    
    
    @Override
    public boolean equals(Object o)
    {
       System.out.println("In customer equals");
       Customer_Management cust=(Customer_Management)o;
       if(o instanceof Customer_Management)
       {
          return this.email.equals(cust.email) ; 
       }
       return false; 	
    }


	@Override
	public int compareTo(Customer_Management o) {
		// TODO Auto-generated method stub
		return this.email.compareTo(o.email);
		
	}
    
 
    
    
    
    
}
