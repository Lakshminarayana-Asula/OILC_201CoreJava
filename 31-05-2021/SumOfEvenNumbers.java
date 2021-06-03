import java.util.*;
public class SumOfEvenNumbers {

	static int getSumOfEvenNumbers(int[] arr) {
		int result = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				result += arr[i];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range i.e how many values want to enter:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter Values into an array");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Sum Of Even Numbers is : " + getSumOfEvenNumbers(arr));
	}


}
