package in.sourashis.school.class10.holiday;

/**
 * Write a program in Java to display the first ten terms of the following series: 0, 1, 2, 3, 6, 11, 20, 37, ...
 * @author Sourashis Pal
 */
public class Series {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		for (int i = 0, a = -1, b = 0, c = 1, term; i < 10; i++, a = b, b = c, c = term) {
			System.out.print((term = a + b + c) + (i < 9? ", " : "\n"));
		}
	}
}
