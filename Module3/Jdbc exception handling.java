import java.sql.*;

class JDBCError {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root", "password");

            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM student");

            while (rs.next())
                System.out.println(rs.getString(2));

            con.close();
        } catch (SQLException e) {
            System.out.println("Database Error");
        }
    }
}
