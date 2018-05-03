package servletExamples;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class DatabaseAccess extends HttpServlet {
    private static final long serialVersionUID = 1L;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/runoob";
    static final String USER = "root";
    static final String PASS = "123456";

    public DatabaseAccess() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn=null;
        Statement stmt=null;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String title = "Servlet Mysql ���� - ����̳�";
        String docType = "<!DOCTYPE html>\n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n");
        try {
            // ע�� JDBC ������
            Class.forName("com.mysql.jdbc.Driver");

            // ��һ������
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // ִ�� SQL ��ѯ
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, name, url FROM websites";
            ResultSet rs = stmt.executeQuery(sql);

            // չ����������ݿ�
            while (rs.next()) {
                // ͨ���ֶμ���
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");

                // �������
                out.println("ID: " + id);
                out.println(", վ������: " + name);
                out.println(", վ�� URL: " + url);
                out.println("<br />");
            }
            out.println("</body></html>");

            // ��ɺ�ر�
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            // ���� Class.forName ����
            e.printStackTrace();
        } catch (SQLException e) {
            // ���� Class.forName ����
            e.printStackTrace();
        } finally {
            // ��������ڹر���Դ�Ŀ�
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException ignored) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
