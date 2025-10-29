class Classwork{
    public static void main(String[] args){
        AdminUser A = new AdminUser();
        GustUser G = new GustUser();
        A.displayUserType();
        A.showMessage();
        G.displayUserType();
        G.showMessage();
    }
}

abstract class User{
    abstract public void showMessage();
    public void displayUserType(){
        System.out.println("User type selected");
    }
}
class AdminUser extends User{
    public void showMessage(){
        System.out.println("Welcome, Admin!");
    }
}
class GustUser extends User{
    public void showMessage(){
        System.out.println("Welcome, Gust!");
    }
}