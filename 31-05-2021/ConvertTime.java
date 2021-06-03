import java.util.*;
public class ConvertTime {
	
	String convertTime12Hrs(String time) {
		String res = "";
		String temp = "AM";
		boolean b = true;
		String[] str = time.split(":");
		int hh =  Integer.parseInt(str[0]);
		int mm = Integer.parseInt(str[1]);
		int ss = Integer.parseInt(str[2]);
		
		if((hh < 0 || hh > 24) || (mm < 0 || mm > 60) || (ss < 0 || ss > 60 )) {
			b = false;	
			
		}
		if(b) {
			
			if(hh > 12 && hh < 24) {
				hh = hh - 12;
				temp = "PM";
			}
			else if(hh == 24) {
				hh = hh - 24;
			}
		}
		
		res += hh + ":" + str[1] + ":" + str[2] + " " + temp;
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConvertTime ct = new ConvertTime();
		System.out.println("Enter 24 hrs Time format: ");
		String time = sc.next();
		
		System.out.println("12 Hrs Time Format is: \n" + ct.convertTime12Hrs(time));

	}

}
