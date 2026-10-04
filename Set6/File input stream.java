import java.io.*;

class ReadFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("input.txt");

            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
