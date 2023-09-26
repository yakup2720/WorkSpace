package bolum02.alıştırmalar;

import java.util.Scanner;

public class A09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double ilkHız, sonHız, zaman, ortalamaİvme;
		
		System.out.println("ilk hizi giriniz: ");
		ilkHız = input.nextDouble();
		System.out.println("son hizi giriniz: ");
		sonHız = input.nextDouble();
		System.out.println("zamani giriniz: ");
		zaman = input.nextDouble();
		
		ortalamaİvme = (sonHız - ilkHız) / zaman;
		
		
		System.out.println("ortalama ivme: " + ortalamaİvme + "." );
		
		

	}

}
