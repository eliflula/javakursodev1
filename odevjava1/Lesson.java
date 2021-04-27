package odevjava1;

public class Lesson {
	
	public Lesson() {
		System.out.println("Yeni ders eklendi.");
		System.out.println("-------------");
	}

	public Lesson(int id,String name,String teacher) {
		
		this.id = id;
	    this.name = name;
	    this.teacher = teacher;
	}
	int id;
	String name;
	String teacher;
	

}

