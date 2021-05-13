
public class OddCounter {
	static int getOddCount(int[] inputArray) {
		int count = 0;
		if(inputArray.length > 10) {
			return -1;
		}
		for(int i = 0;i < inputArray.length;i++) {
			if(inputArray[i] % 2 != 0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr= {2, 13, 11, 5, 6, 45, 23, 8, 10, 37};
		System.out.println(getOddCount(arr));
	}
}
