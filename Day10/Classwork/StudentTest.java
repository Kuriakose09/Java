class StudentTest{
    public static void main(String[] args){
        Student student = new Student();
        student.Setname("Rohan");
        student.SetrollNo(2);
        student.SetPer(78);
        System.out.println("Student Name:"+student.Getname()+", Roll Number:"+student.GetrollNo()+", Percentage:"+student.GetPer());
    }
}

class Student{
    private String name;
    private int rollNo;
    private int percentage;
    public void Setname(String name1){
        this.name = name1;
    }
    public String Getname(){
        return name;
    }
     public void SetrollNo(int roll){
        this.rollNo = roll;
    }
    public int GetrollNo(){
        return rollNo;
    }
     public void SetPer(int per){
        this.percentage = per;
    }
    public int GetPer(){
        return percentage;
    }
}