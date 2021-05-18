import java.util.Scanner;
public class OddCount {
	static int getOddCount(int[] arr) {
		int res = 0;
		int even = 0;
		if(arr.length != 5) {
			res = -1;
		}
		else if(arr == null) {
			res = -4;
		}
		else {
			for(int i = 0;i < arr.length;i++) {
				if(arr[i] <= 0) {
					res = -2;
					break;
				}
				else if(arr[i] % 2 ==0) {
					even++;
				}
				else {
					res = res + 1;
				}
			}
			
			if(even == arr.length) {
				res = -3;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements");
		for(int i = 0;i < size;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("OddCount is: " + getOddCount(arr));

	}
}
