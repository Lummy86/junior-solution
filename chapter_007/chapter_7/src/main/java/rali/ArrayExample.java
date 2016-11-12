package rali;

public class ArrayExample {
	public static void main(String[] args) {
		User[] users = new User[5];
		users[0] = new User("petr");
		users[1] = new User("nick");
		users[2] = new User("make");
		users[3] = new User("miron");
		users[4] = new User("ban");
	
		User user = ArrayExample.findByName(users, "nick");

		System.out.println(user.name);
	}
	
	public static User findByName(User[] users, String name) {
		User result = null;
		for (User user : users) {
			if (name.equals(user.name)) {
				result = user;
				break;
			}
		}
		return result;
	}
}