package ����;

import java.util.Scanner;

public class �ݺ���while�� {
//while(���ǽ�)���̸� ���� �����̸� ������������

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("���� ������ : ");
		Scanner sc = new Scanner(System.in);
		int inputnum = sc.nextInt();
		int i = 1;
		while(i<10) {
			System.out.printf("%d*%d = %d\n",inputnum,i,(inputnum*i));
			i++;
		}
		int b = 10;
		do {
			System.out.println("�ϴ� �ѹ��� ����");
			b++;
		}while(b<13);
		
	}

}
