class pattern{
    public static void main(String[] args){
        for(int i=1;i<=9;i+=2){
            int x=i;
            for(int j=0;j<5;j++){
                if(x>9){
                    x=1;
                }
                System.out.print(x+" ");
                x+=2;
            }
            System.out.println();
        }
    }
}