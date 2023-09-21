package bolum02.alıştırmalar;

import java.util.Scanner;

public class A03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double feet, metre;
		
		System.out.println("feet degerini giriniz: ");
		feet =  input.nextDouble();
		metre = feet * 0.305;
		
		System.out.println(feet + " feet " + metre + " metre.");

	}

}
