/**
 * 
 */
package chapter3Sample1A;
import java.util.Scanner;
/**
 * @author batyrrasulov
 *
 */
public class Chapter3Sample1A {

	
	//public class HotelDiscount {
	   public static void main (String [] args) {
		   Scanner scnr = new Scanner(System.in);
		   int hotelRate;
		   int userAge;
		   
		   hotelRate = 155;
				   
				   System.out.print("Enter age: ");
		           userAge = scnr.nextInt();
		           
		           if (userAge > 65) {
		        	   hotelRate = hotelRate - 20;
		           }
				   		
	               System.out.print("Your hotel rate: ");
	               System.out.println(hotelRate);
	               scnr.close();
	        }
}
