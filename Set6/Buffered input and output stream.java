import java.io.*;

class CopyFile {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream("input.txt"));

            BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream("output.txt"));

            int ch;

            while ((ch = bis.read()) != -1) {
                bos.write(ch);
            }

            bis.close();
            bos.close();

            System.out.println("File copied successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
