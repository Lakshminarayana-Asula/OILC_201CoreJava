
public class Sum {

	public static void main(String[] args) {
		try {
			int[] a=new int[args.length];
			int x=0;
			for(int i=0;i<a.length;i++) {
				a[i]=Integer.parseInt(args[i]);
				if(a[i]<0)
					System.out.println(10/0);
				if(a[i]!=0)
					a[i]=(a[i]/10+1)*10;
			}
			for(int i=0;i<a.length;i++) {
				x=x+a[i];
			}
			System.out.println(x);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}
