package DailyTask;

import java.util.Arrays;

public class EvenandOddnum {
	static void FindevenandOdd(int[] arr) {
		String even="";
		String odd="";
		int evencount=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2==0) {
				even += arr[i]+"";
				evencount++;	
			}else {
				odd += arr[i]+"";
			}
		}
		System.out.println("---------ODD AND EVEN-------");
		System.out.println("In this array:"+Arrays.toString(arr));
		System.out.println("Odd Numbers:"+odd);
		System.out.println("Even Numbers:"+even);
		System.out.println("----------------------------");
	}
	public static void main(String args[]) {
		int [] arr= {4,11,6,17,18,21,27,60};
		FindevenandOdd(arr);
		
		int[] arr2= { 2,4,6,9,11,15,19,27,22};
		FindevenandOdd(arr2);
		
		int[] arr3= { 88,34,31,71,45,66,33,22};
		FindevenandOdd(arr3);
	

}
}
