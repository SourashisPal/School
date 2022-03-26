package in.sourashis.school.class9;

/**
 * Print all even numbers from 100 to 200
 * @author Sourashis Pal
 */
public class Evens {

    /**
    * main() method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}