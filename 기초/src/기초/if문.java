package ����;
import java.util.Scanner;
public class if�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���ڸ� ġ���� : ");
		int num1 = sc.nextInt();
		System.out.println("���� �ι�° ���ڸ� ġ���� : ");
		int num2 = sc.nextInt();
		if(num1>num2) {
			System.out.println("ó�� ���� �ι�° ���� ũ�� ");
		}else if(num1<num2) {
			System.out.println("ó������ �ι�° ������ �۴�");
		}else {
			System.out.println("�Ѵ� ����");
			
			sc.close(); //��ĳ�ʾ��� �׻� �ڿ��� ȸ��������� ���ҽ��� �ٽ�
		}
	}

}
