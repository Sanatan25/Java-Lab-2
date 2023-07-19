import java.util.*;
public class Programming4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a java program that reads an integer between 0 and 1000 and adds all the digits in the 
		//integer. For example, if an integer is 749, the sum of all its digits is 20.
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		double s  = num % 10;
		double d =((int)num / 10);
		d = d % 10;
		double f = ((int)num / 100);
		f = f % 10;
		
		System.out.println(s + d + f);
		

	}

}
