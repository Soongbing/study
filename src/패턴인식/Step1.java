package �����ν�;

import java.util.Scanner;

public class Step1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int �ʺ� = 4;
		int [] �迭 = { 0, 1, 2, 3,
					4, 5, 6, 9,
					8, 9, 10, 11
		};
		int index = 0;
		for(int i = 0;i<3;i++) {
			for(int b = 0; b<4; b++){
			System.out.printf("%d\t",�迭[index]);
			index++;
		}
			System.out.printf("\n");
		}
		int row = 1;
		int col = 3;
		int �������ε��� = row * �ʺ� +col;
		
		System.out.println("\n\n1��3�� = " +�迭[�������ε���]);
	}

}
