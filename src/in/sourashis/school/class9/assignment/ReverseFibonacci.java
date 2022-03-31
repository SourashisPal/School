package in.sourashis.school.class9.assignment;

/**
 * Write a program to print the fibonacci series of 10 terms in reverse order:-
 * 34 21 13 8 5 3 2 1 1 0
 * @author Sourashis Pal
 */
public class ReverseFibonacci {

    /**
     * main() method
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        int a = 34, b = 21, c;
        System.out.println(a + "\n" + b);
        for (int i = 3; i <= 10; i++, a = b, b = c) {
            System.out.println(c = a-b);
        }
    }
}