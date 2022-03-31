package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Print color of rainbow as per user's choice.<br>
 * <br>
 * 1 	-	Violet<br>
 * 2	-	Indigo<br>
 * 3 	-	Blue<br>
 * 4	-	Green<br>
 * 5	-	Yellow<br>
 * 6	-	Orange<br>
 * 7	-	Red<br>
 * <br>
 * Otherwise, Wrong Input<br>
 * @author Sourashis Pal
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
