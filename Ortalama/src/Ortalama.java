
public class Ortalama {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5};
		double average = 0.0;
		double averageHarmonic = 0.0;
		int sum=0;
		double sumHarmonic=0;
		for(int i=0; i<numbers.length;i++) {
			sum += numbers[i];
		}
		average = sum/numbers.length;
		
		for (int j=0;j<numbers.length;j++) {
			sumHarmonic += (1/numbers[j]);
		}
		averageHarmonic = sumHarmonic/numbers.length;
	
		System.out.println("Ortalamasý: "+average);
		System.out.println("Harmonik ortalamasý: "+averageHarmonic);
	}

}
