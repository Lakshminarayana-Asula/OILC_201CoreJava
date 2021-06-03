import java.util.*;
public class MaskEmailId {
	static boolean b = false;
	
	static String maskMailId(String email) {
		ValidateEmailId em = new ValidateEmailId();
		String res = "";
		String str = em.isValidEmail(email);
		StringBuffer sb = new StringBuffer(email);
		
		if(str.equals("Valid")) {
			b = true;
			for(int i = 1; email.charAt(i) != '@'; i++) {
				sb.setCharAt(i, '*');
			}
			res = sb.toString();
		}
		else {
			res = "Invalid";
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email Id");
		String maskMail = maskMailId(sc.next());
		if(b) {
			System.out.println("Masked emailId is: \n" + maskMail);
		}
		else {
			System.out.println(maskMail);
		}

	}

}
