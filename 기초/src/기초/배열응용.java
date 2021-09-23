package 기초;
import java.util.Arrays;
import java.util.Scanner;
public class 배열응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]name = {"김일호","김이호","김삼호","김사호","김오호"};
		String[]name2 = null;
		String[]name3 = null;
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s의 점수를 입력하시오", name[0]);
		score[0] = sc.nextInt();
		System.out.printf("%s의 점수를 입력하시오", name[1]);
		score[1] = sc.nextInt();
		System.out.printf("%s의 점수를 입력하시오", name[2]);
		score[2] = sc.nextInt();
		System.out.printf("%s의 점수를 입력하시오", name[3]);
		score[3] = sc.nextInt();
		System.out.printf("%s의 점수를 입력하시오", name[4]);
		score[4] = sc.nextInt();
		
		sc.close();
		
		System.out.println("name의 배열 길이" + name.length); //배열 길이
		
		System.out.println("name안에 있는 데이터 : " + Arrays.toString(name)); //배열 요소 출력

		name3 = Arrays.copyOf(name, name.length); //(배열, 배열의크기);
		System.out.println("name3에 배열1을 복사" + Arrays.toString(name3)); //주소가 같은게 아님 주소는 다르고 갖고있는 메모리가 같은것
		
		name2 = name; //주소가 같다 배열 레퍼런스(참조)
		System.out.println("name : " + name);
		System.out.println("name2 " + name2);
		System.out.println("name3 " + name3);
	}

}
