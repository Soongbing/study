package ����;

import java.util.Scanner;

public class switch�� {
//�� ����� �Ǵ� ��� ���� ���û����� ���� ��� �ַ� ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ֽʼ�: ");
		int score = sc.nextInt();
		
		switch(score) { //����ġ(���Ұ�)
		case 100:
		case 90:
			System.out.println("��");
			break;
		case 80:
			System.out.println("��");
			break;
		case 70:
			System.out.println("��");
			break;
		case 60:
			System.out.println("��");
		    break;
		case 50:
			System.out.println("��");
			break;
			
			default:
				System.out.println("90~50������ ����");
				break;
			
		
		}
		
	}

}
