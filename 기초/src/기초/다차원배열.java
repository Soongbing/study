package 기초;

import java.util.Arrays;

public class 다차원배열 {
//배열안에 또다른 배열이 존재함
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arrMul = new int[3][2]; //3행(세로) 2열(가로)
		
		arrMul[0][0] = 10;
		arrMul[0][1] = 100;
		arrMul[1][0] = 20;
		arrMul[1][1] = 200;
		arrMul[2][0] = 30;
		arrMul[2][1] = 300;

		for(int i = 0; i<arrMul[0].length; ++i) {
			System.out.println(arrMul[0].length);
		}
	}

}
