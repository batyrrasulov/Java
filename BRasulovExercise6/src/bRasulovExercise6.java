import java.util.Scanner;
import java.io.*;

public class bRasulovExercise6 {
	public static String readFile(String fileName) throws IOException {
		Scanner scanner = new Scanner(new File(fileName));
		String content = "";
		while(scanner.hasNextLine()) {
			content += scanner.nextLine();
		}
		return content;
	}
	public static void initializeGrid(char [][] grid, int m, int n) {
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				grid[i][j] = '*';
	}
	public static void fillGrid(char [][] grid, int m, int n, String fileName) throws IOException {
		String text = readFile(fileName);
		initializeGrid(grid, m, n);
		int i = 0; int j = 0;
		for (int k = 0; k < text.length(); k++) {
			char c = text.charAt(k);
			if (i % 2 == 0) {
				grid[i][j] = c;
				j++;
			}
			else {
				grid[n][n-j-1] = c;
				j++;
			}
			if (j == n) {
				i++;
				j = 0;
			}
			if(i == m) {
				break;
			}
		}
	}
	public static void displayGrid(char [][] grid, int m, int n) {
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < m; i++)
				System.out.print(grid[i][j]);
		}
	}
	public static void main(String [] args) throws IOException {
		String fileName = "input.in";
		int m = 4; int n  = 8;
		char grid[][] = new char[m][n];
		fillGrid(grid, m, n, fileName);
		displayGrid(grid, m , n);
	}
}