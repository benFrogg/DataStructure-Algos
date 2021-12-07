
import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    
    public Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    public char calculate(){
        int totalScore = 0;
        char grade = 'T';

        for (int i = 0; i < testScores.length; i++){
            totalScore += testScores[i];
        }

        totalScore = totalScore / testScores.length;

        if (totalScore <= 100 && totalScore >= 90){
            grade = 'O';
        } else if (totalScore < 90 && totalScore >= 80){
            grade = 'E';
        } else if (totalScore < 80 && totalScore >= 70){
            grade = 'A';
        } else if (totalScore < 70 && totalScore >= 55){
            grade = 'P';
        } else if (totalScore < 55 && totalScore >= 40){
            grade = 'D';
        }

        return grade;
    }
}

public class Day12Inheritance {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
