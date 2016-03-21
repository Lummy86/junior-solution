package rali;

public class UserStore {
	public static void main(String[] args) {
		User user = new User();
		System.out.println(user.getName());

		user = new User("Petr");
		System.out.println(user.getName());
	}
}