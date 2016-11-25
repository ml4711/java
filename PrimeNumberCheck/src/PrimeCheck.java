// http://beginnersbook.com/2014/01/java-program-to-check-prime-number/

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		int temp;
		boolean isPrime = true;
		// TODO: Learn more about Scanner
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number for check:");
		
		// capture the input in an integer
		int num = scan.nextInt();
		
		// TODO: Learn more about for loops
		for (int i=2;i<=num/2;i++) {
			// TODO: Learn what the below variable means
			temp=num%i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		
		// If isPrime is true, then the number is prime else not
		if (isPrime)
			System.out.println(num + " is Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
	}

}
