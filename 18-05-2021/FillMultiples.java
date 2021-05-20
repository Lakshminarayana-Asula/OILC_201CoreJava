import java.util.*;
public class FillMultiples {
	
	static int[] getMultiplesArray(int number) {
		int x = 1;
		int[] newArray = new int[10];
		
		if(number <= 0) {
			return null;
		}
		else {
			
			for(int i = 0;i < newArray.length;i++) {
				newArray[i] = number * x;
				x++;
			}
			
			return newArray;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int[] output = getMultiplesArray(sc.nextInt());
		if(output == null)
			System.out.println("null");
		else {
			
			for(int i = 0;i < output.length; i++) {
				System.out.print(output[i]+" ");
			}
			
		}
	}
}
