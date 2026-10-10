import java.sql.*;

class DBMeta {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college", "root", "password");

        DatabaseMetaData m = con.getMetaData();

        System.out.println(m.getDatabaseProductName());
        System.out.println(m.getDatabaseProductVersion());
        System.out.println(m.getDriverName());

        ResultSet rs = m.getTables(null, null, "%", null);
        while (rs.next())
            System.out.println(rs.getString("TABLE_NAME"));

        con.close();
    }
}
