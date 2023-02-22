import java.util.*;

public class First_Class {
	public static void main(String []args){ //main method created
		System.out.println(("working"));
		System.out.println(("working"));
		int[]arr = {1, 2, 3};
		System.out.println(countingProduct(arr));
		int[]tr = reversedArr(arr);
		for (int i = 0; i<arr.length;i++) {
			System.out.println(tr[i]);
		}
		
}
	
	public static int countingSum(int[]arr) {
		int sum = 0;
		for(int x:arr) {
			sum+= x;
		}
		return sum; //
	}
	
	public static int countingProduct(int[]arr) {
		int sum = 1;
		for(int x:arr) {
			sum = sum*x;
		}
		return sum; //
	}
	
	public static int[] reversedArr (int[]arr) {
		int [] toReturnArray = new int[arr.length];
		for (int i = arr.length-1, j = 0; i>=0; i--, j++) {
				toReturnArray[j] = arr[i];
			
		}
		return toReturnArray;
	}
}
