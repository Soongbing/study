package 기초;

public class 연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//산술연산자 복합대입연산자 관계연산자
		int x = 10;
		System.out.println("x = " +(x != 10)); //x 와 10이 같지않으면 참
		System.out.println("x = " +(x == 10)); //같음
		System.out.println("x = " +(x *= 10)); // 곱함
		x = 10;
		System.out.println("x = " +(x /= 10)); // 나누기
		System.out.println("x = " +(x %= 10)); //나머지

		
		
	}

}
