import java.util.*;

class Third{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Rajesh");
        map.put(2,"rahul");
        map.put(3,"Sruthi");
        System.out.print("Enter the ID:");
        int id = input.nextInt();
        if(map.containsKey(id)){
            System.out.println(map.get(id));
        }
        else{
            System.out.println("Not found");
        }
    }
}