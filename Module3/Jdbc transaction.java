import java.sql.*;

class TransactionDemo {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college", "root", "password");

        try {
            con.setAutoCommit(false);

            Statement s = con.createStatement();
            s.executeUpdate(
                "UPDATE account SET balance=balance-100 WHERE id=1");
            s.executeUpdate(
                "UPDATE account SET balance=balance+100 WHERE id=2");

            con.commit();
            System.out.println("Transfer Successful");
        } catch (Exception e) {
            con.rollback();
            System.out.println("Transfer Failed");
        }

        con.close();
    }
}
