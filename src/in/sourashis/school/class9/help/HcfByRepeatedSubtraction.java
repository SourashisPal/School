package in.sourashis.school.class9.help;

import java.util.Scanner;

public class HcfByRepeatedSubtraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();

		while (a != 0) {
			if (a >= b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		System.out.println("HCF = " + b);
	}
}
