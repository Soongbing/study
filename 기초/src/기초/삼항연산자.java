package 기초;

public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10, y = 20;
		int result = 0;
		
		result = (x>y) ? 100 : 200;  //조건식 ? 식1: 식2 x가 y보다 크면 100이 출력 아니면 200이 출력
		System.out.println("result = " + result);
		result = (x<y) ? 100 : 200;
		System.out.println("result = " + result);
		result = (x==y) ? 100 : 200; //같으면 100 틀리면 200
		System.out.println("result = " + result);
	}

}
