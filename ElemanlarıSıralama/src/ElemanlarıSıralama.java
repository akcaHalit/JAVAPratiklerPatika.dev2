
import java.util.Arrays;
import java.util.Scanner;
public class Elemanlar�S�ralama {

	public static void main(String[] args) {

		int n,min,max;
		Scanner in = new Scanner(System.in);
		System.out.println("Dizinin boyutu n: ");
		n = in.nextInt();
		int[] list = new int[n];
		for(int i=0; i<n ;i++) {
			System.out.println((i+1)+".ci eleman� : ");
			list[i] = in.nextInt();
		}
		
		for(int i=0;i<list.length;i++) {
			for(int j=i+1;j<list.length;j++) {
				
				if(list[i]>list[j]) {
					int temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
			
		}
		
		System.out.println("S�ralama: "+Arrays.toString(list));
		
	}

}
