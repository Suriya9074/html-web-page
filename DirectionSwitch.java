package DailyTask;
enum Direction{North, East, West,South}

public class DirectionSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Direction dir=Direction.North;
		
		switch(dir){
		case South:
			System.out.println("The direction is North");
			break;
			
		case East:
			System.out.println("The direction is east");
			break;
		case West:
			System.out.println("The direction is west");
			break;
		case North:
			System.out.println("The direction is South");
			break;
			default:
				System.out.println("Unknown direction");
				break;
		}

	}

}
