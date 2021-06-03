import java.util.*;
public class ValidTime {

	static boolean isValidTime(String time) {
		boolean b = true;
		
		String[] str = time.split(":");
		int hh =  Integer.parseInt(str[0]);
		int mm = Integer.parseInt(str[1]);
		int ss = Integer.parseInt(str[1]);
		
		if((hh < 0 || hh > 23) || (mm < 0 || mm > 60) || (ss < 0 || ss > 60 )) {
			b = false;
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Time format like HH:MM::SS ");
		String time = sc.nextLine();
		
		System.out.println(isValidTime(time));
	}

}
