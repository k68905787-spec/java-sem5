import java.sql.*;

class Navigate {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college", "root", "password");

        Statement s = con.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = s.executeQuery("SELECT * FROM student");

        rs.last();
        System.out.println(rs.getString(2));

        rs.first();
        System.out.println(rs.getString(2));

        rs.absolute(2);
        System.out.println(rs.getString(2));

        rs.previous();
        System.out.println(rs.getString(2));

        con.close();
    }
}
