package BRasulovExercise1;
import java.util.Scanner;
public class BRasulovExercise1 {
		   public static void main(String[] args) {
		      Scanner scnr = new Scanner(System.in);
		      int num1;
		      int num2;
		      int num3;
		      int num4;
		      
		        num1 = scnr.nextInt();
		        num2 = scnr.nextInt();
		        num3 = scnr.nextInt();
		        num4 = scnr.nextInt();

		        double average_f = (num1+num2+num3+num4)/4.0;
		        double product_f = (num1*num2*num3*num4);

		        int result1 = (int) average_f;
		        int result2 = (int) product_f;

		        System.out.printf("%d %d\n",result2,result1);
		        System.out.printf("%.3f %.3f\n",product_f,average_f);
		   }
}
