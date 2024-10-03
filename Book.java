package DailyTask;

public class Book {
	String title;
	String author;
	int price;
	public Book(String t,String a) {
		title=t;
		author=a;
	}
	public Book(String t, String a, int p) {
		title=t;
		author=a;
		price=p;
		
	}
	void display() {
		System.out.println(title+" "+author+" "+price);
	}
	public static void main(String args[]) {
		Book co1=new Book("java","suriya");
		Book co2=new Book("java","suriya",300);
		co1.display();
		co2.display();
	}

}
