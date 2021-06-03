import java.util.*;
public class WordsContainPattern {
	static int index = 0;
	
	static String[] getWordsContainPattern(String[] arr, String pattern) {
		String[] str = new String[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			boolean b;
			for(int j = 0; j < arr[i].length(); j++){
				
				if(arr[i].charAt(j) == pattern.charAt(0)) {
					b = true;
					int temp = j;
					
					for(int k = 0; k < pattern.length(); k++,j++) {
						
						if(arr[i].length() < j + pattern.length() - 1 &&  arr[i].charAt(j) != pattern.charAt(k)){
							b = false;
							break;
						}
					}
					
					j = temp;
					if(b) {
						str[index] = arr[i];
						index++;
						break;
					}
				}	
			}
			
		}
		return str;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many Strings want to enter");
		int size = sc.nextInt();
		
		System.out.println("Enter Strings");
		String[] str = new String[size];
		for(int i = 0; i < size; i++) {
			str[i] = sc.next();
		}
		
		System.out.println("Enter Patter String: ");
		str = getWordsContainPattern(str, sc.next());
		
		System.out.println("Result String array is: ");
		for(int i = 0; i < index; i++) {
			System.out.println(str[i]);
		}
	}

}
