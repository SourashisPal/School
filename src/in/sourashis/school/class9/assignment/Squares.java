package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Print the following:-
 * 1, 4, 9, 16, 25, ... n terms
 * @author Sourashis Pal
 */
public class Squares {

    /**
     * main() method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of terms: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            System.out.println(i*i);
        }
    }
}
