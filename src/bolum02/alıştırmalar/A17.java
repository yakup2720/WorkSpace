package bolum02.alıştırmalar;

import java.util.Scanner;

public class A17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("-58 Fahrenhayt ve 41 FahrenhayTta  arasinda bir sicaklik giriniz: ");
		double FahrenhayTta = input.nextDouble();
		
		System.out.println("ruzgarHizini ( >=2 ) saatte mil cinsinden girin: ");
		double ruzgarHizi = input.nextDouble();
		
		//Terim1
		double degisken1 = 35.74;
		
		//Terim2
		double degisken2 = 0.6215 * FahrenhayTta;
		
		//Terim3
		double degisken3 = 35.75 * (Math.pow(ruzgarHizi, 0.16));
		
		//Terim4
		double degisken4 = 0.4275 *  FahrenhayTta * (Math.pow(ruzgarHizi, 0.16));
		
		double w = degisken1 + (degisken2 - degisken3) + degisken4;
		
		System.out.println("ruzgar sogukluk endeksi " + w + " dir" );
		
		
		
		
		
		
		
		input.close();

	}

}
