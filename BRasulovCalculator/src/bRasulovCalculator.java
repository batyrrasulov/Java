import java.util.Scanner;

public class bRasulovCalculator {
	public static void main(String[] args) {
		int first;
		int second;
		int add; 
		int subtract;
		int multiply;
		float divide;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter two numbers:");
		first = scanner.nextInt();
		second = scanner.nextInt();
		
		add = sumFunction(first, second);
		System.out.println("Sum is " + add);
		
		subtract = differenceFunction(first, second);
		System.out.println("Difference is " + subtract);
		
		multiply = multiplicationFunction(first, second);
		System.out.println("Multiplication is " + multiply);
		
		divide = divisionFunction(first, second);
		System.out.println("Division is " + divide);
	}
		public static int sumFunction(int first, int second) {
			return first + second;
		}
		public static int differenceFunction(int first, int second) {
			return first - second;
		}
		public static int multiplicationFunction(int first, int second) {
			return first * second;
		}
		public static int divisionFunction(int first, int second) {
			return first / second;
		}
	}