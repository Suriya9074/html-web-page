package DailyTask;
import java.util.Scanner;

public class EmployeeAgeDetailsTask {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String name = scanner.nextLine();
		
		System.out.println("Enter Employee Age:");
		int age =scanner.nextInt();
		
		System.out.println("\n Employee Name:"+name);
		System.out.println( "Employee Age:"+age);
		
		if(age >=90) {
			System.out.println("You are not eligible to work in the company");
			
	
			}else {
				System.out.println( "you are eligible to work in the company");
			}
		scanner.close();
		}
	}


