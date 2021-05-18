import java.util.*;
public class IncrDecr {

	static  int[] getIncreaseDecrease(int num) {
		int[] res;
		if(num <= 1 || num >= 20) {
			res = null;
		}
		else {
			res = new int[num];
			int num2 = num;
			int start = 1;
			int index = 0;
			for(int i = 1;i <= num;i++) {
				if(i % 2 == 0) {
					res[index] = num2;
					num2--;
					index++;
				}
				else {
					res[index] = start;
					start++;
					index++;
				}
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		
		int[] res = getIncreaseDecrease(sc.nextInt());
		if(res == null) {
			System.out.println("Null");
		}
		else {
			System.out.println("Result array is: ");
			for(int i = 0;i < res.length;i++) {
				System.out.print(res[i] + ",");
			}
		}
	}

}
