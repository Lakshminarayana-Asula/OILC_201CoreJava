import java.util.*;
public class ValidateEmailId {

	String isValidEmail(String email) {
		String res = "";
		String end = "";
		boolean b = true;
		int count = 0;
		int firstChar = (int)email.charAt(0);
		
		if( firstChar < 97 || firstChar > 122) {
			res += -1;
		}
		else {
			for(int i = 0; i < email.length(); i++) {
				int lowerCase = (int)email.charAt(i);
				
				if(email.charAt(i) == '@') {
					count++;
				}
				else if(email.charAt(i) == '.' && b && count == 1) {
					b = false;
					for(int j = i + 1; j < email.length(); j++) {
						end += email.charAt(j);
					}
				}
				else if((lowerCase < 97 || lowerCase > 122) && email.charAt(i) != '_' && lowerCase < 0 && email.charAt(i) != '.'){
					res += -5;
				}
			}
			
			if(count == 0) {
				res += -2;
			}
			else if(count > 1) {
				res += -3;
				
			}
			else if(end.equals("com") || end.equals("co.in")) {
				
			}
			else {
				res += -4;
			}
		}
		
		if(res.length() == 0) {
			res = "Valid";
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ValidateEmailId eid = new ValidateEmailId();
		System.out.println("Enter mail id: ");
		
		System.out.println(eid.isValidEmail(sc.next()));
	}

}
