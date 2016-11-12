package parsentev.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO: comment
 * @author parsentev
 * @since 19.04.2016
 */
public class User {
	private String id;
	String login;
	String email;
	private String password;

	public User(String id, String login, String email, String password) {
		this.id = id;
		this.login = login;
		this.email = email;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getId() {
		return id;
	}
}
