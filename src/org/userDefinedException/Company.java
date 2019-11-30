package org.userDefinedException;

public class Company {
private void search() {
	String name="Soundar";
	if(name.startsWith("ra"))
		{
		System.out.println("Employee found");
		} else
		try {
			throw new ParentuserDefExcep();
		} catch (ParentuserDefExcep e) {
			System.out.println(e.getMessage());
     	e.printStackTrace();
			
		}
	finally
	{
		System.out.println("Close Database");
	}
	try {
	System.out.println(1/0);
} 
	catch(Throwable t) {
		System.out.println("its not divisible");}
	}
public static void main(String[] args) {
	Company c = new Company();
	c.search();
}
}
