package 기초;

public class 증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println("x = " +(x++)); //일단 x를 출력한뒤 1을 더하는 식
		System.out.println("x = " + x);             //그래서 x는 여기서 11이 되어서 나옴
		System.out.println("x = " +(x--)); //마찬가지로 x를 출력한 뒤 1을 빼는 식
		System.out.println("x = " + x);   // 그래서 x 는 여기서 10이 되어서 나옴
		System.out.println("x = " +(++x));
		System.out.println("x = " +(--x));
	}

}
