package bolum02.alıştırmalar;

import java.util.Scanner;

public class A14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pound, inch, kilogram, metre, VKI;
		
		System.out.println("agirliginizi pound cinsinden giriniz: ");
		pound = input.nextDouble();
		
		System.out.println("boy uzunlugunuzu inch cinsinden giriniz: ");
		inch = input.nextDouble();
		
		kilogram = pound * 0.45359237;
		metre = inch * 0.0254;
		
		VKI = (kilogram) / (Math.pow(metre ,2));
		
		System.out.println("VKI " + VKI + " dir "); 

	}

}
