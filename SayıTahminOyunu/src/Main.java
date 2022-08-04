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
			System.out.println("L�tfen tahmininizi giriniz: ");
			choice = in.nextInt();
			
			if(choice < 0 || choice >99 ) {
				System.out.println("L�tfen 0 ile 99 aras�nda bir de�er giriniz: ");
				if(isWrong) {
					System.out.println("�ok fazla hatal� giri� yapt�n�z.Kalan hakk�n�z: "+(5-(++right)));
				}else {
					isWrong = true;
					System.out.println("Bundan sonraki hatal� say� giri�lerinizde hakk�n�zdan d��ecektir.");
				}
				continue;
			}
			if(choice == randomNumber) {
				System.out.println("Tebrikler do�ru tahmin.! ");
				isWin = true;
				break;
			}else {
				if(choice>randomNumber) {
					System.out.println("Daha b�y�k bir say� girdiniz! ");
				}else {
					System.out.println("Daha k���k bir say� girdiniz! ");
				}
				
				wrong[right++] = choice;
				System.out.println("Kalan hakk�n�z: " + (5-right));
			}
		}
		
		if(!isWin ) {
			System.out.println("Kaybettiniz ! ");
			System.out.println("Denedi�ini say�lar: "+Arrays.toString(wrong));
			System.out.println("Do�ru Cevap: "+randomNumber);
		}
			
		
		
		
	}

}
