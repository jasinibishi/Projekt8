package proekt7;

import java.util.Scanner;

public class Dropka {
		public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Vnesi broitel : ");
	        int numerator = input.nextInt();
	        System.out.println("Vnesi imenitel : ");
	        int denominator = input.nextInt();
	        int gcd = findGCD(numerator, denominator);
	        numerator /= gcd;
	        denominator /= gcd;
	        System.out.println("NZD =  " + gcd);
	        System.out.println("Skratena dropka = " + numerator + " X " + denominator);
	    }
	    public static int findGCD(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;

	}

}

