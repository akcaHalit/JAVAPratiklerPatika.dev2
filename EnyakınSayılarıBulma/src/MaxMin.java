
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
		System.out.println("Say�y� giriniz: \n------------------------------------\n");
		number = in.nextInt();
		//sondaki say�ya atad�k.
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
		System.out.println("Girilen say�: "+number);
		
		if(number<min ) {
			System.out.println("Dizide girdi�iniz say�dan daha k���k bir say� yok.");
			System.out.println("En yak�n en b�y�k say�: "+min);
		}else if(number == min) {
			System.out.println("Girdi�iniz say� dizide en k���k say�:"+number);
			System.out.println("Dizide girdi�iniz say�dan b�y�k en k���k say�: "+list[temp+1]);
		}else if(number>max ) {
			System.out.println("Dizide girdi�iniz say�dan daha b�y�k bir say� yok.");		
			System.out.println("En yak�n en k���k say�: "+max);
		}else if(number ==max) {
			System.out.println("Girdi�iniz say� dizide en b�y�k say�: "+number);
			System.out.println("Dizide girdi�iniz say�dan k���k en b�y�k say�: "+list[temp-1]);
		}
		else {
			System.out.println("Girilen say�dan k���k en b�y�k say�: "+ list[temp-1]);
			System.out.println("Girilen say�dan b�y�k en k���k say�: "+ list[temp+1]);
		}
		
	}

}
