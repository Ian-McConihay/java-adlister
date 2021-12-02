import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Incorrect", urlPatterns = "/incorrect")
public class Incorrect extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = "Lose";
		request.setAttribute("message", message);

		request.getRequestDispatcher("outcome.jsp").forward(request, response);


	}
}

