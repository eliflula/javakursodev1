package odevjava1;

public class UserManager {
	public void addLessonToUser(Lesson lesson, User user) {
		System.out.println(
				user.name + " " + " kullan�c�n�n ders listesine " + lesson.name + " kursu eklendi!");
		System.out.println("------------------");
	}

	public void remove(Lesson lesson, User user) {
		System.out.println(user.name + " " + " kullan�c�n�n ders listesinden " + lesson.name
				+ " kursu ��kar�ld�!");
		System.out.println("-------------------");
	}
}
