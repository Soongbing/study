package ����������;

import java.util.Scanner;

public class L101 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("��������������");
		System.out.println("����=1,����=2,��=3");
	       // ScannerŬ������ ����Ͽ� �Է¹��� ��
		
		 int �ļ��� = (int)(Math.random()*3) + 1;
		 int ������� =sc.nextInt();
		 int �Ľ� = 0;
		 int ����� = 0;
		while(�����>=3||�Ľ�>=3) {
	      if(�������>=4) {
	    	  System.out.println("1~3������ ������ �ϳ��� ���ּ���");
	      }else if(�������-�ļ���==1||�ļ���-�������==2){
	    	  System.out.println("�̰���ϴ�. ��ǻ��:"+�ļ���+" ��:"+�������);
	    	  �����++;
	    	  System.out.println("��� �¸� ("+�����+�Ľ�+")");
	      }else if(�������-�ļ���==2||�������-�ļ���==-1){
	    	  System.out.println("�����ϴ�. ��ǻ��:"+�ļ���+" ��:"+�������);
	    	  �Ľ�++;
	    	  System.out.println("�� �¸� ("+�����+�Ľ�+")");
	      }else {
	    	  System.out.println("�����ϴ�. ��ǻ��:"+�ļ���+" ��:"+�������);
	    	  continue;
	      }
	     
	}
	}
 }


			  


	


