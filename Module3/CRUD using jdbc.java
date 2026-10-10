import java.sql.*;

class CRUD {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root", "password");

        Statement s = con.createStatement();

        s.executeUpdate("CREATE TABLE IF NOT EXISTS student(id INT, name VARCHAR(30))");
        s.executeUpdate("INSERT INTO student VALUES(1,'Anu')");
        s.executeUpdate("UPDATE student SET name='Ammu' WHERE id=1");

        ResultSet rs = s.executeQuery("SELECT * FROM student");

        while (rs.next())
            System.out.println(rs.getInt(1) + " " + rs.getString(2));

        s.executeUpdate("DELETE FROM student WHERE id=1");

        con.close();
    }
}
