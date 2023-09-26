package bolum02.alıştırmalar;
import java.util.Scanner;


public class A20 {
	   static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("bakiyeyi giriniz: ");
		double bakiye = input.nextDouble();
		
		System.out.println("faiz Oranini giriniz: ");
		double faizOrani = input.nextDouble();
		
		double faizGetirisi = bakiye * (faizOrani / 1200);
		
		System.out.println("faiz " + bakiye * (faizOrani / 1200) + " dir " );

	}

}
