package �˰���;

import java.util.Scanner;

public class �˰��� {
	static void n��() {
	Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (i<=n) {
			sum +=i; //sum�� i�� ����
			i++;
		}
		System.out.println("1����"+n+"������ ����"+sum+"�Դϴ�.");
	}
	static int med3(int a,int b,int c) {
		if(a>=b) //���� ���� �̰ż����ϸ� ������ �̰� �������ϸ� 10������
			if(b>=c) //���ε���  ����� �ͼ� �̰͵� ���غ��� �����ϸ�
				return b;   //�Ϸο� �ٵ� 
			else if (a<=c) return a; //a�� c�� ���� ���� c�� �� ũ�� 
			else return c; //�� �ƴϸ� c�� ����
		else if (a>c) //
			return a;
		else if (b > c) return c;
		else return b;
	}
	static int min4(int a,int b,int c,int d) { //�� ���� �ּڰ��� ���ϴ� �޼ҵ�
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		if(d<min) min = d;
		return min;
	}
	static int min3(int a,int b,int c) { //�� ���� �ּڰ��� ���ϴ� �޼ҵ�
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		return min;
	}
	static int max4(int a,int b,int c,int d) { //�� ���� �ִ��� ���ϴ� �޼ҵ�
		int max = a;
		if(b>max) max = b;
	
		if(c>max) max = c;
		
		if(d>max) max = d;
		
		return max;
	}
	static int max3(int a,int b, int c) { //�� ���� �ִ��� ���ϴ� �޼ҵ�
		int max = a;
		if(b>a) max = b;
	
		if(c>a) max = c;
		
		return max;
	}
	static int me3(int a,int b, int c) {
		
		if(a>=b) //case 1 b�� a���� ������ b<a
			if(b>=c) //1.b�� c���� Ŭ�� b>c
				return b;
			else if(c<=a) return c; //b<c<a
			else return a;//b<a<c
		else if(a>=c) return a; //b>a>c
		else if(b<=c) return b;
		else return c;
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ���� ���� :");
		n��();
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.printf("a�� ��:%d\n",a);
		System.out.printf("b�� ��:%d\n",b);
		System.out.printf("c�� ��:%d\n",c);
		System.out.printf("�߾Ӱ��� " + me3(a,b,c)+"�Դϴ�\n");
		System.out.printf("�߾Ӱ��� " + med3(a,b,c)+"�Դϴ�");
//		System.out.println("max3(2,1,3) = "+max3(2,1,3));
		*/
	}

}
