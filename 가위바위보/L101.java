package 가위바위보;

import java.util.Scanner;

public class L101 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보게임");
		System.out.println("가위=1,바위=2,보=3");
	       // Scanner클래스를 사용하여 입력받을 것
		
		 int 컴선택 = (int)(Math.random()*3) + 1;
		 int 사람선택 =sc.nextInt();
		 int 컴승 = 0;
		 int 사람승 = 0;
		while(사람승>=3||컴승>=3) {
	      if(사람선택>=4) {
	    	  System.out.println("1~3까지의 숫자중 하나만 써주세요");
	      }else if(사람선택-컴선택==1||컴선택-사람선택==2){
	    	  System.out.println("이겼습니다. 컴퓨터:"+컴선택+" 나:"+사람선택);
	    	  사람승++;
	    	  System.out.println("사람 승리 ("+사람승+컴승+")");
	      }else if(사람선택-컴선택==2||사람선택-컴선택==-1){
	    	  System.out.println("졌습니다. 컴퓨터:"+컴선택+" 나:"+사람선택);
	    	  컴승++;
	    	  System.out.println("컴 승리 ("+사람승+컴승+")");
	      }else {
	    	  System.out.println("비겼습니다. 컴퓨터:"+컴선택+" 나:"+사람선택);
	    	  continue;
	      }
	     
	}
	}
 }


			  


	


