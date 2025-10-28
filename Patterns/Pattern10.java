class Pattern10{
    public static void main(String[] args){
        System.out.println(0);
        for(int i=5;i>0;i--){
            int x=i;
            for(int j=i;j<=5;j++){
                System.out.print(x+++" ");
            }
            System.out.print(0);
            x=5;
            for(int j=i;j<=5;j++){
                System.out.print(" "+x--);
            }
            System.out.println();
        }
    }
}