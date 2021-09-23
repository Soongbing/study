package 가위바위보;

import java.io.IOException;
import java.util.Scanner;

public class L201 {
	static String[]가위바위보 = {"가위","바위","보"};
	final static int 가위 = 1;
	final static int 바위 = 2;
	final static int 보 = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("선택해주세요.. 가위(1)/바위(2)/보(3) :");
		Scanner sc = new Scanner(System.in);
		int 플레이어 = sc.nextInt();
		int 컴선택 = (int)(Math.random()*3) + 1;
		int 플레이어승 = 0;
		int 컴퓨터승 = 0;
		
		while(true) {
		try {	
		if(플레이어==컴선택) {
			System.out.println("비겼습니다.");
		}else if(플레이어==가위) {
			if(컴선택==바위) {
				VS(false);
				컴퓨터승++;
			}else if(컴선택==보) {
				VS(true);
				플레이어승++;
			}
		}else if(플레이어==바위) {
			if(컴선택==가위) {
				VS(true);
				플레이어승++;
			}
			else if(컴선택==보) {
				VS(false);
				컴퓨터승++;
			}
		}else if(플레이어==보) {
			if(컴선택==가위) {
				VS(false);
				컴퓨터승++;
			}
			else if(컴선택==바위) {
				VS(true);
				플레이어승++;
			}
		}
			}catch(Exception e) {
				System.out.println("잘못입력했습니다.");
			}
		}
	}
		static void VS(boolean v) {
			if(v) System.out.println("%d이겼습니다.\n");
			else System.out.println("졌습니다.");
			
		}
	}

