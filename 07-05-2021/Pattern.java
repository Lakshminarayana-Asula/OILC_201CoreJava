
public class Pattern {
	static String output = "";
	static String pattern1() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1;j <= 5;j++) {
				output += j + " ";
			}
			output += "\n";
		}
		return output;
	}
	
	static String pattern2() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1;j <= 5;j++) {
				output += i + " ";
			}
			output += "\n";
		}
		return output;
	}
	
	static String pattern3() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 5;j >= 1;j--) {
				output += j + " ";
			}
			output += "\n";
		}
		return output;
	}
	
	static String pattern4() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1;j <= i;j++) {
				output += j + " ";
			}
			output += "\n";
		}
		return output;
	}

	static String pattern5() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1;j <= i;j++) {
				output += i + " ";
			}
			output += "\n";
		}
		return output;
	}
	
	static String pattern6() {
		int x = 1;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1;j <= i;j++) {
				output += x + " ";
				x++;
			}
			output += "\n";
		}
		return output;
	}
	
	static String pattern7() {
		for(int i = 5; i >= 1; i--) {
			for(int j = i;j >= 1;j--) {
				output += j + " ";
			}
			output += "\n";
		}
		return output;
	}
	
	static String pattern8() {
		char j = 'A';
		for(int i = 1; i <= 5; i++) {
			int x = 1;
			for(;x <= i;j++,x++) {
				output += j + " ";
			}
			output += "\n";
		}
		return output;
	}
	
	static String pattern9() {
		int x = 1, y = 1;
		for(int i = 1; i <= 5; i++) {
			x = y++;
			for(int j = 1;j <= i;j++) {
				output += x + " ";
				x++;
			}
			output += "\n";
		}
		return output;
	}
	
	static String pattern10() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1;j <= 5;j++) {
				output += "*";
			}
			output += "\n";
		}
		return output;
	}
	
	static String pattern11() {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1;j <= 5;j++) {
				if(i == 1 || i == 5) {
					output += "*";
				}
				else if(j == 1 || j==5) {
					output += "*";
				}
				else {
					output += " ";
				}
			}
			output += "\n";
		}
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println(pattern1());
	}

}
