/*
Task 
You are given two classes, Person and Student, where Person is the base class and Student
is the derived class. Completed code for Person and a declaration for Student are provided
for you in the editor. Observe that Student inherits all the properties of Person.

Complete the Student class by writing the following:
    - A Student class constructor, which has 4 parameters:
        1. A string, firstName.
        2. A string, lastName.
        3. An integer, idNumber.
        4. An integer array (or vector) of test scores, scores.
    - A char calculate() method that calculates a Student object's average and returns the
        grade character representative of their calculated average:

            Grading Scale
        Letter |   Average (a)
        -------------------------
           O   | 90 <= a <= 100
           E   | 80 <= a < 90
           A   | 70 <= a < 80
           P   | 55 <= a < 70
           D   | 40 <= a < 55
           T   |    a < 40

Input Format
The locked stub code in the editor reads the input and calls the Student class constructor
with the necessary arguments. It also calls the calculate method which takes no arguments.
The first line contains firstName, lastName, and idNumber, separated by a space. The second
line contains the number of test scores. The third line of sapce-separated integers describes
scores.

Constraints
    - 1 <= length of firstName, length of lastName <= 10
    - length of idNumber = 7
    - 0 <= score <= 100

Output Format
Output is handled by the locked stub code. Your output will be correct if your Student class
constructor and calculate() method are properly implemented.

Sample Input
Heraldo Memelli 8135627
2
100 80

Sample Output
Name: Memelli, Heraldo
ID: 8135627
Grade: O

Explanation 
This student has 2 scores to average: 100 and 80. The student's average grade is (100+80)/2 = 90.
An average grade of 90 corresponds to the letter grade O, so the calculate() method should return
the character 'O'.
*/

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
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
