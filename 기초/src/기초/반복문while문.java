package 기초;

import java.util.Scanner;

public class 반복문while문 {
//while(조건식)참이면 실행 거짓이면 실행하지않음

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("숫자 넣으셈 : ");
		Scanner sc = new Scanner(System.in);
		int inputnum = sc.nextInt();
		int i = 1;
		while(i<10) {
			System.out.printf("%d*%d = %d\n",inputnum,i,(inputnum*i));
			i++;
		}
		int b = 10;
		do {
			System.out.println("일단 한번은 실행");
			b++;
		}while(b<13);
		
	}

}
