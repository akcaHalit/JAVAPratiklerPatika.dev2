
import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
	
	int rowNumber;
	int columnNumber;
	boolean isFinish;
	boolean isWin;
	String[][] mine;
	String[][] noMine;
	int winCondition;
	
	MineSweeper(int rowNumber,int columnNumber){
		this.rowNumber = rowNumber;
		this.columnNumber = columnNumber;
		this.mine =  new String[rowNumber][columnNumber];
		this.noMine = new String[rowNumber][columnNumber];
		this.isFinish = false;
		this.isWin = false;
	}
		
	void createGameBoard() {
		for(int i=0; i<mine.length; i++) {
			for(int j=0; j<mine[i].length; j++) {
				mine[i][j] = "-";
				noMine[i][j] ="-";
			}
		}		
	}
	
	void putMine() {
		Random rand = new Random(20);
		int numberOfMines = (this.rowNumber*this.columnNumber)/4;
		this.winCondition = (this.rowNumber*this.columnNumber)-numberOfMines;
		
		for(int i=0; i<numberOfMines; i++) {
			int randMinePlaceRow = rand.nextInt(this.rowNumber);//*this.rowNumber;
			int randMinePlaceCol = rand.nextInt(this.columnNumber);//*this.columnNumber;
			
			if(mine[randMinePlaceRow][randMinePlaceCol] == "*" ) i--;
			else mine[randMinePlaceRow][randMinePlaceCol] = "*";
		}
	}
	
	 public void printField (boolean isMine){
	        if (isMine){
	            System.out.println("Place of Mines: => => ");
	            printField(mine);
	            System.out.println("==  ==  ==  ==  ==  ==  ==  ==  ==");
	            System.out.println("Welcome to the Mine Sweeper Game    :')     ");
	        } else {
	            System.out.println("===============================");
	            printField(noMine);
	        }
	    }
	
	 void printField(String[][] arr) {
		 for(String[] tempArr : arr) {
			 for(String tempArr2 : tempArr) {
				 System.out.print(tempArr2 +" ");
			 }
			 System.out.println();
		 }
	 }
	 	
	 public int nearMines (int row, int col) {
		 	int sumOfMines = 0;
		 	for(int i = -1; i < 2; i++) {
		 		for(int j =-1; j < 2; j++) {
		 			if(row+i<0 || col+j <0 || row+i >=this.rowNumber || col+j >= this.columnNumber) continue;
		 			if(mine[row+i][col+j].equals("*")) sumOfMines++;
		 		}
		 	}
		 return sumOfMines;			
	 }
	 
	void run() {
		createGameBoard();
		putMine();
		//printField(true);   // Shows the places of mines
		
		Scanner in = new Scanner(System.in);
		
		while(!isFinish) {
			printField(false);  
			System.out.print("Row: ");
			int row = in.nextInt();
			System.out.print("Column: ");
			int col = in.nextInt();
			
			
			if(row<0 || col<0 || row >=this.rowNumber || col >= this.columnNumber) {
				System.out.println(" Invalid Choice !");
				continue;
			}else {
				if(mine[row][col].equals("*")) {
					System.out.println(" Game is Over !\n-------------------");
					this.isWin = false;
					this.isFinish = true;
					break;
				}else {
					this.winCondition--; 
				}
				
				if(this.winCondition <= 0 ) {
					System.out.println(" YOU WÝN ! \n--------------------------");
					this.isFinish = true;
					this.isWin = true;
					break;
				}else {
					int numberOfNearMines = nearMines(row,col);
					noMine[row][col]  = String.valueOf(numberOfNearMines);
				}
			
			}
			
			
		}
	}
	 
	 
	 
}


	
	