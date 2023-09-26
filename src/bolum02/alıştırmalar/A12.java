package bolum02.alıştırmalar;

import java.util.Scanner;

public class A12 {

	public static void main(String[] args) {
		double hiz, ivme, mesafe;
		Scanner input = new Scanner(System.in);
		
	    System.out.println("hizi giriniz: ");
	    hiz = input.nextDouble();
	    
	    System.out.println("ivmeyi giriniz: ");
	    ivme = input.nextDouble();
	   
	    mesafe = (Math.pow(hiz, 2) / (2 * ivme));
	    
	    System.out.println("bu ucak icin minumum pist mesafesi " + mesafe);
	   
	  
	   
		
		

	}

}
