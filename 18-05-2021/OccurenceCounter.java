import java.util.*;
public class OccurenceCounter {
	
	static int getCount(int[] inputArray, int givenNumber) {
		int count = 0;
		
		for(int i = 0; i<inputArray.length; i++) {
			
			if(inputArray[i] == givenNumber) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter values into an array");
		for(int i = 0;i < size;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter Searching element");
		 System.out.println("Count: " + getCount(arr, sc.nextInt()));
	}
}
