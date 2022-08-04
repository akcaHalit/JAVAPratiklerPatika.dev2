
import java.util.Scanner;
public class Main {

	static boolean isPalindrome(String word) {
		int i=0;
		int j = word.length()-1;
		while(i<j) {
			if(word.charAt(i) != word.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	static boolean isPalindrome2(String word) {
		String reverse = "";
		for(int i = word.length()-1; i>=0; i--) {
			reverse += word.charAt(i);
		}
		return word.equals(reverse);
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("kelimelerden sonra veya önce boþluk býrakmayýnýz. ");
		System.out.println("---------Kelimeyi giriniz: ");
		String word = in.nextLine();
		System.out.println(isPalindrome(word));
		System.out.println(isPalindrome2(word));
		
		
	}

}
