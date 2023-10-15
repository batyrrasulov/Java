import java.util.Scanner;

public class bRasulovMT {
	public static void main(String[] args) {
		int rows = 10;
		int cols = 12;
		int r = 0;
		int c = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		rows = input.nextInt();
		System.out.print("Enter the number of columns: ");
		cols = input.nextInt();
		
		int[][] MT = new int[rows][cols];
		MT  = buildMultiplicationTable(MT, r, rows, c, cols);
		printMultiplicationTableRowOrder(MT, rows, cols, r, c);
		printMultiplicationTableColumnOrder(MT, rows, cols, r, c);
	}
	static int[][] buildMultiplicationTable(int[][] MT, int r, int rows, int c, int cols) {
		for (r = 0; r < rows; r++) {
			for (c = 0; c < cols; c++) {
				MT[r][c] = r * c;
			}
		}
		return MT;
	}
	static void printMultiplicationTableRowOrder(int[][] MT, int rows, int cols, int r, int c) {
		System.out.println("\nMultiplicationTable\n");
		System.out.print("  ");
		for (c = 0; c < cols; c++) {
			System.out.printf("%4d", c);
		}
		System.out.println();
		for (r = 0; r < rows; r++) {
			System.out.printf("%4d", r);
			for (c = 0; c < cols; c++) {
				System.out.printf("%4d", MT[r][c]);
			}
			System.out.println();
		}
	}
	static void printMultiplicationTableColumnOrder(int[][] MT, int rows, int cols, int r, int c) {
		System.out.println("\nMultiplicationTable\n");
		System.out.print("  ");
		for (r = 0; r < rows; r++) {
			System.out.printf("%4d", r);
		}
		System.out.println();
		for (c = 0; c < cols; c++) {
			System.out.printf("%4d", c);
			for (r = 0; r < rows; r++) {
				System.out.printf("%4d", MT[r][c]);
			}
			System.out.println();
		}
	}
}