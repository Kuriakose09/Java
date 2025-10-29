import java.util.*;
import java.time.LocalDateTime;

public class Classwork {
	public static int avg(int[] mark){
		int sum =0;
		double avg=0;
		for(int i=0;i<mark.length;i++) {
			sum+=mark[i];
		}
		avg=sum/mark.length;
		System.out.println("Average Score is: "+avg);
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students:");
		int num=input.nextInt();
		String student[]= new String[num];
		int marks[]= new int[num];
		for(int i=0;i<num;i++) {
			input.nextLine();
			System.out.print("Enter the name of Student["+(i+1)+"]:");
			student[i]=input.nextLine();
			System.out.print("Enter his Marks:");
			marks[i]=input.nextInt();
		}
		System.out.println();
		System.out.println("Name of Student and Marks");
		for(int i=0;i<num;i++) {
			System.out.println(student[i]+" "+marks[i]);
		}
		for(int i=0;i<num;i++) {
			if(marks[i]<35) {
				System.out.println("Needs improvement for "+student[i]);
			}
		}
		System.out.println();
		avg(marks);
		System.out.println();
		System.out.println(LocalDateTime.now());
	}

}