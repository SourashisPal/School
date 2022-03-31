package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to input the Basic Pay of an employee and calculate the Gross Pay of the employee.<br>
 * <br>
 * Dearness Allowance = 25% of Basic Pay<br>
 * House Rent Allowance = 15% of Basic pay<br>
 * Provident Fund = 8.33% of Basic Pay<br>
 * Net Pay = Basic Pay + Dearness Allowance + House rent Allowance<br>
 * Gross Pay = Net pay - Provident Fund
 * @author Sourashis Pal
 */
public class EmployeePay {

    /**
     * main method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic pay: ");
        double basic = sc.nextDouble();
        sc.close();

        double dearnessAllowance = 25.0/100 * basic;
        double houseRentAllowance = 15.0/100 * basic;
        double providentFund = 8.33/100 * basic;
        double netPay = basic + dearnessAllowance + houseRentAllowance;
        double grossPay = netPay - providentFund;

        System.out.printf("Dearness Allowance = %.2f\n", dearnessAllowance);
        System.out.printf("House rent Allowance = %.2f\n", houseRentAllowance);
        System.out.printf("Provident Fund = %.2f\n", providentFund);
        System.out.printf("Net Pay = %.2f\n", netPay);
        System.out.printf("Gross Pay = %.2f\n", grossPay);
    }
}
