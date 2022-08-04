import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		// double number = Math.rint(Math.random() * 100);
		Random rand = new Random();
		int randomNumber = rand.nextInt(100);
		System.out.println(randomNumber);
		Scanner in = new Scanner(System.in);
		int right = 0,choice;
		int[] wrong = new int[5];
		boolean isWin = false,isWrong = false;
		while(right < 5) {
			System.out.println("-------------------------------");
			System.out.println("Lütfen tahmininizi giriniz: ");
			choice = in.nextInt();
			
			if(choice < 0 || choice >99 ) {
				System.out.println("Lütfen 0 ile 99 arasýnda bir deðer giriniz: ");
				if(isWrong) {
					System.out.println("Çok fazla hatalý giriþ yaptýnýz.Kalan hakkýnýz: "+(5-(++right)));
				}else {
					isWrong = true;
					System.out.println("Bundan sonraki hatalý sayý giriþlerinizde hakkýnýzdan düþecektir.");
				}
				continue;
			}
			if(choice == randomNumber) {
				System.out.println("Tebrikler doðru tahmin.! ");
				isWin = true;
				break;
			}else {
				if(choice>randomNumber) {
					System.out.println("Daha büyük bir sayý girdiniz! ");
				}else {
					System.out.println("Daha küçük bir sayý girdiniz! ");
				}
				
				wrong[right++] = choice;
				System.out.println("Kalan hakkýnýz: " + (5-right));
			}
		}
		
		if(!isWin ) {
			System.out.println("Kaybettiniz ! ");
			System.out.println("Denediðini sayýlar: "+Arrays.toString(wrong));
			System.out.println("Doðru Cevap: "+randomNumber);
		}
			
		
		
		
	}

}
