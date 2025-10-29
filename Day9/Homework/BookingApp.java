import java.util.*;

class BookingApp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ride Type(car or auto):");
        String type = input.nextLine();
        System.out.print("Enter the distance in kilometer:");
        int d = input.nextInt();
        if(type.equals("car")){
            Carride car = new Carride();
            car.rideType();
            int fare = car.calculateFare(d);
            System.out.println("Your fare:"+fare); 
        }
        else if(type.equals("auto")){
            Autoride auto = new Autoride();
            auto.rideType();
            int fare = auto.calculateFare(d);
            System.out.println("Your fare:"+fare); 
        }
        else{
            System.out.println("Enter a valid Riding type");
        }
    }
}

abstract class Ride{
    abstract int calculateFare(int d);
    public void rideType(){
        System.out.println("Generic Ride");
    }
}

class Autoride extends Ride{
     public void rideType(){
        System.out.println("Auto Ride");
    }
    public int calculateFare(int d){
        return d*10;
    }
}

class Carride extends Ride{
     public void rideType(){
        System.out.println("Car Ride");
    }
    public int calculateFare(int d){
        return d*20;
    }
}