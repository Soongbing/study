package ����;

import java.util.Scanner;
//for(�ʱⰪ;���ǽ�;������;
public class �ݺ��� {
//���α׷� ������ Ư�� ���ǿ� ���� �ݺ������� �����ϴ� ��
	//ex) ���̸� �ݺ��϶� �����̸� �ݺ���������
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("inputnum : ");
		Scanner sc = new Scanner(System.in);
		int inputnum = sc.nextInt();
		
		for(int i=1;i<10;i++) {
		System.out.printf("%d * %d = %d\n",inputnum,i,(inputnum*i));
	}

		sc.close();
 }
}