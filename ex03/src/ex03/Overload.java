package ex03;

public class Overload {
	
	   void calc() {
              System.out.println("매개변수 없음");		
	}
	   void calc(int width) {
		   System.out.println("정사각형의 넓이"+width*width);
	   }
	   void calc(int width,int height) {
		   System.out.println("직사각형의 넓이"+width*height);
	   }
	   void calc(int width,int height, int depth) {
		   System.out.println("직육면체의 넓이"+width*height*depth);
	   }


}
