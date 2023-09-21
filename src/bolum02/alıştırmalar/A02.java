package bolum02.alıştırmalar;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		double yarıcap, yukseklik, alan, hacim;
		
		System.out.println("silindirin yaricapini giriniz: ");
		yarıcap = input.nextDouble();
		
		System.out.println("silindirin yuksekligini giriniz: ");
		yukseklik = input.nextDouble();
		
		alan = yarıcap * yarıcap * Math.PI;
		hacim = alan * yukseklik;
		
		System.out.println("Alan = " + alan +
				"\nHacim = " + hacim);
				

	}

}
