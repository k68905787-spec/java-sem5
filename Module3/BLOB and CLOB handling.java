import java.sql.*;
import java.io.*;

class BlobClob {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college", "root", "password");

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO files VALUES(1,?,?)");

        ps.setBlob(1, new FileInputStream("photo.jpg"));
        ps.setClob(2, new FileReader("text.txt"));

        ps.executeUpdate();
        System.out.println("Data Stored");

        con.close();
    }
}
