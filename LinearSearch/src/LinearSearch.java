import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int counter, num, item, array[];
		
		// to capture user input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		num = input.nextInt();
		
		// Creating array to store all the numbers
		array = new int[num];
		System.out.println("Enter " + num + " integers");
		
		// Loop to store each number in array
		for (counter=0;counter<num;counter++) {
			array[counter] = input.nextInt();
		}
		
		System.out.println("Enter the search value:");
		item = input.nextInt();
		
		for (counter=0;counter<num;counter++) {
			if (array[counter] == item) {
				System.out.println(item + " is present at location " + (counter+1));
				// Item is found so to stop the search and to come out of the loop use break statement
				break;
			}
		}
		if (counter == num)
			System.out.println(item + " doesn't exist in array.");
	}

}
