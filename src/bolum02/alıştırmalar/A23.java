package bolum02.alıştırmalar;
import java.util.Scanner;

public class A23 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("mesafayi giriniz: ");
		double mesafe = input.nextDouble();
		
		System.out.println("yakit tuketimini giriniz: ");
		double yakitTuketimi = input.nextDouble();
		
		System.out.println("yakit fiyatini giriniz: ");
		double yakitFiyati = input.nextDouble();
		
		//kilometre basına kac litre yakıt gidiyo bunu hesaplamak icin
		double kilometreBasınaYakıtTuketimi =  mesafe /  yakitTuketimi ; 
		
		double toplamMaliyet = (mesafe /  yakitTuketimi ) * yakitFiyati ;
		
		System.out.println("toplam maliyet " + toplamMaliyet + "$ dir " );
		
		

	}

}
