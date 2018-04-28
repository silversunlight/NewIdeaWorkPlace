package servletExamples;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/URLGetExample")
public class URLGetExample extends HttpServlet {
    public static final long serVersionUID = 1L;

    public URLGetExample() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String title = "使用GET方法读取表单数据";
        String name = new String(request.getParameter("name"));
        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
                "<html> \n" +
                "<head><title>" + title + "</title></head> \n" +
                "<body bgcolor=\"#f0f0f0\"> \n"+
                "<h1 align=\"center\""+title+"</h1>\n"+
                "<ul>\n"+
                "<li><b>站点名</b>:"+
                name+"\n"+
                "<li><b>网址</b>:"+
                request.getParameter("url")+"\n"+
                "</ul>\n"+
                "</body></html>"
        );

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        doGet(request,response);
    }

}
