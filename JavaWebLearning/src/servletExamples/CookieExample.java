package servletExamples;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

public class CookieExample extends HttpServlet {
    public static final long serialVersionUID=1L;

    public CookieExample() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie name = new Cookie("name", URLEncoder.encode(req.getParameter
                ("name"), "UTF-8"));
        Cookie url = new Cookie("url", req.getParameter("url"));

        name.setMaxAge(60 * 60 * 24);
        url.setMaxAge(60 * 60 * 24);

        resp.addCookie(name);
        resp.addCookie(url);

        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        String title = "���� Cookie ʵ��";
        String docType = "<!DOCTYPE html>\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "  <li><b>վ������</b>��"
                + req.getParameter("name") + "\n</li>" +
                "  <li><b>վ�� URL��</b>��"
                + req.getParameter("url") + "\n</li>" +
                "</ul>\n" +
                "</body></html>");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
