package 알고리즘;

import java.util.Scanner;

public class 연습2 {
	public static int 재귀자릿수더하기(int n) {
/*		   int sum = 0;
		   while(n>0) {
			   sum+=n%10;
			   n/=10;
		   }
		   return sum;
		   */
			if(n == 0) return 0;
			return (n%10+재귀자릿수더하기(n/10));
	
	}
	static int 팩토리얼(int n) {
		if(n==0) return 1;
		return (n*팩토리얼(n-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  System.out.println("계산할 숫자를 입력하시오 :");
		  int n = sc.nextInt();
		 // System.out.printf("입력받은 숫자 : %d\n",n);
		//System.out.printf("각숫자의합 : %d\n",재귀자릿수더하기(n));
		System.out.printf("팩토리얼 : %d!=%d",n,팩토리얼(n));
	}
}
