import java.util.*;
import java.time.*;

public class Homework {
	public static double discount(int total) {
		total=(total)-(total*10)/100;
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		  String Items[]= {"Rice", "Sugar", "Oil", "Soap", "Milk"};
		  int Prices[] = {50, 40, 100, 25, 30};
		  int total =0;
		  try {
			  for(int i=0;i<Items.length;i++) {
				  System.out.println("enter the quantity of "+Items[i]);
				  int qu=input.nextInt();
				  total = total+(Prices[i]*qu);
			  }
		  }catch(Exception e){
			  System.out.println("Enter integer value");
		  }
		  System.out.println();
		  System.out.println("Total Amount="+total);
		  if(total>=500) {
			  double discount=discount(total);
			  System.out.println();
			  System.out.println("After discount="+discount);
		  }
		  System.out.println();
		  System.out.println(LocalDateTime.now());
	}

}
