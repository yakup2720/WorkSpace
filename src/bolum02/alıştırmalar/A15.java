package bolum02.alıştırmalar;

import java.util.Scanner;
import java.lang.Math;

public class A15 {

	public static void main(String[] args) {
	double x1, x2, y1, y2, mesafe;	
	Scanner input = new Scanner(System.in);
	
	System.out.println("x1 i giriniz: ");
	x1 = input.nextDouble();
	System.out.println("y1 i giriniz: ");
	y1 = input.nextDouble();
	
	System.out.println("x2 yi giriniz: ");
	x2 = input.nextDouble();
	System.out.println("y2 yi giriniz: ");
	y2 = input.nextDouble();
	
	mesafe = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	
	System.out.println("iki nokta arasindaki mesafe " + mesafe + " dir ");
			
	

	}

}
