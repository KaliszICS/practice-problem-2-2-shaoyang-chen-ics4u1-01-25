import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	public static int sequentialSearch(int[] arr, int key) {
		int counter;
		for (counter = 0; counter < arr.length; counter++) {
			if (arr[counter] == key) {
				return counter +1;
			}
		}
		return arr.length;
	}
	public static int binarySearch(int[] arr, int key) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		int binarySearch = 0;
		while (left <= right) {
			binarySearch++;
			int mid = (left + right) / 2;
			if (arr[mid] == key) {
				return binarySearch;
			}
			if (arr[mid] < key) {
				left = mid + 1;
			}
			if (arr[mid] > key) {
				right = mid - 1;
			}
		}
		return arr.length;
	}
	public static int[] compareSearch(int[] givenArr, int givenNum){
		int[] result = {sequentialSearch(givenArr, givenNum), binarySearch(givenArr, givenNum)};
		return result;
	}
	public static int sequentialSearchStr(String[] arr, String key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(key)) {
				return i+1;
			}
		}
		return arr.length;
	}
	public static int binarySearchStr(String[] arr, String key) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		int binarySearch = 0;
		while (left <= right) {
			binarySearch++;
			int mid = (left + right) / 2;
			int comparison = arr[mid].compareTo(key);
			if (comparison == 0) {
				return binarySearch;
			} else if (comparison < 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return arr.length;
	}
	public static int[] compareStringSearch(String[] givenArr, String givenWord){
		int[] result = {sequentialSearchStr(givenArr, givenWord), binarySearchStr(givenArr, givenWord)};
		return result;
	}
	
}
