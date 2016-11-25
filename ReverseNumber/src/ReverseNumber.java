import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int reversenum = 0;
		System.out.println("Input your number and press Enter: ");
		
		// This statement will capture the user input
		Scanner in = new Scanner(System.in);
		
		// captured input would be stored in number num
		num = in.nextInt();
		
		// while loop: Logic to find out the reverse number
		while (num != 0 ) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num%10;
			num = num/10;
		}
		
		System.out.println("Reverse number of input number is: " + reversenum);
	}

}
