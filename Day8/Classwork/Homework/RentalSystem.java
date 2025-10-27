class RentalSystem{
    public static void main(String[] args){
        car zen = new car();
        ElectricScooter ola = new ElectricScooter();
        System.out.println("Properties of car");
        zen.start();
        zen.refuel();
        zen.stop();
        System.out.println("Properties of Electric Scooter");
        ola.start();
        ola.stop();
    }
}


interface Vehicle{
    public void start();
    public void stop();
}
interface FuelBased{
    public void refuel();
}
class car implements Vehicle,FuelBased{
    public void start(){
        System.out.println("Car engine started.");
    }
    public void stop(){
        System.out.println("Car engine stopped.");
    }
    public void refuel(){
        System.out.println( "Car is refueling at the station.");
    }
}
class ElectricScooter implements Vehicle{
    public void start(){
        System.out.println("Electric scooter powered on.");
    }
    public void stop(){
        System.out.println("Electric scooter powered off.");
    }
}
