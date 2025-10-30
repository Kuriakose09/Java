import java.util.*; 

class EmployeeTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Employees:");
        int num = input.nextInt();
        input.nextLine();
        Employee[] Employees = new Employee[num];
        for(int i=0;i<num;i++){
            Employees[i] = new Employee();
            Employees[i] = new Employee();
            System.out.print("Enter the name of Employee"+(i+1)+":");
            String name = input.nextLine();
            Employees[i].Setname(name);
            System.out.print("Enter the ID of Employee"+(i+1)+":");
            int ID = input.nextInt();
            input.nextLine();
            Employees[i].SetID(ID);
            System.out.print("Enter the number of Employee"+(i+1)+":");
            int number = input.nextInt();
            input.nextLine();
            Employees[i].SetNumber(number);
            System.out.print("Enter the Department of Employee"+(i+1)+":");
            String Department = input.nextLine();
            Employees[i].SetDepartmet(Department);
            System.out.print("Enter the Salary of Employee"+(i+1)+":");
            double Salary = input.nextDouble();
            input.nextLine();
            Employees[i].SetSalary(Salary);
        }
        System.out.println("Details of Employees");
        for(int i=0;i<num;i++){
            System.out.println("Details of Employee"+(i+1));
            System.out.println("Name:"+Employees[i].Getname()+", ID:"+Employees[i].GetID()+", number:"+Employees[i].GetNumber()+", Department:"+Employees[i].GetDepartment()+", Salary:"+Employees[i].GetSalary());
        }
    }
}
class Employee{
    private String Name;
    private int ID; 
    private int number;
    private String Department;
    private double Salary;

    public void Setname(String name){
        this.Name = name;
    }
    public String Getname(){
        return Name;
    }

    public void SetID(int ID){
        this.ID = ID;
    }
    public int GetID(){
        return ID;
    }

    public void SetNumber(int number){
        this.number = number;
    }
    public int GetNumber(){
        return number;
    }

    public void SetDepartmet(String Department){
        this.Department = Department;
    }
    public String GetDepartment(){
        return Department;
    }

    public void SetSalary(double Salary){
        this.Salary = Salary;
    }
    public double GetSalary(){
        return Salary;
    }

}