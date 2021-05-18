import java.util.*;
public class TwinPrimes {
	static String getTwinPrimes(int num1, int num2) {
		String s = "";
		if((num1 <= 0 || num2 <= 0) || (num1 > 100 || num2 > 100) || (num1 >= num2)) {
			s = "Error";
		}
		else {
			int[] a = new int[40];
			int x = 0;
			for(int i = num1;i <= num2;i++) {
				boolean b = true;
				
				for(int j = 2;j < i;j++) {
					
					if(i % j == 0) {
						b=false;
						break;
					}
				}
				if(b) {
					a[x] = i;
					x++;
				}
			}
			
			for(int i = 0; i < x;i++) {
				if(a[i+1] - a[i] == 2) {
					s += a[i] + "," + a[i+1] + ";";
				}
			}
		}
			
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		System.out.print(getTwinPrimes(sc.nextInt(), sc.nextInt()));
	}

}
