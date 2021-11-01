import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculate", value = "/calculate")
public class Calculate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String productName=request.getParameter("productName");
    float productPrice=Float.parseFloat(request.getParameter("productPrice"));
    float discountPercent=Float.parseFloat(request.getParameter("discountPercent"));
    float discountAmount=productPrice*discountPercent/100;
    float discountPrice=productPrice-discountAmount;
        PrintWriter printWriter=response.getWriter();
        printWriter.println("<html>");


    if(productPrice<=0||discountPercent<0||discountPercent>100){
        printWriter.println("<h1>Wrong value</h1>");
    }
    else {
        printWriter.println("<h2> Product Name:"+productName+"</h2>");
        printWriter.println("<h2> Product Price: "+productPrice+"</h2>");
        printWriter.println("<h2> Discount Percent: "+discountPercent+" %</h2>");
        printWriter.println("<h2> discount Amount: "+discountAmount+"</h2>");
        printWriter.println("<h2> discount Price: "+discountPrice+"</h2>");
    }
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
