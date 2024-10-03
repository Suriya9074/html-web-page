package DailyTask;

import java.util.Arrays;

public class ArraysReverse {
	static int[] reverse(int[] arr) {
		int start =0;
		int end=arr.length-1;
		System.out.println("Normal Arrays:"+Arrays.toString(arr));
		
		while(start<end) {
				//swap
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				
				start++;
				end--;
		}
		return arr;
		
		
	 
	}
	public static void main(String args[]) {
		int[] arr= {320,280,200,40,30};
		int[] revarr=reverse(arr);
		System.out.println("Reverse Array"+Arrays.toString(revarr));
	}

}
