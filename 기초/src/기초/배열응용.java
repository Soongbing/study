package ����;
import java.util.Arrays;
import java.util.Scanner;
public class �迭���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]name = {"����ȣ","����ȣ","���ȣ","���ȣ","���ȣ"};
		String[]name2 = null;
		String[]name3 = null;
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s�� ������ �Է��Ͻÿ�", name[0]);
		score[0] = sc.nextInt();
		System.out.printf("%s�� ������ �Է��Ͻÿ�", name[1]);
		score[1] = sc.nextInt();
		System.out.printf("%s�� ������ �Է��Ͻÿ�", name[2]);
		score[2] = sc.nextInt();
		System.out.printf("%s�� ������ �Է��Ͻÿ�", name[3]);
		score[3] = sc.nextInt();
		System.out.printf("%s�� ������ �Է��Ͻÿ�", name[4]);
		score[4] = sc.nextInt();
		
		sc.close();
		
		System.out.println("name�� �迭 ����" + name.length); //�迭 ����
		
		System.out.println("name�ȿ� �ִ� ������ : " + Arrays.toString(name)); //�迭 ��� ���

		name3 = Arrays.copyOf(name, name.length); //(�迭, �迭��ũ��);
		System.out.println("name3�� �迭1�� ����" + Arrays.toString(name3)); //�ּҰ� ������ �ƴ� �ּҴ� �ٸ��� �����ִ� �޸𸮰� ������
		
		name2 = name; //�ּҰ� ���� �迭 ���۷���(����)
		System.out.println("name : " + name);
		System.out.println("name2 " + name2);
		System.out.println("name3 " + name3);
	}

}
