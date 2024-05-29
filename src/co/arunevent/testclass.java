package co.arunevent;

import java.util.Scanner;

public class testclass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID: ");
		int id= sc.nextInt();
		System.out.println("Enter the Name: ");
		String name=sc.next();
		inputClass in =new inputClass(678,"Arun");
		in.setID(id);
		in.setName(name);
		System.out.println("En ID is: "+in.getID());
		
		Base b = new addimpl();
		b.add(id);
		System.out.println("ok"+b.add(id).getID());
		
		
		

	}

}
