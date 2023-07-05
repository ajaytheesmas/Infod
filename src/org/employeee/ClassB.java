package org.employeee;

public class ClassB {
	
	private void employeeDetails(int Age) {
		System.out.println ("Age" +Age);
	}
	private void employeeDetails(long Moblie) {
	
		System.out.println ("Moblie" +Moblie);
	}
	public void main (String[] args) 
	{
		ClassB g =new ClassB ();	
		g.employeeDetails (22);	
		g.employeeDetails (123456789l);
}
}


