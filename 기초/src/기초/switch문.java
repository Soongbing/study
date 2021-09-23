package 기초;

import java.util.Scanner;

public class switch문 {
//비교 대상이 되는 결과 값과 선택사항이 많을 경우 주로 사용
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주십셔: ");
		int score = sc.nextInt();
		
		switch(score) { //스위치(비교할값)
		case 100:
		case 90:
			System.out.println("수");
			break;
		case 80:
			System.out.println("우");
			break;
		case 70:
			System.out.println("미");
			break;
		case 60:
			System.out.println("양");
		    break;
		case 50:
			System.out.println("가");
			break;
			
			default:
				System.out.println("90~50까지만 쓰셈");
				break;
			
		
		}
		
	}

}
