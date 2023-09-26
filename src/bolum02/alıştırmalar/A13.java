package bolum02.alıştırmalar;

import java.util.Scanner;

public class A13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("aylik tasarruf miktarinizi giriniz:");
		double tasarrufMiktari = input.nextDouble();
		
		System.out.println("yillik faiz oranini giriniz: ");
		double yillikFaizOrani = input.nextDouble() / 100;
		
		double aylikFaizOrani = yillikFaizOrani / 12;
		
		//ilk ayın sonunda hesabınızdaki miktar
		double ilkAY = tasarrufMiktari * (1 + aylikFaizOrani );
		
		//ikinci ayın sonunda hesabınızdaki miktar
		double ikinciAy =  (100 + ilkAY ) * (1 + aylikFaizOrani );
		
		//ucuncu ayın sonunda hesabınızdaki miktar
		double ucuncuAy =  (100 + ikinciAy ) * (1 + aylikFaizOrani );
		
		//dorduncu ayın sonunda hesabınızdaki miktar
		double dorduncuAy = (100 + ucuncuAy ) * (1 + aylikFaizOrani );
		
		//besinci ayın sonunda hesabınızdaki miktar
		double besinciAy = (100 + dorduncuAy ) * (1 + aylikFaizOrani );
		
		//altinci ayın sonunda hesabınızdaki miktar
		double altinciAy = (100 + besinciAy ) * (1 + aylikFaizOrani ); 
		
		double w = altinciAy = (100 + besinciAy ) * (1 + aylikFaizOrani );     
		
		System.out.println("alti ay sonra hasaptaki toplam para " + w + "$ dir" );
		
		
		
		
		
		

	}

}
