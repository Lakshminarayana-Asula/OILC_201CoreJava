
public class CheckArmStrong {
	static String isArmStrong(int num) {
		int x, r, sum = 0;
		x = num;
		while(num > 0) {
			r=num % 10;
			sum = sum + r * r * r * r;
			num = num / 10;
		}
		if(x == sum)
			return "ArmStrong";
		else
			return "Not ArmStrong";
	}
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			int x = num / 1000;
			if((num < 0)||(x <= 0) || (x > 9)) {
				System.out.println(10/0);
			}
			System.out.println(isArmStrong(num));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
			
	}

}
