class Pattern8{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            int x=i;
            for(int j=1;j<=5;j++){
                if(x>5){
                    x=1;
                }
                System.out.print((x++)+" ");
            }
            System.out.println();
        }
    }
}