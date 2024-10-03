package DailyTask;

public class prntCommon_Number {
static String commonNum(int[] arr1,int[] arr2) {
	String commonNum="";
	for(int i=0; i<arr1.length; i++) {
		for(int j=0; j<arr2.length; j++) {
			if(arr1[i]==arr2[j]) {
				commonNum +=arr1[i];
				commonNum +="";
			}
		}
	}
	return commonNum;
}
public static void main(String args[]) {
	int[] arr1={23,45,65,78,70};
	int[] arr2= {20,45,70,63,3};
	
	String num= commonNum(arr1,arr2);
	System.out.println(num);

}
}
