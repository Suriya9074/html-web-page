package DailyTask;
import java.util.Scanner;

public class SumofOddNumber {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a N number:");
		int n=scanner.nextInt();
		
		int sum=0;
		int oddnumber=1;
		
		
		for(int i=0; i<n; i++) {
			sum +=oddnumber;
			oddnumber+=2;
			
			
		}
		System.out.println("The sum of the"+n+ "is odd natural number:"+sum);
		scanner.close();

	}

}
