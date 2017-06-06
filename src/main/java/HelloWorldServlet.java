import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    int counter = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

//        response.setContentType("text/html");
        PrintWriter output = response.getWriter();
//        request.getParameter("case");
//            output.println("<h1>Hello, World!</h1>");
        String name = request.getParameter("name");
        if (name == null) {
            output.println("<h1>Hello world</h1>");
        } else {
            output.printf("<h1>Hello %s</h1>", name);
        }


//        String aCase = request.getParameter("case");
//        if (aCase.equalsIgnoreCase("upper")) {
//            output.println("<h1>Hello World</h1>".toUpperCase());
//        } else if (aCase.equalsIgnoreCase("lower")) {
//            output.println("<h1>Hello World</h1>".toLowerCase());
//        } else {
//            output.println("<h1>Hello World</h1>");
//        }
//    }

}



// EXAMPLE OF WHAT WE ARE IN THE END DOING
//class TomcatContainer {
//    public static void main(String[] args) {
//        HelloWorldServlet servlet = new HelloWorldServlet();
//
//        while(true) {
//            servlet.doGet(req,res);
//        }
//    }
//}
