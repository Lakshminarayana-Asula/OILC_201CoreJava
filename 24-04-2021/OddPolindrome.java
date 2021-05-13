
public class OddPolindrome {
	static String getOddPalindromeList(int startNum, int endNum) {
		String s = "";
		for(int i = startNum;i <= endNum;i++) {
			int q = i / 100;
			int r = i % 10;
			if(q == r) {
				if(i % 2 != 0)
					if(s.length() == 0)
						s = s + i ;
					else
						s = s + "," + i;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		int startNum = 250; 
		int endNum = 400;
		if((startNum < 100) || (endNum > 999) || (startNum > endNum)) {
			System.out.println("Error");
		}
		else
			System.out.println(getOddPalindromeList(startNum, endNum));
	}

}
