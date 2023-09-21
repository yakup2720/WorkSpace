package bolum02.alıştırmalar;

import java.util.Scanner;

public class A04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pound, kilogram;
		
		System.out.println("pound degerini giriniz: ");
		pound =  input.nextDouble();
		kilogram = pound * 0.454;
		
		System.out.println(pound + " pound " + kilogram + " kilogram. ");

	}

}
