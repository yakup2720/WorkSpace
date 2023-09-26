package bolum02.alıştırmalar;
import java.util.Scanner;
public class A21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("yatirim miktarini giriniz: ");
		double yatirimMiktari = input.nextDouble();
		
		System.out.println("yillik faiz oranini giriniz: ");
		double yillikFaizOrani = input.nextDouble() / 100;
		
		System.out.println("yil sayisini giriniz: ");
		double yilSayisi = input.nextDouble();
		
		double aylikFaizOrani = yillikFaizOrani / 12;
		
		double yatiriminGeriDonusDegeri = yatirimMiktari * (1 + aylikFaizOrani  ) * yilSayisi * 12;
		
		System.out.println("biriktirilmis deger: " +  yatiriminGeriDonusDegeri + "$ dir " );
		
		
		

	}

}
