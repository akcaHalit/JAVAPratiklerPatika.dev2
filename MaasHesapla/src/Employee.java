
public class Employee {

	String name;
	int salary;
	int workHours;
	int hireYear;
	
	Employee(String name,int salary,int workHours,int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	
	double tax() {
		if(this.salary>=0 && this.salary<=1000) {
			return 0.0;
		}else {
			return this.salary*0.03;
		}
	}
	
	
	int bonus() {
		if(this.workHours>40){
			return (this.workHours-40)*30;
		}
		return 0;
	}
		
	
	double raiseSalary() {
		if(this.hireYear>2011) {
			return this.salary*0.05;
		}else if(this.hireYear<2011 && this.hireYear>2001) {
			return this.salary*0.10;
		}else if(this.salary<2001 && this.salary>0) {
			return this.salary*0.15;
		}else {
			return 0.0;
		}
	}
	
	
	public String toString() {
		double total = salary - tax() + bonus() + raiseSalary();
		double total2 = salary - tax() + bonus();
		System.out.println("Çalýþanýn ismi: "+this.name);
		System.out.println("Çalýþanýn maaþý: "+this.salary);
		System.out.println("Çalýþanýn Çalýþma Saatleri: "+this.workHours);
		System.out.println("Çalýþanýn Ýþe Baþladýðý Yýl: "+this.hireYear);
		System.out.println("Vergi : "+ this.tax());
		System.out.println("Bonus: "+this.bonus());
		System.out.println("Maaþ artýþý: "+ this.raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaþ: " + total2);
		System.out.println("Toplam Maaþ: "+ total);	
		return null;
	}
	
	
}
