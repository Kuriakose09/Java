public class Pattern4{
    public static void main(String[] args){
         for(int i=0;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
         }
          for(int i=4;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
          }
    }
}
// public class Pattern4{
//     public static void main(String[] args){
//         for(int i=0;i<=9;i++){
//             if(i<=5){
//                 for(int j=1;j<=i;j++){
//                     System.out.print(j+" ");
//                 }
//             }
//             else{
//                 for(int j=i;j<=9;j++){
//                     int k=j-i+1;
//                     System.out.print(k+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }