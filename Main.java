package patika.ogrenciNotSistemi;

public class Main {

	public static void main(String[] args) {
	
		Teacher t1=new Teacher("Mahmut Hoca","TRH","09999999999");
		//t1.print();
		Teacher t2=new Teacher("ahmet Hoca","FZK","09999999999");
		Teacher t3=new Teacher( "mehmet Hoca","BIO","09999999999");

		
		Course tarih=new Course("Tarih","101","TRH"); 
		//tarih.printTeacherInfo();
		//tarih.addTeacher(t1);
		
		Course fizik=new Course("Fizik","102","FZK");
				
		//fizik.addTeacher(t2);	
		
		Course biyo=new Course("Biyoloji","103","BIO");
				
	//	biyo.addTeacher(t3);
		
		Student s1=new Student ("Şaban","123","4",tarih,fizik,biyo);
		s1.addBulkExamNote(100, 60, 40);
	//	s1.printNote();
		//s1.isPass();
		
		Student s2=new Student ("Necmi","321","4",tarih,fizik,biyo);
		s2.addBulkExamNote(45,55 ,60);
		//s2.isPass();
		s2.addSozlu(80,80, 80);
		s2.isPassSozlu();
	}

}
