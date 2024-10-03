package DailyTask;
import java.util.Scanner;

public class EmployeeDetailsTask {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        StudentDetails student = new StudentDetails();

        // Input student details
        System.out.println("Enter student ID:");
        int id = in.nextInt();
        in.nextLine(); // Consume the newline left by nextInt()

        System.out.println("Enter student Name:");
        String name = in.nextLine();

        // Input marks for 5 subjects
        System.out.println("Enter Tamil Mark:");
        float tam = in.nextFloat();

        System.out.println("Enter English Mark:");
        float eng = in.nextFloat();

        System.out.println("Enter Maths Mark:");
        float maths = in.nextFloat();

        System.out.println("Enter Science Mark:");
        float sci = in.nextFloat();

        System.out.println("Enter Social Science Mark:");
        float ssci = in.nextFloat();

        // Close the scanner
        in.close();

        // Insert student details
        student.insertIdname(id, name);
        student.insertMarks(tam, eng, maths, sci, ssci);

        // Display student details and calculate total and average
        student.display();
        student.totalMark(500);
        student.average();
    }
}

class StudentDetails {
    // Instance variables
    int ID;
    String Name;
    float Tamil;
    float English;
    float Maths;
    float Science;
    float SocialScience;

    // Method to insert student id and name
    void insertIdname(int id, String name) {
        ID = id;
        Name = name;
    }

    // Method to insert student marks
    void insertMarks(float tam, float eng, float maths, float sci, float ssci) {
        Tamil = tam;
        English = eng;
        Maths = maths;
        Science = sci;
        SocialScience = ssci;
    }

    // Method to display student details
    void display() {
        System.out.println("\n+------------------+");
        System.out.println("Student Details");
        System.out.println("+------------------+");
        System.out.println("ID: " + ID);
        System.out.println("Name: " + Name);
        System.out.println("\n+------------------+");
        System.out.println("Mark Details");
        System.out.println("+------------------+");
        System.out.println("Tamil: " + Tamil);
        System.out.println("English: " + English);
        System.out.println("Maths: " + Maths);
        System.out.println("Science: " + Science);
        System.out.println("Social Science: " + SocialScience);
        System.out.println("+------------------+");
    }

    // Method to calculate and display the total marks
    void totalMark(float totalMark) {
        float result = Tamil + English + Maths + Science + SocialScience;
        System.out.println("Total Marks: " + result + "/" + totalMark);
    }

    // Method to calculate and display the average marks
    void average() {
        float average = (Tamil + English + Maths + Science + SocialScience) / 5;
        System.out.println("Average Marks: " + average);
    }
}
