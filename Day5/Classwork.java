
public class Classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[]= {50,65,89,91,49};
		for(int i=0;i<score.length;i++) {
			if(score[i]>=90) {
				System.out.println("Student "+(i+1)+" is Excellent");
			}
			else if(score[i]>=75 && score[i]<90) {
				System.out.println("Student "+(i+1)+" is Good");
			}
			else if(score[i]>=50 && score[i]<75) {
				System.out.println("Student "+(i+1)+" is Average");
			}
			else {
				System.out.println("Student "+(i+1)+" is Fail");
			}
		}
	}

}