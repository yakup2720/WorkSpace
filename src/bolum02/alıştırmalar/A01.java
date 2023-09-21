package bolum02.alıştırmalar;
import java.util.Scanner;
public class A01 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			double santigrat, fahrenhayt;
			
			System.out.println("fahrenhayta donusturulmesi icin derece giriniz: ");
			santigrat = input.nextDouble();
			System.out.println("santigrat " + santigrat);
			
			fahrenhayt = (9 / 5.0) * santigrat + 32;
			
			System.out.println(santigrat + " santigrat " + fahrenhayt + " fahrenhayttir");
		}

	}

}

