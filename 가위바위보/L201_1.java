package 가위바위보;

import java.util.Scanner;

public class L201_1 {
	final static int 가위 = 1;
	final static int 바위 = 2;
	final static int 보 = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] 갈바 = {"가위","바위","보"};
		Scanner sc = new Scanner(System.in);
		
		int Round = 1;
		int 사람승 = 0;
		int 컴퓨터승 = 0;
	
		while(true){
			System.out.println("***** Round "+Round+" *****");
			System.out.println("선택해주세요.. 가위(1)/바위(2)/보(3)");
			try {
				int 사람 = sc.nextInt();
				int 컴퓨터 = (int)(Math.random()*3) + 1;
			
			if(사람>=4) {
				System.out.println("잘못입력하였습니다.");
			}
		if(사람==가위) {
			if(컴퓨터==가위){
				System.out.println("사람 :["+갈바[0]+"] : ["+갈바[0]+"] 컴퓨터");
				System.out.println("=====> 비겼습니다.");
				Round++;
		}else if(컴퓨터==바위){
			System.out.println("사람 :["+갈바[0]+"] : ["+갈바[1]+"] 컴퓨터");
				컴퓨터승++;
				System.out.println("=====> 졌습니다.");
				Round++;
		}else if(컴퓨터==보){
			System.out.println("사람 :["+갈바[0]+"] : ["+갈바[2]+"] 컴퓨터");
				사람승++;
				System.out.println("=====> 사람 승리 ("+사람승+" : "+컴퓨터승+")");
				Round++;
				}
		}else if(사람==바위) {
			if(컴퓨터==가위) {
				System.out.println("사람 :["+갈바[1]+"] : ["+갈바[0]+"] 컴퓨터");
				사람승++;
				System.out.println("=====> 사람 승리 ("+사람승+" : "+컴퓨터승+")");
				Round++;
			}else if(컴퓨터==바위) {
				System.out.println("사람 :["+갈바[1]+"] : ["+갈바[1]+"] 컴퓨터");
				System.out.println("=====> 비겼습니다.");
				Round++;
			}else if(컴퓨터==보) {
				System.out.println("사람 :["+갈바[1]+"] : ["+갈바[2]+"] 컴퓨터");
				컴퓨터승++;
				System.out.println("=====> 졌습니다.");
				Round++;
				
			}
		}else if(사람==보) {
			if(컴퓨터==가위) {
				System.out.println("사람 :["+갈바[2]+"] : ["+갈바[0]+"] 컴퓨터");
				컴퓨터승++;
				System.out.println("=====> 졌습니다.");
				Round++;
			}else if(컴퓨터==바위) {
				System.out.println("사람 :["+갈바[2]+"] : ["+갈바[1]+"] 컴퓨터");
				사람승++;
				System.out.println("=====> 사람 승리 ("+사람승+" : "+컴퓨터승+")");
				Round++;
			}else if(컴퓨터==보) {
				System.out.println("사람 :["+갈바[2]+"] : ["+갈바[2]+"] 컴퓨터");
				System.out.println("=====> 비겼습니다.");
				Round++;
			}
			}
		}	
			catch(Exception e){
			System.out.println(" 잘못입력하셧습니다.");
			continue;
		}	
			if(사람승>=3||컴퓨터승>=3||Round>=6) {
			System.out.println("게임이 끝났습니다");
			if(사람승>컴퓨터승) {
			System.out.println("사람("+사람승+" : "+컴퓨터승+")컴퓨터");
			System.out.println("=====> 사람 승");
			}else if(컴퓨터승>사람승) {
				System.out.println("사람("+사람승+" : "+컴퓨터승+")컴퓨터");
				System.out.println("=====> 컴퓨터 승");
			}else if(컴퓨터승==사람승) {
				System.out.println("사람("+사람승+" : "+컴퓨터승+")컴퓨터");
				System.out.println("=====> 무승부");
			}
			break;
		}
	}
		sc.close();
	}
}
