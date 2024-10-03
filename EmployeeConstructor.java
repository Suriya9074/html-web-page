package DailyTask;

public class EmployeeConstructor {
	int empid;
	String empname;
	double empsalary;
	int empage;
	String empdesignation;
	public EmployeeConstructor(int id ,String name,double salary, int age,String designation) {
		empid=id;
		empname=name;
		empsalary=salary;
		empage=age;
		empdesignation=designation;
		
		
	}
	void display() {
		System.out.println("Emloyee id:"+empid);
		System.out.println("Employee name:"+empname);
		System.out.println("Employee salary:"+empsalary);
		System.out.println("Employee age:"+ empage);
		System.out.println("Employee distination:"+ empdesignation);
		
		
	}
	public static void main(String args[]) {
		EmployeeConstructor employeeconstructor=new EmployeeConstructor(101 ,"surya",20000,20,"software engineer");
		employeeconstructor.display();
		
	}

}
