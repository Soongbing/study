package 가위바위보;

import java.util.Scanner;

public class 가위바위보2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보게임");
		System.out.println("가위=1,바위=2,보=3");
	       // Scanner클래스를 사용하여 입력받을 것		
		 String cmd =sc.next();
		 int player = 0;
		 int 컴선택 = (int)(Math.random()*3) + 1;
		  
			switch(cmd) {
			case "가위":
				player = 1;
				break;
			case "바위":
				player = 2;
				break;
			case "보":
				player = 3;
				break;
			}

		 if(player-컴선택==0) {
	    	System.out.println("비겼습니다. 컴퓨터:"+컴선택+" 나:"+cmd);
	      }else if(player-컴선택==1||컴선택-player==2){
	    	  System.out.println("이겼습니다. 컴퓨터:"+컴선택+" 나:"+cmd);
	      }else if(player-컴선택==2||player-컴선택==-1){
	    	  System.out.println("졌습니다. 컴퓨터:"+컴선택+" 나:"+cmd);
	      }else {
	    	System.out.println("이세상문자가아님");
	      }
	}
 }
}
