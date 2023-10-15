import java.io.*;

public class bRasulovExercise5 {
	public static void main(String[] args) throws IOException {
		
		File inputFile = new File("input.in");
		try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
			BufferedWriter writer = new BufferedWriter(new FileWriter("results.out"));
			
			String line;
			while ((line = br.readLine()) != null) {
				
				String[] words = line.split(" ");
				for (String word : words) {
					
					String firstHalf = word.substring(0,(word.length()+1)/2);
					String secondHalf = "";
					if (word.length() > 1) {
						secondHalf = word.substring((word.length()+1)/2);
					}
					
					String encryptedWord = secondHalf+firstHalf;
					encryptedWord = encryptedWord.toUpperCase();
					
					System.out.print(word+" "+encryptedWord+"\n");
					writer.write(word+""+encryptedWord+"\n");
					}
			}
			writer.close();
		}
	}
}
