package in.sourashis.school.class9.help;

import java.util.Scanner;

/**
 * Print the sum of the following series:-
 * <code>S = 1 + (1*2) + (1*2*3) + ... n terms</code>
 * @author Sourashis Pal
 */
public class Series7 {

    /**
     * main() method
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();

        int seriesSum = 0, product = 1;
        for (int i = 1; i <= n; i++, product *= i) {
            seriesSum += product;
        }
        System.out.println("Sum of the series = " + seriesSum);
    }
}
