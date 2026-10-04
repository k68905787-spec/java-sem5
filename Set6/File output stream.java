import java.io.*;
import java.util.*;

class WriteFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            FileOutputStream fos =
                new FileOutputStream("output.txt", true);

            fos.write(text.getBytes());
            fos.close();

            System.out.println("Data written successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
