import java.sql.*;

class Connect {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root", "password");

        System.out.println("Connected Successfully");
        con.close();
    }
}
