package bolum02.alıştırmalar;

import java.util.Scanner;

public class A11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double birYildakiSaniye, yildakiDogumlar , yildakiOlumler, yildakiGocmenler;
		int simdikiNufus = 312_032_486, yil;
		
		 birYildakiSaniye = 60 * 60 * 24 *365;
		 yildakiDogumlar = birYildakiSaniye / 7;
		 yildakiOlumler = birYildakiSaniye / 13; 
		 yildakiGocmenler = birYildakiSaniye / 45;
		 
		System.out.println("yil sayisini giriniz: ");
		 yil = input.nextInt();
		
		 simdikiNufus += (yildakiDogumlar +  yildakiGocmenler -  yildakiOlumler) * yil;
		 
		 System.out.println( yil + " yil sonraki nufusu " + simdikiNufus + " oluyo ");

	}

}
