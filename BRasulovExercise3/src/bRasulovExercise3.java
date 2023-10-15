import java.util.Scanner;

/**
 * 
 */

/**
 * @author batyrrasulov
 *
 */
public class bRasulovExercise3 {

	/**
	 * @param args
	 *  
	 */
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int number = 1 + (int) (10000 * Math.random());
		 
		 int userGuess = sc.nextInt();
		
		 int numberToGuess;
		 
		 System.out.println("Enter a number between 1 and 10000");
	
		 if (numberToGuess > userGuess) {
			 System.out.println("Higher");
		 }
		 else if (numberToGuess < userGuess) {
			 System.out.println("Lower");
		 }
		 else (numberToGuess == userGuess); {
			 System.out.println("Winner");
		 } 
	}
}
