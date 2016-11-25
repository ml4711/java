import java.util.Scanner;

public class TriangleCalc {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the width of the Triangle: ");
		double base = scanner.nextDouble();
		
		System.out.println("Enter the height of the Triangel: ");
		double height = scanner.nextDouble();
		
		// area = (width * height) / 2
		double area = (base * height) / 2;
		System.out.println("Area of the Triangle: " + area);
	}

}
