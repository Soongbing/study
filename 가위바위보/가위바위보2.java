package ����������;

import java.util.Scanner;

public class ����������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��������������");
		System.out.println("����=1,����=2,��=3");
	       // ScannerŬ������ ����Ͽ� �Է¹��� ��		
		 String cmd =sc.next();
		 int player = 0;
		 int �ļ��� = (int)(Math.random()*3) + 1;
		  
			switch(cmd) {
			case "����":
				player = 1;
				break;
			case "����":
				player = 2;
				break;
			case "��":
				player = 3;
				break;
			}

		 if(player-�ļ���==0) {
	    	System.out.println("�����ϴ�. ��ǻ��:"+�ļ���+" ��:"+cmd);
	      }else if(player-�ļ���==1||�ļ���-player==2){
	    	  System.out.println("�̰���ϴ�. ��ǻ��:"+�ļ���+" ��:"+cmd);
	      }else if(player-�ļ���==2||player-�ļ���==-1){
	    	  System.out.println("�����ϴ�. ��ǻ��:"+�ļ���+" ��:"+cmd);
	      }else {
	    	System.out.println("�̼����ڰ��ƴ�");
	      }
	}
 }
}
