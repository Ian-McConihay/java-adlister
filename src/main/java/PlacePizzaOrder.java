import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/")
public class PlacePizzaOrder extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();

		String crustType = request.getParameter("crust-type");
		System.out.println("Your crust type is: " + crustType);
		String sauceType = request.getParameter("sauce-type");
		System.out.println("Your sauce type is: " + sauceType);
		String sizeType = request.getParameter("size-type");
		System.out.println("Your size of pizza is: " + sizeType);
	}
}

