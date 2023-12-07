package ex03;

public class PointMove {

	public static void main(String[] args) {
		Point point1 = new Point();  // 객체 생성
		point1.move(10,10);            // 메시지
		System.out.print("x = " + point1.xPosition + " y 			= " + point1.yPosition);
	}
}