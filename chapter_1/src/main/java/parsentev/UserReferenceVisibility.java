package parsentev;

/**
 * TODO: comment
 * @author parsentev
 * @since 31.03.2016
 */
public class UserReferenceVisibility {
	public static final class User {
		private String name;

		public User(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "User{" +
			       "name='" + name + '\'' +
			       '}';
		}
	}

	public static void main(String[] args) {
		User user = new User("1");
		reloadReference(user);
		System.out.println(user);
		user = new User("2");
		System.out.println(user);
	}

	public static void reloadReference(User user) {
		user = new User("3");
		System.out.println(user);
	}
}
