package ����������;

import java.util.Scanner;

public class L103 {
	static boolean is����(int i) {
		if(i%4==0&&i%100==0||i%400==0) {
			return true;
		}else {
		 return false;
		
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵�� �־��ּ���");
		int a = sc.nextInt();
        if( is����( a ) ) {
            System.out.println(a+"���� �����Դϴ�.");
         } else {
            System.out.println(a+"���� ������ �ƴմϴ�.");
         }		

	}

}
