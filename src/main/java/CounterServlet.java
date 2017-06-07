/**
 * Created by Amberlee on 6/6/17.
 */

import javafx.application.Application;
import javafx.stage.Stage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name ="CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    private int counter = 0;

    protected void doGet (
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        counter++;
        response.getWriter().printf("You have visted this page %d times");
    }

}