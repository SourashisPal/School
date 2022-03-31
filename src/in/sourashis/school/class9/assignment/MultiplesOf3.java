package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Print the following:-<br>
 * <code>3, 6, 9, 12, ... n terms</code>
 * @author Sourashis Pal
 */
public class MultiplesOf3 {

    /**
     * main() method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of terms: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            System.out.println(3*i);
        }
    }
}
