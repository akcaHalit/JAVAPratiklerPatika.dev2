
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
		System.out.println("�al��an�n ismi: "+this.name);
		System.out.println("�al��an�n maa��: "+this.salary);
		System.out.println("�al��an�n �al��ma Saatleri: "+this.workHours);
		System.out.println("�al��an�n ��e Ba�lad��� Y�l: "+this.hireYear);
		System.out.println("Vergi : "+ this.tax());
		System.out.println("Bonus: "+this.bonus());
		System.out.println("Maa� art���: "+ this.raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maa�: " + total2);
		System.out.println("Toplam Maa�: "+ total);	
		return null;
	}
	
	
}
