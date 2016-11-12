package parsentev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Properties;

/**
 * TODO: comment
 * @author parsentev
 * @since 15.04.2016
 */
public class SQLStorage {
	private static final Logger log = LoggerFactory.getLogger(SQLStorage.class);

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/java_a_from_z";
		String username = "postgres";
		String password = "password";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
			PreparedStatement st = conn.prepareStatement("delete from users where id=?");
			st.setInt(1, 10);
			st.executeUpdate();
//			PreparedStatement st = conn.prepareStatement("SELECT * FROM users as u where u.id in (?, ?, ?)");
//			st.setInt(1, 3);
//			st.setInt(2, 7);
//			st.setInt(3, 8);
//			ResultSet rs = st.executeQuery();
//			while (rs.next()) {
//				System.out.println(String.format("%s %s", rs.getString("login"), rs.getTimestamp("create_date")));
//			}
//			rs.close();
//			st.close();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					log.error(e.getMessage(), e);
				}
			}
		}
	}
}
