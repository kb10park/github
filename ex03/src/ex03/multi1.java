package ex03;

public class multi1 {

	public static void main(String[] args) {
		int a[]=new int[10];
		int b=1;
		int i;
		for(i=0;i<10;i++) {
			a[i]=++i;
			for(i=0;i<10;i++) {
				b*=a[i];
				System.out.printf("%d",b);
			}
		}

	}

}
