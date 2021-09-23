package 패턴인식;

import java.util.Scanner;

public class Step1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int 너비 = 4;
		int [] 배열 = { 0, 1, 2, 3,
					4, 5, 6, 9,
					8, 9, 10, 11
		};
		int index = 0;
		for(int i = 0;i<3;i++) {
			for(int b = 0; b<4; b++){
			System.out.printf("%d\t",배열[index]);
			index++;
		}
			System.out.printf("\n");
		}
		int row = 1;
		int col = 3;
		int 일차원인덱스 = row * 너비 +col;
		
		System.out.println("\n\n1행3열 = " +배열[일차원인덱스]);
	}

}
