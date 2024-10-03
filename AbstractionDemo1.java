package DailyTask;
abstract class Vehicle{
	abstract void startEngine();
	abstract void stopEngine();
}
	class Car extends Vehicle{
		void startEngine() {
			System.out.println("Car EngineStart");
		}
		void stopEngine() {
			System.out.println("Car EngineStop");
		}
	}
	
	class Motorcycle extends Vehicle{
		void startEngine(){
			System.out.println("MotorCycle EngineStart");
			
		}
		void  stopEngine() {
			System.out.println("MotorCycle EngineStop");
		}
	}
	



public class AbstractionDemo1{
	public static void main(String args[])
	{
	Vehicle  c1= new Car();
	c1.startEngine();
	
	Vehicle m1=new Motorcycle();
	m1.startEngine();
	m1.stopEngine();
	c1.startEngine();
	c1.stopEngine();
	}	
}

