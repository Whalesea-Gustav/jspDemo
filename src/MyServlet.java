import javax.servlet.*;
import java.io.IOException;

public class MyServlet implements Servlet {

    /* 五个方法需要重写
    inti初始化，service服务，destroy销毁
    getServletConfig(Servlet配置信息)
    getServletInfo(Servlet信息)

    service 是写业务逻辑的地方
     */

    /* Servlet生命周期
    1. 加载Servlet。当Tomcat第一次访问Servlet时，Tomcat创建Servlet的实例
    2. 初始化。当Servlet被实例化时，Tomcat会调用init()初始化这个对象
    3. 处理服务。当浏览器访问Servlet时，Servlet会调用service()方法处理这个请求
    4. 销毁。当Tomcat关闭时或者检测到Servlet要从Tomcat中删除时，会调用destroy方法，让实例释放占用的内存。
    5. 卸载。当Servlet调用完destroy后，等待垃圾回收


     */

    //第一次访问Servlet, init() 和 service() 被调用
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("initialization");

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    //第一次调用MyServlet后，每次访问，只有Servlet被调用
    @Override
    public void service (ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().write("Hello World");
        System.out.println("visted");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    //关闭Tomcat时，destroy被调用
    @Override
    public void destroy() {
        System.out.println("destroyed");
    }
}
