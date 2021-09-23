package 기초;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열은 한번 선언하면 크기가 변경되지 않음
		int [] arr1 = new int[5]; //배열 선언 단계 배열의 크기 선언하고 밑에 초기화
		arr1[0] = 100; //배열초기화
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr1[0] = " + arr1[0]);
		System.out.println("arr1[1] = " + arr1[1]);
		System.out.println("arr1[2] = " + arr1[2]);
		System.out.println("arr1[3] = " + arr1[3]);
		
		int [] arr2 = {10,20,30}; //선언과 초기화를 동시에
		System.out.println("arr2[0] = " + arr2[0]);
		System.out.println("arr2[1] = " + arr2[1]); //인덱스 1
		System.out.println("arr2[2] = " + arr2[2]); //인덱스 2
		
	}

}
