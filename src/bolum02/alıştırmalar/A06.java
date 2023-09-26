package bolum02.alıştırmalar;

import java.util.Scanner;

public class A06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayi, toplam = 0;
		
		System.out.println("0 ve 1000 arasinda bir sayi giriniz: ");
		
		sayi = input.nextInt();
		
		toplam = toplam + (sayi % 10);
		sayi = sayi / 10;
		
		toplam = toplam + ( sayi % 10);
		sayi = sayi /10; 
		
		toplam = toplam + (sayi % 10); 
		
		
	   
	    System.out.println("Tum rakamlarin toplami " + toplam + ".");

	}

}
