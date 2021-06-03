import java.util.*;
public class MorseCode {

	static String getMorseCode(String str) {
		String res = "";
			for(int i = 0; i < str.length(); i++) {
				res += getString(str.charAt(i));
			}
			
		return res;
	}
	
	static String getString(char c) {
		String res = "";
		
		switch(c) {
			case 'a':
				res = ".-"; 
				break;
			case 'b':
				res = "-..."; 
				break;
			case 'c':
				res = "-.-."; 
				break;
			case 'd':
				res = "-.."; 
				break;
			case 'e':
				res = "."; 
				break;
			case 'f':
				res = "..-."; 
				break;
			case 'g':
				res = "--."; 
				break;
			case 'h':
				res = "...."; 
				break;
			case 'i':
				res = ".."; 
				break;
			case 'j':
				res = ".---"; 
				break;
			case 'k':
				res = "-.-"; 
				break;
			case 'l':
				res = ".-.."; 
				break;
			case 'm':
				res = "--"; 
				break;
			case 'n':
				res = "-."; 
				break;
			case 'o':
				res = "---"; 
				break;
			case 'p':
				res = ".--."; 
				break;
			case 'q':
				res = "--.-"; 
				break;
			case 'r':
				res = ".-."; 
				break;
			case 's':
				res = "..."; 
				break;
			case 't':
				res = "-"; 
				break;
			case 'u':
				res = "..-"; 
				break;
			case 'v':
				res = "...-"; 
				break;
			case 'w':
				res = ".--"; 
				break;
			case 'x':
				res = "-..-"; 
				break;
			case 'y':
				res = "-.--"; 
				break;
			case 'z':
				res = "--.."; 
				break;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		
		System.out.println("Morsecode for Given String is: \n" + getMorseCode(sc.next()));

	}

}
