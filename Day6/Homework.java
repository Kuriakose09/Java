package Day6;


public class Homework{
    public static void main(String[] args){
        int arr[]={78, 82, 37, 65, 35};
        int tot = 0;
        int avg = 0;
        int flag = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<35){
                System.out.println("Fail");
                flag = 1;
            }
        }
        if(flag==0){
            for(int i=0;i<arr.length;i++){
            tot += arr[i]; 
            }
            avg = tot/arr.length;
            System.out.println("Total score = "+tot);
            System.out.println("avg score = "+avg);
            if(avg>=90){
                System.out.println("Grade:A");
            }
            else if(avg<90 && avg>=75){
                System.out.println("Grade:B");
            }
            else if(avg<75 && avg>=60){
                System.out.println("Grade:C");
            }
            else{
                System.out.println("Grade:D");
            }
        }
    }
}