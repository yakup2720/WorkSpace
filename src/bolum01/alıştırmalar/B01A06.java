package bolum01.alıştırmalar;

import java.util.Scanner;

public class B01A06 { 

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in); 
	 int toplam = 0 ;
	 
	 System.out.println("Bir sayi giriniz: ");
	 int sayı = scan.nextInt();
	 
	 for(int i = 1; i < sayı ; i++) {
		 toplam = toplam + i;  
	 }
	 System.out.println(sayı + " sayisina kadar olan sayilarin toplami = " + toplam);
	 		
			 
	}		 	

	

}
