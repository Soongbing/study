package 가위바위보;

import java.util.Scanner;

public class L103 {
	static boolean is윤년(int i) {
		if(i%4==0&&i%100==0||i%400==0) {
			return true;
		}else {
		 return false;
		
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 넣어주세요");
		int a = sc.nextInt();
        if( is윤년( a ) ) {
            System.out.println(a+"년은 윤년입니다.");
         } else {
            System.out.println(a+"년은 윤년이 아닙니다.");
         }		

	}

}
