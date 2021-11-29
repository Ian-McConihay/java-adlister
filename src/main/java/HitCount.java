import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ViewCountServlet", urlPatterns = "/count")
public class HitCount extends HttpServlet {
	private int hitCount;

//	public void reset(){
//		hitCount = 0;
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		hitCount++;
		out.println("View Count: " + hitCount);
	}
}
