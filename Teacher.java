package patika.ogrenciNotSistemi;

public class Teacher {
	
	String name;
	String mpno;//mobilephone number
	String branch; //bölüm
	
	Teacher(String name,String branch,String mpno){//constractur
		
		this.name=name;
		this.mpno=mpno;
		this.branch=branch;
	}

	
	void print() {
		System.out.println(this.name);
		System.out.println(this.mpno);
		
		System.out.println(this.branch);
	}
}
