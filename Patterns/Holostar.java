class Holostar{
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            for(int k=i;k<5;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                if(j==0||j==i||i==4){
                    System.out.print("* ");
                }               
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}