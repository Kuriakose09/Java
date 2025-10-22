package Day5;
import java.util.*;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int arr[][]= {{59,60,75},
					  {67,55,88},
					  {22,33,100},
					  {33,33,155},
					  {55,6,66},
					  {66,6,55}};
		int p1=0;
		int p2=0;
		int p3=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(j==0) {
					p1+=arr[i][j];
				}
				if(j==1) {
					p2+=arr[i][j];
				}
				if(j==2) {
					p3+=arr[i][j];
				}
			}
		}
		System.out.println("Product 1 sales:"+p1);
		System.out.println("Product 2 sales:"+p2);
		System.out.println("Product 3sales:"+p3);
		int out[]= {p1,p2,p3};
		for(int i=0;i<out.length;i++){
			int p=out[i];
			if(p>=500) {
				System.out.println("P"+(i+1)+" Target Achieved");
			}
			else if(p>=300 && p<500) {
				System.out.println("P"+(i+1)+" Average Performance");
			}
			else {
				System.out.println("P"+(i+1)+" Needs Improvement");
			}
		}
	}
}