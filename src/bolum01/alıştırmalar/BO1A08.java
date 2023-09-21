package bolum01.alıştırmalar;
  import java.util.Scanner;  
  
public class BO1A08 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Dairenin yaricapini giriniz : ");
			int r = scan.nextInt();
      
			double alan = Math.PI * r * r;
			
			double cevre = 2 * Math.PI * r;
			
			
			System.out.println("dairenin alanı : " + alan);
			System.out.println("dairenin cevresi : " + cevre);
		}
                
	}
    
}
