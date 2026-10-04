import java.io.*;

class Student {
    public static void main(String[] args) {
        try {
            DataOutputStream dos =
                new DataOutputStream(new FileOutputStream("student.dat"));

            dos.writeInt(101);
            dos.writeUTF("Anu");
            dos.writeDouble(85.5);
            dos.close();

            DataInputStream dis =
                new DataInputStream(new FileInputStream("student.dat"));

            System.out.println("Roll No: " + dis.readInt());
            System.out.println("Name: " + dis.readUTF());
            System.out.println("Marks: " + dis.readDouble());

            dis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
