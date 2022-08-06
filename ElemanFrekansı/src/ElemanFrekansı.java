import java.util.Arrays;

public class ElemanFrekansý {

	public static void main(String[] args) {
		
		int[] list = { 10,20,30,10,10,20,3,50,40,0,150,-12};
		int i,j,counter = 0;
		int [] counterList = new int[list.length];
		Arrays.fill(counterList,1);
		System.out.println("Dizi : "+Arrays.toString(list));
		
		for(i=0; i<list.length; i++) {
			counterList[i] = 1;
			for(j=0; j<list.length; j++) {
				if(i != j && list[i]==list[j]) {
					counterList[i]++;
				}
			}
		}
		
		for(i=0; i<list.length;i++) {
			for(j=0; j<list.length; j++) {
				if(i!=j && list[i]==list[j]) {
					list[j] = 0;
				}
			}
		}
		
		System.out.println("Tekrar Sayýlarý ");
		for(i=0; i<list.length;i++) {
			if(counterList[i]>=1) {
				if(list[i] != 0) {
					System.out.println(list[i]+" sayýsý "+counterList[i]+" kadar tekrar edildi.");
				}
			}
		}
			
			
		
	}

}
