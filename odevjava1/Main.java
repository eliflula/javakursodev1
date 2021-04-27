package odevjava1;

public class Main {

	public static void main(String[] args) {
		Lesson lesson1 = new Lesson(1,"Java + REACT","Engin Demirog");
		Lesson lesson2 = new Lesson(2,"C# Kamp","Engin Demirog");
		
		
		Lesson[] lessons = {lesson1,lesson2};
		
		
		 User user1 =new User(1,"eliflula",20);
		 User user2 =new User(2,"brandon",19);
		 
		 
		 User[] users = {user1,user2};
		
		for (Lesson lesson : lessons) {

			System.out.println("Dersin id'si : " + lesson.id);
			System.out.println("Dersin ad� : " + lesson.name);
			System.out.println("Dersin egitmeni : " + lesson.teacher);
			System.out.println("-----------------------------------------");

	}
		for (User user : users) {

			System.out.println("Kullan�c�n�n id'si : " + user.id);
			System.out.println("Kullan�c�n�n tam ad� : " + user.name);
			System.out.println("Kullan�c�n�n yas� : " + user.age);
			System.out.println("-----------------------------------------");

		}
		UserManager userManager = new UserManager();

		userManager.addLessonToUser(lesson2, user1);
		userManager.remove(lesson1, user2);


}
}
