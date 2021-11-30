import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = "Ian";
        String searchQuery = request.getParameter("q");



        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

//        out.println("<h1>Hello, World!</h1>");
        out.printf("<h1>Hello, %s!</h1>", name);




        if(searchQuery != null){
            out.println("<p>Whats up " + searchQuery + "?<p>");
        } else {
            out.println("<h1>Hello World!</h1>");
        }
    }
// ?q= is how you pass a querystring
}