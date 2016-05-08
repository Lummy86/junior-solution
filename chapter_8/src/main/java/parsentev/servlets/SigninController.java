package parsentev.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * TODO: comment
 * @author parsentev
 * @since 04.05.2016
 */
public class SigninController extends HttpServlet {
	private static final Logger log = LoggerFactory.getLogger(SigninController.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/LoginView.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String login = req.getParameter("login");
		String password = req.getParameter("password");
		if (UserStorage.getInstance().isCredentional(login, password)) {
			HttpSession session = req.getSession();
			synchronized (session) {
				session.setAttribute("login", login);
			}
			resp.sendRedirect(String.format("%s/", req.getContextPath()));
		} else {
			req.setAttribute("error", "Credentional invalid");
			doGet(req, resp);
		}
	}
}
