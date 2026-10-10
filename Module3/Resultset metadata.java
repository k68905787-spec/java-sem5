import java.sql.*;

class RSMetadata {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college", "root", "password");

        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM student");

        ResultSetMetaData m = rs.getMetaData();

        System.out.println("Columns: " + m.getColumnCount());

        for (int i = 1; i <= m.getColumnCount(); i++) {
            System.out.println(m.getColumnName(i));
            System.out.println(m.getColumnTypeName(i));
        }

        con.close();
    }
}
