package bolum02.alıştırmalar;

import java.util.Scanner;
import java.lang.Math;	
public class A19 {

	  static Scanner input = new Scanner(System.in);
	 
	    public static void main(String[] args) {
	    	
		System.out.println("x1 i giriniz: ");
		double x1 = input.nextDouble();
		System.out.println("y1 i giriniz: ");
		double y1 = input.nextDouble();
		System.out.println("x2 i giriniz: ");
		double x2 = input.nextDouble();
		System.out.println("y2 i giriniz: ");
		double y2 = input.nextDouble();
		System.out.println("x3 i giriniz: ");
		double x3 = input.nextDouble();
		System.out.println("y3 i giriniz: ");
		double y3 = input.nextDouble();
		
		double kenar1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double kenar2 = Math.sqrt(Math.pow(x3 - x1, 2 ) + Math.pow(y3 - y1, 2));
		double kenar3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		
		double s = (kenar1 + kenar2 + kenar3) / 2;
				
		
	    double alan = Math.sqrt(s * (s - kenar1) * (s - kenar2) * (s - kenar3));
		
		System.out.println("ucgenin alani " + Math.sqrt(s * (s - kenar1) * (s - kenar2) * (s - kenar3)) + " dir ");
		
		
		
		
		
		
		
		
		

	}

}
