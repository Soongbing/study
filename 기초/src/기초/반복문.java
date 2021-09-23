package 기초;

import java.util.Scanner;
//for(초기값;조건식;증감값;
public class 반복문 {
//프로그램 진행을 특정 조건에 따라 반복적으로 진행하는 것
	//ex) 참이면 반복하라 거짓이면 반복하지마라
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