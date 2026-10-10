import java.sql.*;
import java.util.*;

class PreparedDemo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college", "root", "password");

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO student VALUES(?,?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.executeUpdate();

        ps = con.prepareStatement(
            "SELECT * FROM student WHERE id=?");
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();
        while (rs.next())
            System.out.println(rs.getInt(1) + " " + rs.getString(2));

        con.close();
    }
}
