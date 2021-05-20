import java.util.*;
public class SumOfArray {

	static int sumOfArray(int[] arr) {
		int sum = 0;
		if(arr.length == 0) {
			sum = -1;
		}
		else {
			
			for(int i = 0;i < arr.length;i++) {
				boolean b = true;
				
				if(arr[i] < 0) {
					sum = -2;
					break;
				}
				else {
					
					for(int j = i-1; j >= 0; j--) {
						if(arr[i] == arr[j]) {
							b = false;
							break;
						}
					}
				}
				
				if(b) {
					sum = sum + arr[i];
				}
			}
		}
		
		return sum;
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

		System.out.println("Sum : " + sumOfArray(arr));
	}

}
