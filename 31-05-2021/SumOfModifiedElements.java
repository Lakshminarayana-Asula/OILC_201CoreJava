import java.util.*;
public class SumOfModifiedElements {

	static int getSumOfModifiedElements(int[] arr) {
		int result = 0;
		
		if(arr.length == 0) {
			result = -1;
		}
		else {
			for(int i = 0; i < arr.length; i++) {
			
				if(arr[i] < 0) {
					result = -2;
					break;
				}
				else if(arr[i] == 0) {
					result = -3;
					break;
				}
				
				else if(arr[i] % 2 == 0) {
					result += arr[i] * 2;
				}
				else {
					result += arr[i] / 2;
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range i.e how many values want to enter: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter Values into an array");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Output : " + getSumOfModifiedElements(arr));
	}

}

