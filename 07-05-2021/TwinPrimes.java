
public class TwinPrimes {
	static String getTwinPrimes(int num1, int num2) {
		String s = "";
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
				s = s + a[i] + "," + a[i+1] + ";";
			}
		}
		return s;
	}

	public static void main(String[] args) {
		int num1 = 2, num2 = 35;
		boolean b = true;
		if((num1 < 1) || (num2 > 100) || (num1 >= num2)) {
			System.out.println("Error");
			b = false;
		}
		if(b) {
			System.out.print(getTwinPrimes(num1, num2));
		}
	}

}
