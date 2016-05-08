package parsentev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO: comment
 * @author parsentev
 * @since 31.03.2016
 */
public class User {
	private static final Logger log = LoggerFactory.getLogger(User.class);

	public String name;

	public User(String name) {
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize");
	}

	@Override
	public String toString() {
		return "User{" +
		       "name='" + name + '\'' +
		       '}';
	}
}
