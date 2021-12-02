import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "PlacePizzaOrder", urlPatterns = "/pizza-order")
public class PlacePizzaOrder extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.getRequestDispatcher("/pizza-order.jsp").forward(request , response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


		String crustType = request.getParameter("crust-type");
		String sauceType = request.getParameter("sauce-type");
		String sizeType = request.getParameter("size-type");
		String[] toppings = request.getParameterValues("toppings");

		for (String topping : toppings){
			System.out.println(topping);
	}
		String address = request.getParameter("address");

		System.out.printf("%n Your size of pizza is: %s %n Your sauce type is: %s %n Your crust type is: %s %n We will have your order delivered to: %s" , sizeType, sauceType, crustType, address);

		request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
	}
}

