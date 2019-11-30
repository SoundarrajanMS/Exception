package org.exceptionHandeling;

public class Exception {
	
	
public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	System.out.println(4);
	System.out.println(5);
	System.out.println(6);
	int a[]=new int[5];
	try {
		
		System.out.println(a[5]);
	
		try {
			  String s =null;
			  char c = s.charAt(1);
			System.out.println(c);
		}
	catch(NullPointerException e)  {
			System.out.println("1st catch");
		}

			catch(Throwable e)
			{
				System.out.println("dont divide a number by 0");

		}
	}
		 catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("dont ask more than index size");
		 }


	try {
		System.out.println(7/0);
	}
	
		catch (Throwable e) {
		System.out.println("it is a super class");
	}
	
	
	finally {
		System.out.println("this is final");
	}
	
	System.out.println(8);
	System.out.println(9);	
	System.out.println(10);
	System.out.println(11);
	System.out.println("this is a recently added code");
	}
}

	







