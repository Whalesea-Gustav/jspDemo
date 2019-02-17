import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyHttpServlet")
public class MyHttpServlet extends HttpServlet {
    /* Servlet的接口实现需要重写五个方法，而HttpServlet已经实现了Servlet所有的方法，编写Servlet时，只要继承HttpServlet，重写需要的方法就够了
    HttpServlet在原有的Servlet基础上添加了一些HTTP协议处理方法，功能更为强大

    一般开发需要重写doGet()和doPost()方法
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
