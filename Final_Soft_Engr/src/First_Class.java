import java.util.*;

public class First_Class {
	public static void main(String []args){
		System.out.println(("working"));
		System.out.println(("working"));
		int[]arr = {1, 2, 3};
		System.out.println(counting(arr));
		
}
	
	public static int counting(int[]arr) {
		int sum = 0;
		for(int x:arr) {
			sum+= x;
		}
		return sum; //
	}
}
