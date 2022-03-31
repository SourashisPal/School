package in.sourashis.school.class9.help;

import java.util.Scanner;

public class HcfByEuclideanDivision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();

		while (a != 0) {
			int remainder = b % a;
			b = a;
			a = remainder;
		}
		System.out.println("HCF = " + b);
	}
}
