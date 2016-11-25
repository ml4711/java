import java.util.Scanner;

public class CheckEvenOdd {
	public static void main(String [] args) {
		int temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		temp = scan.nextInt();
		boolean evenodd = true;
		
		while (temp > 0) {
			temp--;
			if (evenodd)
				evenodd=false;
			else
				evenodd=true;
		}
		if (evenodd)
			System.out.println("Your number was even");
		else
			System.out.println("Your number was odd");
	}
}
