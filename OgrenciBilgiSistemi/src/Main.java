
public class Main {

	public static void main(String[] args) {

		Teacher  t1 = new Teacher("Mahmut Hoca","555","TRH");
		Teacher  t2 = new Teacher("Graham Bell","444","FZK");
		Teacher  t3 = new Teacher("Külyutmaz","333","BIO");
		//Course tarih = new Course("Tarih","101","TRH",t1); 
		Course tarih = new Course("Tarih","101","TRH");
		tarih.addTeacher(t1);
		Course fizik = new Course("Fizik","101","FZK");
		fizik.addTeacher(t2);	
		//tarih.printTeacherInfo(); 
		Course biyo = new Course("Biyoloji","101","BIO");
		biyo.addTeacher(t3);
		
		Student s1 = new Student("Ýnek Þaban","123","4",tarih,fizik,biyo); 
		Student s2 = new Student("Güdük Necmi","121","4",tarih,fizik,biyo); 

		System.out.println(s1.name+" adlý öðrenci: ");
		s1.addBulkExamNote(100, 80, 50,50,67,0);
		s1.calcAverage();
		s1.printNote();
		s1.isPass();
		System.out.println("--------------------------------------");
		System.out.println(s2.name+" adlý öðrenci: ");
		s2.addBulkExamNote(10, 80, 70, 60, 50, 100);
		s2.calcAverage();
		s2.printNote();
		s2.isPass();
		
		
	}

}
