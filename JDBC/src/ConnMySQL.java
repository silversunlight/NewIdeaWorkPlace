import java.sql.*;

public class ConnMySQL {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mmall"
                , "root", "123456");
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("select * from mmall_cart");
        while (rs.next()) {
            System.out.println(rs.getInt(3)+"\t"
            +rs.getInt(2)+"\t"
            +rs.getInt(2)+"\t"
            +rs.getInt(1)+"\t"
            +rs.getInt(1)+"\t"
            );
        }
    }
}
