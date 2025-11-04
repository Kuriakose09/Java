class Pattern11{
    public static void main(String[] args){
        int k=1;
        int y=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k+" ");
                k++;
                y=k-2;
            }
            for(int x=0;x<i;x++){
                System.out.print((y)+" ");
                y--;
            }
            System.out.println();
        }
    }
}