package �˰���;

import java.util.Scanner;

public class ����2 {
	public static int ����ڸ������ϱ�(int n) {
/*		   int sum = 0;
		   while(n>0) {
			   sum+=n%10;
			   n/=10;
		   }
		   return sum;
		   */
			if(n == 0) return 0;
			return (n%10+����ڸ������ϱ�(n/10));
	
	}
	static int ���丮��(int n) {
		if(n==0) return 1;
		return (n*���丮��(n-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  System.out.println("����� ���ڸ� �Է��Ͻÿ� :");
		  int n = sc.nextInt();
		 // System.out.printf("�Է¹��� ���� : %d\n",n);
		//System.out.printf("���������� : %d\n",����ڸ������ϱ�(n));
		System.out.printf("���丮�� : %d!=%d",n,���丮��(n));
	}
}
