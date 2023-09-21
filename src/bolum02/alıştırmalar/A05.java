package bolum02.alıştırmalar;

import java.util.Scanner;

public class A05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		double araToplam, komisyonOranı, komisyon, toplam;
		
		System.out.println("araToplam degerini giriniz: ");
		araToplam = input.nextDouble();
		
		System.out.println("komisyonOranini giriniz: ");
		komisyonOranı = input.nextDouble() / 100;
		
		komisyon = araToplam * komisyonOranı;
		toplam = komisyon + araToplam;
		
		System.out.println("komisyon $"  + komisyon + " ve toplam $" + toplam + ".");
			
		
		

	}

}
