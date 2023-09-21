package bolum01.alıştırmalar;

import java.util.Scanner;

public class B01A09 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			int kenar1,kenar2;
		
				
			System.out.print("1.kenari giriniz: ");
			kenar1 = scan.nextInt();
			
			System.out.print("2.kenari giriniz: ");
			kenar2 = scan.nextInt();
			
			System.out.println("Dikdortgenin alani = " +(kenar1 * kenar2));
			System.out.println("Dikdortgenin cevresi = " + (2* (kenar1 + kenar2)));
		}
		
		
		
		
		
		
		

	}

}
