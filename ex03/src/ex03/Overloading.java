package ex03;
public class Overloading {

	public static void main(String args[]) {
		Overload ol=new Overload();
		int i=0;
		int a[]=new int[Integer.parseInt(args[i])];
		switch(args.length) {
		case 0:
		ol.calc();
		break;
		case 1:
		ol.calc();
		break;
		case 2:
		ol.calc();
		break;
		case 3:
		ol.calc();
		break;
		default:
			System.out.println("매개변수가 너무 많습니다.");
		}

	}

	
	}


