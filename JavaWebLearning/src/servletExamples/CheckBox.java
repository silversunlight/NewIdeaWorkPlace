package servletExamples;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CheckBox extends HttpServlet {
    public static final long serialVersionUID=1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8 ");
        PrintWriter out=response.getWriter();
        String title = "��ȡ��ѡ������";
        String docType = "<!DOCTYPE html> \n";
        out.println(docType+
        "<html>\n"+
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>���񰴽̳̱�ʶ��</b>: "
                + request.getParameter("runoob") + "\n" +
                "  <li><b>Google ��ʶ��</b>: "
                + request.getParameter("google") + "\n" +
                "  <li><b>�Ա���ʶ��</b>: "
                + request.getParameter("taobao") + "\n" +
                "</ul>\n" +
                "</body></html>"
        );
    }

    public void  doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException {
        doGet(request,response);
    }
}
