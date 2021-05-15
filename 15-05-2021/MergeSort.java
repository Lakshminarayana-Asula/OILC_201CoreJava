import java.util.*;
public class MergeSort {
	
	static void merge(int[] arr, int l, int m ,int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for(int i = 0;i < n1; i++) {
			left[i] = arr[l + i];
		}
		
		for(int j = 0;j < n2;j++) {
			right[j] = arr[m + 1 + j];
		}
		
		int i = 0, j = 0, k = l;
		
		while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
	
	static void mergeSort(int[] arr, int l, int r) {
	
		if(l < r) {
			int m = (l + r) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}
	
	static void displaySortedArray(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter array elements");
		for(int i = 0;i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println("Sorted array is: ");
		displaySortedArray(arr);
	}

}
