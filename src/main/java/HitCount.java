import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ViewCountServlet", urlPatterns = "/count")
public class HitCount extends HttpServlet {
	private static int hitCount;
//	private int hitCount;

	public static void reset() {
		hitCount = 0;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		hitCount++;
		out.println("View Count: " + hitCount);

//		<form action="${pageContext.request.contextPath}/myservlet" method="post">
//    	<input type="submit" name="button1" value="Button 1" />
//		</form>

		if (request.getParameter("button1") != null) {
			HitCount.reset();
		}
	}
}
