package bolum02.alıştırmalar;

import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double suKg, ilkSicaklikSantigrat, sonSicaklikSantigrat, gerekliEnerji;
		
		System.out.println("su degerini kilogram cinsinden giriniz");
		suKg = input.nextDouble();
		System.out.println("ilk sicakligi degerini santigrat cinsinden giriniz");
		ilkSicaklikSantigrat = input.nextDouble();
		System.out.println("son sicakligi degerini santigrat cinsinden giriniz");
		sonSicaklikSantigrat = input.nextDouble();
		
		gerekliEnerji = suKg * (sonSicaklikSantigrat - ilkSicaklikSantigrat ) * 4184;
		
		System.out.println("ihtiyac duyulan enerji:  ");
		
		
		

	}

}
