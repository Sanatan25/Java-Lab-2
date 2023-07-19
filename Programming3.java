import java.util.*;
public class Programming3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enter the basic salary of an employee of an organization through the keyboard. His dearness 
		//allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic 
		//salary. Write a java program to calculate his gross salary. Print the DA, HRA and Gross 
		//salary
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the salary");
		
		double basicsalary = sc.nextInt();
		double da = (basicsalary * (40.0 / 100));
		double hra = (basicsalary * (20.0 / 100));
		double gross = (basicsalary + da + hra);
		System.out.println("your basic salary is " + basicsalary);
		System.out.println("your da is " + da);
		System.out.println("your hra is " + hra);
		System.out.println("your gross salary is " + gross);

	}

}
