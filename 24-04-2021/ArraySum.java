
public class ArraySum {
	static int getSum(int[] inputArray) {
		int sum = 0;
		if(inputArray.length == 0)
			return -1;
		for(int i = 0; i < inputArray.length;i++) {
			sum = sum + inputArray[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = {2, 7, 23, 4, 9, 6, 10, 1};
		System.out.println(getSum(arr));
	}
}
