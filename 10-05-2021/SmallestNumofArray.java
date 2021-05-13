import java.util.Scanner;

public class SmallestNumofArray {

	static int findSmallest(int[] arr) {
		int small = arr[0];
		for(int i = 1;i < arr.length;i++) {
			if(small > arr[i]) {
				small = arr[i];
			}
		
		}
		return small;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("enter 10 values into an array");
		for(int i = 0; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Smallest value: " + findSmallest(arr));
	}
}
