
public class OccurenceCounter {
	static int getCount(int[] inputArray, int givenNumber) {
		int count = 0;
		for(int i = 0; i<inputArray.length; i++) {
			if(inputArray[i] == givenNumber) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {2, -3, 1, 12, 14, -3, 1, 10, -3, 2, -3};
		 int num = -3;
		 System.out.println(getCount(arr, num));
	}
	
}
