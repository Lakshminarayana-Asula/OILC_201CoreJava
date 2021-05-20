import java.util.*;
public class StringAnagram {

	static String isAnagram(String str1, String str2) {
		String result = "";
		if(str1.length() != str2.length()) {
			result = "Given two String are not Anagram";
		}
		else {
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			str1 = stringAscending(str1);
			str2 = stringAscending(str2);
		//	System.out.println(str1 + " " + str2);
			
			if(str1.equals(str2)) {
				result = "Given two strings are Anagrams";
			}
			else {
				result = "Given two String are not Anagram";
			}
		}
		
		return result;
	}
	
	static String stringAscending(String str) {
		StringBuffer res = new StringBuffer(str);
		for(int i = 0;i < res.length();i++) {
			for(int j = i + 1;j < res.length();j++) {
				if(res.charAt(i) > res.charAt(j)) {
					char temp = res.charAt(i);
					res.setCharAt(i, res.charAt(j));
					res.setCharAt(j, temp);
				}
			}
		}
		
		return res.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Strings ");
		
		System.out.println(isAnagram(sc.next(), sc.next()));
	}

}
