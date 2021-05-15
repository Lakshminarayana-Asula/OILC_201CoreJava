import java.util.*;
public class BinarySearch {

	static int[] bubbleSort(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr.length-1;j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		return arr;
	}
	
	static String binarySearch(int[] arr, int find) {
		String result = "";
		int low = 0, mid, high = arr.length-1;
		mid = (low + high) / 2;
		boolean b = false;
		
		while(low <= high) {
			if(find == arr[mid]) {
				result += "Element is found and position is : " + (mid + 1) + "\n";
				b = true;
				break;
			}
			else if(find < arr[mid]) {
				high = mid - 1;
			}
			else if(find > arr[mid]) {
				low = mid + 1;
			}
			
			mid = (low + high) / 2;
		}
		
		if(b == false) {
			result += "Element is not Found";
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sort = new int[6];
		System.out.println("Enter values into an array");
		for(int i = 0;i < sort.length;i++) {
			sort[i] = sc.nextInt();
		}
		
		sort = bubbleSort(sort);
		System.out.println("Sorting array is");
		for(int i = 0;i < sort.length;i++) {
			System.out.print(sort[i] + " ");
		}
		
		System.out.println("\nEnter searching element");
		int find = sc.nextInt();
		
		System.out.println(binarySearch(sort, find));
	}

}
