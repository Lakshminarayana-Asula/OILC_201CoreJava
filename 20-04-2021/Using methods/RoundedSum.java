
public class RoundedSum {
	static int sum=0;
	static String roundedSum(int n) {
			if(n != 0) {
				int r = n%10;
				if(r >= 5) {
					n=(n/10+1)*10;
				}
				else if((r < 5) && (r > 0)) {
					n = (n / 10) * 10;
				}
			}
			return "" + (sum + n);
		}
	public static void main(String[] args) {
		int[] a=new int[args.length];
		try {
			for(int i=0;i<a.length;i++) {
				a[i]=Integer.parseInt(args[i]);
				if(a[i] < 0)
					System.out.println(10/0);
				sum = Integer.parseInt(roundedSum(a[i]));
			}
			System.out.println(sum);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}
