public class Student {

	Course c1;
	Course c2;
	Course c3;
	String name;
	String stuNo;
	String classes;
	double average;
	double c1Average;
	double c2Average;
	double c3Average;
	boolean isPass;
	
	
	Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.average = 0.0;
		this.c1Average =0.0;
		this.c2Average = 0.0;
		this.c3Average =0.0;
		this.isPass = false;
	}
	
	void addBulkExamNote(int note1,int note2,int note3,int snote1,int snote2,int snote3) {
		if((note1>=0 && note1<=100) && (snote1>=0 && snote1<=100)) {
			this.c1.note = note1;
			this.c1.sozluNotu = snote1;
		}
		if((note2>=0 && note2<=100) && (snote2>=0 && snote2<=100)) {
			this.c2.note = note2;
			this.c2.sozluNotu = snote2;
		}
		if((note3>=0 && note3<=100) && (snote3>=0 && snote3<=100)) {
			this.c3.note = note3;
			this.c3.sozluNotu = snote3;
		}
	}
	
	void printNote() {
		/*
		System.out.println(c1.name+" Notu\t: "+this.c1.note);
		System.out.println(c1.name+" SözlüNotu\t: "+this.c1.sozluNotu);
		System.out.println(c2.name+ " Notu\t: "+this.c2.note);
		System.out.println(c1.name+" SözlüNotu\t: "+this.c2.sozluNotu);
		System.out.println(c3.name+" Notu\t: "+this.c3.note);
		System.out.println(c1.name+" SözlüNotu\t: "+this.c3.sozluNotu);
		System.out.println("Ortalamanýz: "+this.average);
		*/
		System.out.println(c1.name+" Dersi Ortalamanýz\t:"+this.c1Average);
		System.out.println(c2.name+" Dersi Ortalamanýz\t:"+this.c2Average);
		System.out.println(c3.name+" Dersi Ortalamanýz:"+this.c3Average);
		System.out.println("\nOrtalamanýz: "+this.average);

	}
	
	void calcAverage() {
		this.c1Average = (this.c1.note*0.8+this.c1.sozluNotu*0.2);
		this.c2Average = (this.c2.note*0.8+this.c2.sozluNotu*0.2);
		this.c3Average = (this.c3.note*0.8+this.c3.sozluNotu*0.2);
		this.average = (this.c1Average+this.c2Average+this.c3Average)/3;
	}
	
	
	void isPass() {
		if(this.average>=60) {
			System.out.println("Hababam Sýnýfý Uyanýyor.");
		}else {
			System.out.println("Hababam Sýnýfý sýnýfta kaldý.");
		}
	}
		
	
	
}
