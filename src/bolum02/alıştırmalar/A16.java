package bolum02.alıştırmalar;
import java.util.Scanner;
import java.lang.Math;
public class A16 {

	public static void main(String[] args) {
		double s, alan;
		Scanner input = new Scanner(System.in);
		//s:altıgenin kenar uzunlugu
		System.out.println("aligenin kenar uzunlgunu giriniz: ");
		s = input.nextDouble();
		
		alan = (3 * Math.sqrt(3)) * (Math.pow(s, 2)) / 2;
		
		System.out.println("altigenin alani " + alan + " dir ");
		

	}

}
