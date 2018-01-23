import java.util.Scanner;

public class BonusOne {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userGrade;
		char yesNo = 'Y';
		
		while ((yesNo == 'Y') || (yesNo == 'y')) {
			System.out.println("Enter a numerical grade: ");
			userGrade = scan.nextInt();
			
			if ((userGrade <= 100) && (userGrade >= 88)) {
				System.out.println("Letter Grade: A");
			}
			else if ((userGrade < 88) && (userGrade >= 80)) {
				System.out.println("Letter Grade: B");
			}
			else if ((userGrade < 80) && (userGrade >= 67)) {
				System.out.println("Letter Grade: C");
			}
			else if ((userGrade < 67) && (userGrade >= 60)) {
				System.out.println("Letter Grade: D");
			}
			else if ((userGrade < 60) && (userGrade >= 0)) {
				System.out.println("Letter Grade: F");
			}
			
			System.out.println("Continue? (y/n): ");
			yesNo = scan.next().charAt(0);
		
		}
		
		System.out.println("Goodbye!");
	}

}
