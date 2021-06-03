import java.util.*;
public class NearestMinValue {

	int getNearestMinValue(int[] arr) {
		int result;
		result = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(result > arr[i]) {
				result = arr[i];
			}
		}
		
		return result - 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NearestMinValue nm = new NearestMinValue();
		System.out.println("Enter Range i.e how many values want to enter:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter Values into an array");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Nearest Minimum value is : " + nm.getNearestMinValue(arr));
	}

}
