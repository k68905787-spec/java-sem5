import java.io.*;
import java.util.*;

class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            DataOutputStream dos =
                new DataOutputStream(new FileOutputStream("employee.dat"));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            dos.writeInt(id);
            dos.writeUTF(name);
            dos.writeDouble(salary);
            dos.close();

            DataInputStream dis =
                new DataInputStream(new FileInputStream("employee.dat"));

            System.out.println("\nEmployee Details");
            System.out.println("ID: " + dis.readInt());
            System.out.println("Name: " + dis.readUTF());
            System.out.println("Salary: " + dis.readDouble());

            dis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
