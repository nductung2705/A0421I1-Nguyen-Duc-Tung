import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet_Customer",urlPatterns = "/list")
public class Servlet_Customer extends HttpServlet {
    List<Customer> listCustomer=new ArrayList<>();
    @Override
    public void init() throws ServletException {
        listCustomer.add(new Customer("Tung","27/05/1997","Gia Lai","https://i1-ngoisao.vnecdn.net/2021/07/02/song-joong-ki-33-jpeg-7361-1625220070.jpg?w=1020&h=0&q=100&dpr=1&fit=crop&s=UEmKVmyHiy_ti2wliFOyxA"));
        listCustomer.add(new Customer("Hoang","10/12/1986","Da Nang","https://pbs.twimg.com/profile_images/807107466009792512/ouFeHHDj_400x400.jpg"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list",listCustomer);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/views/ListCustomer.jsp");
        requestDispatcher.forward(request,response);
    }
}
