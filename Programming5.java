import java.util.*;
public class Programming5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the hemisphere");
		double r = sc.nextDouble();
		double sa = 3 * Math.PI * Math.sqrt(r);
		double v = (2.0/3.0) * Math.PI * Math.cbrt(r);
		
		System.out.println("Surface area of hemisphere " + sa);
		System.out.println("Volume of the hemisphere " + v);

	}

}
