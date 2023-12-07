package ex03;
import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
	    int i,j, score=0;
	    int num[]=new int[10];
	    int answer[][]=
	    	{{1,3,2,4,1,3,2,4,3},
	    	{2,3,4,2,3,1,4,2,3},
	    	{4,3,1,3,2,4,3,2,1},
	    	{3,4,3,4,3,2,3,4,1}
	    	};
	    Scanner sc=new Scanner(System.in);
	    for(i=0;i<10;i++) {
	    	   num[i]=sc.nextInt();
	    }
	    for(i=0;i<5;i++) {
	    	for(j=0;j<10;j++) {
	    		if(num[i]==answer[i][j])
	    		score++;
	    	}System.out.println("학생"+(i+1)+"의점수는"+score);
	    	score=0;
	    }
	     
	    	 
	    	 
	   

	}
}
