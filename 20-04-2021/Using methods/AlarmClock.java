
public class AlarmClock {
	static String Timings(int n, boolean b) {
		if((n==0)||(n==6)){
			if(b)
				return "off";
			else
				return "10:00";
		}
		else{
			if(b) {
				return "10:00";
			}
			else
				return "7:00";
		}
	}
	public static void main(String[] args) {
		try{
			int n=Integer.parseInt(args[0]);
			if((n<0)||(n>6))
				System.out.println(10/0);
			String s=args[1];
			boolean b=true;
			if(s.equals("true")||s.equals("false"))
				b=Boolean.parseBoolean(s);
			else
				System.out.println(10/0);
			System.out.println(Timings(n,b));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}
