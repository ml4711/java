import java.util.Scanner;

public class CircleCalc {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius");
		double radius = sc.nextDouble();
		
		// area = PI*radius
		double area = Math.PI * (radius * radius);
		System.out.println("The area of the circle is: " + area);
		
		// circumference = 2*PI*radius
		double circumference = Math.PI * 2 * radius;
		System.out.println("The circumference of the circle is:" + circumference);
	}

}
