package DailyTask;

abstract class Employee{
	String name;
	double salary;
	int id;
	int age;
	
	Employee(int id ,String name,double salary,int age){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	
		abstract double calculateSalary();
		abstract void detailsInfo() ;
}
		
		class Manager extends Employee{
			double bonus;
			
			Manager(int id,String name,double salary,int age,double bonus){
				super(id, name, salary , age);
				this.bonus=bonus;
			}
		double calculateSalary() {
			return bonus+salary;
		}
		void detailsInfo() {
			System.out.println("---Details about Manager-------");
			System.out.println("id:"+id);
			System.out.println("name:"+name);
			System.out.println("salary:"+calculateSalary());
			System.out.println("age"+age);
			System.out.println("---------------");
		}
	
		}
		class Programmer extends Employee{
			Programmer(int id,String name,double salary,int age){
				super(id,name,salary,age);
			}
			double calculateSalary() {
				return salary*12;
			}
			void detailsInfo() {
				System.out.println("----programmer Details-----");
				System.out.println("id:"+id);
				System.out.println("name:"+name);
				System.out.println("salary:"+calculateSalary());
				System.out.println("age:"+age);
				System.out.println("----------");
			}
			
		}

public class AbstractionDemo {
public static void main(String args[]) {
	Employee e1;
	e1 =new  Manager(1,"Suriya",3000,19,200);
	e1.detailsInfo();
	System.out.println(e1.calculateSalary());
	
	e1=new Programmer(2,"kanna",2000,17);
	e1.detailsInfo();
	System.out.println(e1.calculateSalary());
	
}
}
