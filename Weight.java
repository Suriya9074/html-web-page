package DailyTask;

public class Weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight=79.5;
		double height=5.7;
		double bmi=weight/(height*height);
		System.out.println("your BMI is:"+bmi);
		
		if(bmi<=10.5) {
			System.out.println("your are under weight");
		}
		else if (bmi>=10.5 && bmi<14.5) {
			System.out.println("you are normal weight");
		}else {
			System.out.println("your are high weight");
		}

	}

}
