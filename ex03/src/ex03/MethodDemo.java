package ex03;

public class MethodDemo {

	public static void main(String[] args) {
		int volume;
		Box b1=new Box(10,10,10);
		volume=b1.getVolume();
		System.out.println("박스 b1의 부피는="+volume);
		System.out.println("박스 b1의 너비는="+b1.getWidth());
		System.out.println("박스 b1의 높이는="+b1.getHeight());
        System.out.println("박스 b1의 깊이는="+b1.getDepth());
        b1.setWidth(30);
        b1.setDepth(30);
        b1.setHeight(30);
        b1.setVolume();
        System.out.println("박스 b1의 바뀐 너비는="+b1.getWidth());
        System.out.println("박스 b1의 바뀐 높이는="+b1.getHeight());
        System.out.println("박스 b1의 바뀐 깊이는="+b1.getDepth());
        System.out.println("박스 b1의 바뀐 부피는="+b1.getVolume());
	}

}
