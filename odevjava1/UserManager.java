package odevjava1;

public class UserManager {
	public void addLessonToUser(Lesson lesson, User user) {
		System.out.println(
				user.name + " " + " kullanýcýnýn ders listesine " + lesson.name + " kursu eklendi!");
		System.out.println("------------------");
	}

	public void remove(Lesson lesson, User user) {
		System.out.println(user.name + " " + " kullanýcýnýn ders listesinden " + lesson.name
				+ " kursu çýkarýldý!");
		System.out.println("-------------------");
	}
}
