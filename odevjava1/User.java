package odevjava1;

public class User {
	
	public User() {
		System.out.println("Yeni bir kullanýcý eklendi.");
		System.out.println("------------");
	}
	public User(int id,String name,int age) {
		this();
		this.id = id;
		this.name = name;
	    this.age = age;
	}
	
	int id;
	String name;
	int age;
}
