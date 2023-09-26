package bolum02.alıştırmalar;

public class A07 {

	public static void main(String[] args) {
		int dakika = 1_000_000_000, saat, gun, yıl;
		
		saat = dakika / 60;
		gun = saat / 24;
		yıl = gun / 365;
		gun = gun % 365;
		
		
		System.out.println(dakika + " dakika yaklasik olarak " + gun + " gun ve " + yıl + " yil. ");
		

	}

}
