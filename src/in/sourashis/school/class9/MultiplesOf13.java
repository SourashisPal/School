package in.sourashis.school.class9;

/**
 * Print all the multiples of 13 from 500 to 400
 * @author Sourashis Pal
 */
public class MultiplesOf13 {

    /**
     * main method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        for (int i = 500; i >= 400; i--) {
            if (i % 13 == 0) {
                System.out.println(i);
            }
        }
    }
}