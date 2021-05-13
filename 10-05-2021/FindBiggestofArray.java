import java.util.*;
public class FindBiggestofArray {
	
	static int findBiggest(int[] arr) {
		int big = 0;
		for(int i = 0;i < arr.length;i++) {
			if(big < arr[i]) {
				big = arr[i];
			}
		
		}
		return big;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("enter 10 values into an array");
		for(int i = 0; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Big value is :" + findBiggest(arr));
	}

}
