package app.org.com.hackerrank.swap;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MinSwapSolution {

	// Complete the minimumSwaps function below.
	public static int minimumSwaps(int[] arr) {
		int[] sortedArray = Arrays.copyOf(arr, arr.length);
		Arrays.sort(sortedArray);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " " + sortedArray[i] + " " + (arr[i] != sortedArray[i]));
			if (arr[i] != sortedArray[i]) {
				count++;
			}
		}
		System.out.println(count);
		return count - 1;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		System.out.print("Enter the number of elements you want to store: ");  
		int n = scanner.nextInt();
		int[] arr = new int[n];
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		System.out.println("Enter the elements of the array: "); 
		String[] arrItems = scanner.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}
		System.out.print(Arrays.toString(arr));
		int res = minimumSwaps(arr);
		scanner.close();

	}
}
