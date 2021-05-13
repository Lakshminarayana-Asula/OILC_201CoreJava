import java.util.*;
public class InsertElementInArray {
	
	static int[] insertElement(int[] arr, int loc, int element) {
		
		for(int i = arr.length-2;i >= loc;i--) {
			arr[i+1] = arr[i]; 
		}
		
		arr[loc] = element;
		
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		System.out.println("Enter values into an array");
		
		for(int i = 0;i < arr.length-1;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter Location and value");
		int loc = sc.nextInt();
		int element = sc.nextInt();
		int[] result = insertElement(arr, loc, element);
		
		System.out.println("Result array is: ");
		for(int i = 0;i < result.length;i++) {
			System.out.print(result[i] + " ");
		}
	}

}
