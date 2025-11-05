import java.util.*;
class main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n1= input.nextInt();
        int n2= input.nextInt();
        System.out.println("Select the Operation\n1-Addition\n2-Subtraction\n3-Division\n4-Multiplication");
        int op = input.nextInt();
        Calculator obj = new Calculator();
        switch(op){
            case 1:obj.Add(n1,n2);
            break;
            case 2:obj.sub(n1,n2);
            break;
            case 3:obj.div(n1,n2);
            break;
            case 4:obj.mul(n1,n2);
            break;
        }
    }
}

class Calculator{
    public void Add(int n1,int n2){
        System.out.println(n1+" + "+n2+":"+(n1+n2));
    }
    public void sub(int n1,int n2){
        System.out.println(n1+" - "+n2+":"+(n1-n2));
    }
    public void mul(int n1,int n2){
        System.out.println(n1+" * "+n2+":"+(n1*n2));
    }
    public void div(int n1,int n2){
        System.out.println(n1+" / "+n2+":"+((double)n1/n2));
    }
}
