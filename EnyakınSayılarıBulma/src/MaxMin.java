
import java.util.Arrays;
import java.util.Scanner;
public class MaxMin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int number,temp=0;
		int[] list = {56,31,45,67,89,0,-15,67,13,0};
		int counter1=0,counter2=0,smallNear=0,bigNear=0;
		int min = list[0];
		int max = list[0];
		System.out.println("Sayýyý giriniz: \n------------------------------------\n");
		number = in.nextInt();
		//sondaki sayýya atadýk.
		list[list.length-1] = number;
		Arrays.sort(list);
		for(int i=0; i<list.length; i++) {
			if(number == list[i]) {
				temp = i;
			}
		}
		for(int i : list) {
			if(i<min) {
				min = i;
			}
			if(i>max) {
				max = i;
			}
		}
		System.out.println("Dizi:  {"+Arrays.toString(list)+" }");
		System.out.println("Girilen sayý: "+number);
		
		if(number<min ) {
			System.out.println("Dizide girdiðiniz sayýdan daha küçük bir sayý yok.");
			System.out.println("En yakýn en büyük sayý: "+min);
		}else if(number == min) {
			System.out.println("Girdiðiniz sayý dizide en küçük sayý:"+number);
			System.out.println("Dizide girdiðiniz sayýdan büyük en küçük sayý: "+list[temp+1]);
		}else if(number>max ) {
			System.out.println("Dizide girdiðiniz sayýdan daha büyük bir sayý yok.");		
			System.out.println("En yakýn en küçük sayý: "+max);
		}else if(number ==max) {
			System.out.println("Girdiðiniz sayý dizide en büyük sayý: "+number);
			System.out.println("Dizide girdiðiniz sayýdan küçük en büyük sayý: "+list[temp-1]);
		}
		else {
			System.out.println("Girilen sayýdan küçük en büyük sayý: "+ list[temp-1]);
			System.out.println("Girilen sayýdan büyük en küçük sayý: "+ list[temp+1]);
		}
		
	}

}
