import java.util.Scanner;

public class methodE { 
	public static boolean solution(int sum, int value) {
		if (sum == 0 && value == 0) {
			return true;
			} 
		else if (10 - (sum % 10) == value) {
			return true;
			} 
		else {
			return false;
			}
		}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[] { 34, 67, 89, 2, 14, 9, 7, 45, 0 };
		System.out.print("Enter sum: ");
		int sum = scanner.nextInt();
		boolean answer = solution(sum, array[array.length - 1]);
		System.out.println("Answer -> " + answer);
	}
}
