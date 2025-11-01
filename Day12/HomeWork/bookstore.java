import java.io.*;
class Bookstore{
    public static void main(String[] args){
        File file = new File("log.txt");
        try{
            file.createNewFile();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        
        try{
            FileWriter input = new FileWriter("log.txt");
            input.write("\"Book order placed at [your preferred time]\".");
            input.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        

        char[] arr = new char[100];
        try{
            FileReader data = new FileReader("log.txt");
            data.read(arr);
            data.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(arr);

        file.delete();
    }
}