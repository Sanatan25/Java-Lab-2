import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your time in sec");
		double time = sc.nextDouble();
		double distance = (1.0/2.0)* 32.174*time*time;
		
		System.out.println("Your distance is "+ distance);
	}

}
