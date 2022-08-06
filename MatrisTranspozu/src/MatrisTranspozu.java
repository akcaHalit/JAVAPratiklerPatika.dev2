
public class MatrisTranspozu {

	public static void main(String[] args) {
		
		int[][] matris =  {{1,2,3},{4,5,6}};
		int[][] transpose = new int[3][2];
		
		for(int i=0;i<matris.length;i++) {
			for(int j=0; j<matris[i].length; j++) {
				transpose[j][i] = matris[i][j]; 	
			}
		}
		System.out.println("Matris: ");
		for(int i=0; i<matris.length; i++) {
			for(int j=0; j<matris[i].length;j++) {
				System.out.print(matris[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nTranspose: ");
		for(int i=0;i<transpose.length;i++) {
			for(int j=0;j<transpose[i].length;j++) {
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		
		
			
	}

}
