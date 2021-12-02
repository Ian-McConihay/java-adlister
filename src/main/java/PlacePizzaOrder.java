import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PlacePizzaOrder", urlPatterns = "/pizza-order")
public class PlacePizzaOrder extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.getRequestDispatcher("/pizza-order.jsp").forward(request , response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();

		String crustType = request.getParameter("crust-type");
		System.out.println("Your crust type is: " + crustType);
		String sauceType = request.getParameter("sauce-type");
		System.out.println("Your sauce type is: " + sauceType);
		String sizeType = request.getParameter("size-type");
		System.out.println("Your size of pizza is: " + sizeType);
		request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
	}
}

