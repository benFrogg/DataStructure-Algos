
import java.util.*;

public class Day4ClassVSInstance {
    private int age;

    public Day4ClassVSInstance(int initialAge) {
        age = initialAge;

        if (age < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        age += 1;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day4ClassVSInstance d4 = new Day4ClassVSInstance(age);
			d4.amIOld();
			for (int j = 0; j < 3; j++) {
				d4.yearPasses();
			}
			d4.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
