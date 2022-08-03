public class Teacher {
	
	String name;
	String mono;
	String branch;
	
	Teacher(String name,String mono,String branch){
		this.name = name;
		this.branch = branch;
		this.mono = mono;
	}
	
	void print() {
		System.out.println("Name: "+this.name);
		System.out.println("Branch: "+this.branch);
		System.out.println("Mono: " +this.mono);
	}
	
		
}
