package 기초;
import java.util.Scanner;
public class if문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("비교할 숫자를 치세욤 : ");
		int num1 = sc.nextInt();
		System.out.println("비교할 두번째 숫자를 치세욤 : ");
		int num2 = sc.nextInt();
		if(num1>num2) {
			System.out.println("처음 수는 두번째 보다 크다 ");
		}else if(num1<num2) {
			System.out.println("처음수는 두번째 수보다 작다");
		}else {
			System.out.println("둘다 같다");
			
			sc.close(); //스캐너쓰면 항상 자원을 회수해줘야함 리소스를 다시
		}
	}

}
