
public class Sum {
	static int x = 0;
	static String sumArgs(int a) {
			if(a != 0) {
				a = (a / 10 + 1) * 10;
			}
			return "" + (x + a);
	}
	public static void main(String[] args) {
		int[] a = new int[args.length];
		try {
			for(int i = 0 ; i < a.length; i++) {
				a[i] = Integer.parseInt(args[i]);
				if(a[i] < 0)
					System.out.println(10 / 0);
				x = Integer.parseInt(sumArgs(a[i]));
			}
			System.out.println(x);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
