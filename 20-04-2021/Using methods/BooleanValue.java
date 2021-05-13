
public class BooleanValue {
	static String isTrue(String[] s) {
		int count = 0;
		boolean b = true;
		for(int i = 0;i < s.length;i++) {
			if((s[i].equals("true")) || (s[i].equals("false")))
				b = Boolean.parseBoolean(s[i]);				
			else
				return "" + (10 / 0);
		
			if(b) {
				count++;
			}
		}
		if(count>=2)
			return "true";
		else
			return "false";
	}
	public static void main(String[] args) {
		try {	
			System.out.println(isTrue(args));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
