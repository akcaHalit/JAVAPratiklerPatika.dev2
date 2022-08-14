
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Row: ");
		int row = in.nextInt();
		System.out.println("Col: ");
		int col = in.nextInt();
		MineSweeper mine = new MineSweeper(row,col); 
		mine.run();
	}

}
