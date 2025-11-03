import java.util.*;
import java.util.regex.*;

class honeNumberExtarction{
    @SuppressWarnings("Unchecked")
    public static void Extract(String str){
        Pattern patt = Pattern.compile("\\d{10}");
        Matcher match = patt.matcher(str);
        if(match.find()){
            System.out.println("Phone nuumber found");
        }
        else{
            System.out.println("No phone number found");
        }
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Messege:");
        String str = input.nextLine();
        Extract(str);
    }
}