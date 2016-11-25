// http://beginnersbook.com/2014/01/java-program-to-sum-the-elements-of-an-array/

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 20, 30, 40, 50, 10};
		int sum = 0;
		
		// Advanced for loop
		for (int num : array) {
			sum = sum + num;
		}
		System.out.println("Sum or array elements: " +sum);
	}

}
