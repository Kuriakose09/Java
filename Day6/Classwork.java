package Day6;


public class Classwork{
    public static void main(String[] args){
        int arr[] = {20, 15, 30, 9, 25};
        int flag = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                System.out.println("Out of stock");
                flag = 1;
                break;
            }
        }
        int tot = 0;
        if (flag==0){
             for(int i=0;i<arr.length;i++){
                tot+=arr[i];
             }
             System.out.println("total quantity = "+tot);
             if(tot<50){
                System.out.println("Low stock");
             }
             else if(tot>=50 && tot<100){
                System.out.println("Moderate stock");
             }
             else{
                System.out.println("Good stock");
             }
        }
    }
}