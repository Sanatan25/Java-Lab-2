import java.util.*;
public class Programming2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The distance between two cities (in km.) is input through the keyboard. Write a java program 
		//to convert and print this distance in meters, feet, inches and centimetres.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the distance in km");
		double km = sc.nextDouble();
		double meter = km * 1000;
		double feet = km * 3280.8399;
		double inch = km * 39370.0787;
		double cm = km * 100000;
		
		System.out.println("Your distance in km is " + km);
		System.out.println(km + " km is " + meter + " meter");
		System.out.println(km + " km is " + feet + " feet");
		System.out.println(km + " km is " + inch + " inch");
		System.out.println(km + " km is " + cm + " centimeter");
	}

}
