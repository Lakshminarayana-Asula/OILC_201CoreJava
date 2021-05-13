import java.util.*;
public class SortingArray {
	
	static int[] sorting(int[] arr) {
		
		for(int i = 0; i < arr.length;i++) {
			for(int j = i+1;j < arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter array elements");
		for(int i = 0;i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] sort = sorting(arr);
		System.out.println("sorting elements are");
		
		for(int i = 0; i < sort.length;i++) {
			System.out.println(sort[i]);
		}
		
 	}
}
