package 알고리즘;

import java.util.Scanner;

public class 알고리즘 {
	static void n합() {
	Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (i<=n) {
			sum +=i; //sum에 i를 더함
			i++;
		}
		System.out.println("1부터"+n+"까지의 합은"+sum+"입니다.");
	}
	static int med3(int a,int b,int c) {
		if(a>=b) //따로 따로 이거성립하면 밑으로 이게 성립안하면 10번으로
			if(b>=c) //따로따로  여기로 와서 이것도 비교해보고 성립하면
				return b;   //일로옴 근데 
			else if (a<=c) return a; //a와 c만 비교한 다음 c가 더 크면 
			else return c; //다 아니면 c를 리턴
		else if (a>c) //
			return a;
		else if (b > c) return c;
		else return b;
	}
	static int min4(int a,int b,int c,int d) { //네 값의 최솟값을 구하는 메소드
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		if(d<min) min = d;
		return min;
	}
	static int min3(int a,int b,int c) { //세 값의 최솟값을 구하는 메소드
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		return min;
	}
	static int max4(int a,int b,int c,int d) { //네 값의 최댓값을 구하는 메소드
		int max = a;
		if(b>max) max = b;
	
		if(c>max) max = c;
		
		if(d>max) max = d;
		
		return max;
	}
	static int max3(int a,int b, int c) { //세 값의 최댓값을 구하는 메소드
		int max = a;
		if(b>a) max = b;
	
		if(c>a) max = c;
		
		return max;
	}
	static int me3(int a,int b, int c) {
		
		if(a>=b) //case 1 b가 a보다 작을때 b<a
			if(b>=c) //1.b가 c보다 클때 b>c
				return b;
			else if(c<=a) return c; //b<c<a
			else return a;//b<a<c
		else if(a>=c) return a; //b>a>c
		else if(b<=c) return b;
		else return c;
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("합을 구할 정수 :");
		n합();
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.printf("a의 값:%d\n",a);
		System.out.printf("b의 값:%d\n",b);
		System.out.printf("c의 값:%d\n",c);
		System.out.printf("중앙값은 " + me3(a,b,c)+"입니다\n");
		System.out.printf("중앙값은 " + med3(a,b,c)+"입니다");
//		System.out.println("max3(2,1,3) = "+max3(2,1,3));
		*/
	}

}
