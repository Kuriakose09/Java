
import java.io.*;

class Fileop{
    public static void main(String[] args) throws Exception {

        File file = new File("Newfile.txt");
        file.createNewFile();

        FileWriter output = new FileWriter("Newfile.txt");
        output.write("Java File Handling Practice");
        output.close();

        char[] arr = new char[100];
        FileReader data = new FileReader("Newfile.txt");
        data.read(arr);
        System.out.println(arr);
        data.close();

        file.delete();
    }
}