import java.util.Scanner;

public class NumbersPrinter {
   public static int[] getNumbers() {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALUES = 6;             
      int[] values = new int[NUM_VALUES];  
      int i;                                 

      for (i = 0; i < values.length; ++i) {
         values[i] = scnr.nextInt();
      }
      
      return values;
    }
    
   public static void printSelectedNumbers() {
      int i;
      int[] numbers = getNumbers();
 
      for (i = 0; i < numbers.length; ++i) {
         if (numbers[i] > 6) {
            System.out.println(numbers[i]);   
         }
       }
    }
    
   public static void main(String[] args) {
      printSelectedNumbers();
   }
}
