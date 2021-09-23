package 알고리즘;

public class 정수N개의합 {

	public static long sum(int[]a) {
		long sum = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
		/*long i = 0;
		long sum = 0;
		while(true) {
			sum +=a[i];
			i++;
			if(a[i]<0) break;
		}
		return sum;*/
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5,6,7,8,9};
		System.out.println(sum(a));
	}

}
