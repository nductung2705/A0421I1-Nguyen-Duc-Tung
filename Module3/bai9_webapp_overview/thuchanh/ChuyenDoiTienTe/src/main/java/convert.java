import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "convert", value = "/convert")
public class convert extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usdNumber = Float.parseFloat(request.getParameter("usd"));
        float vndNumber = rate * usdNumber;
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        if (rate <= 0 || usdNumber <= 0) {
            printWriter.println("<h1>Wrong value </h1><br/>");
        } else {
            printWriter.println("<h1>VND convert: </h1><br/>");
            printWriter.println("<h2>" + vndNumber + "</h2><br/>");
        }
        printWriter.println("</html>");
    }
}
