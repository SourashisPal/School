package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Print color of rainbow as per user's choice.<br>
 * <br>
 * 1 	-	Violet
 * 2	-	Indigo
 * 3 	-	Blue
 * 4	-	Green
 * 5	-	Yellow
 * 6	-	Orange
 * 7	-	Red
 *
 * Otherwise, Wrong Input
 */
public class RainbowColors {

	/**
    * main method
    * @param args Command line arguments
    */
	public static void main(String[] args) {
		System.out.print("Enter the ordinal of the rainbow color (starting from 1): ");
		Scanner sc = new Scanner(System.in);
		int color = sc.nextInt();
		sc.close();

		switch (color) {
			case 1: System.out.println("Violet"); break;
			case 2: System.out.println("Indigo"); break;
			case 3: System.out.println("Blue"); break;
			case 4: System.out.println("Green"); break;
			case 5: System.out.println("Yellow"); break;
			case 6: System.out.println("Orange"); break;
			case 7: System.out.println("Red"); break;
			default: System.out.println("Wrong Input!");
		}
	}
}
