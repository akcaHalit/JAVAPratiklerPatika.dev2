
public class Main {

	public static void main(String[] args) {

		Fighter f1  = new Fighter("Ali",10,100,100,50);
		Fighter f2  = new Fighter("Osman",15,85,90,30);
		
		Match match = new Match(f1,f2,90,100);
		match.run();
		
	}

}
