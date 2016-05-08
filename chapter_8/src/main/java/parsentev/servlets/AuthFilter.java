package parsentev.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * TODO: comment
 * @author parsentev
 * @since 04.05.2016
 */
public class AuthFilter implements Filter {
	private static final Logger log = LoggerFactory.getLogger(AuthFilter.class);

	public void init(FilterConfig filterConfig) throws ServletException {

	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		if (request.getRequestURI().contains("/signin")) {
			chain.doFilter(req, resp);
		} else {
			HttpSession session = request.getSession();
			synchronized (session) {
				if (session.getAttribute("login") == null) {
					((HttpServletResponse) resp).sendRedirect(String.format("%s/signin", request.getContextPath()));
					return;
				}
			}
			chain.doFilter(req, resp);
		}
	}

	public void destroy() {

	}
}
