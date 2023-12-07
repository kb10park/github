package ex03;

public class FindMaxMin {

	public static void main(String[] args) {
		int[]arr=new int[10];
		int i,max;
		for(i=0;i<10;i++) {
			arr[i]=Integer.parseInt(args[i]);
				}
        max=arr[0];
        for(i=0;i<10;i++) {
        	if(arr[i]>max)
        		max=arr[i];
        }
        System.out.println("최댓값"+ max);
	}

}
