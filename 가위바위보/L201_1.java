package ����������;

import java.util.Scanner;

public class L201_1 {
	final static int ���� = 1;
	final static int ���� = 2;
	final static int �� = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] ���� = {"����","����","��"};
		Scanner sc = new Scanner(System.in);
		
		int Round = 1;
		int ����� = 0;
		int ��ǻ�ͽ� = 0;
	
		while(true){
			System.out.println("***** Round "+Round+" *****");
			System.out.println("�������ּ���.. ����(1)/����(2)/��(3)");
			try {
				int ��� = sc.nextInt();
				int ��ǻ�� = (int)(Math.random()*3) + 1;
			
			if(���>=4) {
				System.out.println("�߸��Է��Ͽ����ϴ�.");
			}
		if(���==����) {
			if(��ǻ��==����){
				System.out.println("��� :["+����[0]+"] : ["+����[0]+"] ��ǻ��");
				System.out.println("=====> �����ϴ�.");
				Round++;
		}else if(��ǻ��==����){
			System.out.println("��� :["+����[0]+"] : ["+����[1]+"] ��ǻ��");
				��ǻ�ͽ�++;
				System.out.println("=====> �����ϴ�.");
				Round++;
		}else if(��ǻ��==��){
			System.out.println("��� :["+����[0]+"] : ["+����[2]+"] ��ǻ��");
				�����++;
				System.out.println("=====> ��� �¸� ("+�����+" : "+��ǻ�ͽ�+")");
				Round++;
				}
		}else if(���==����) {
			if(��ǻ��==����) {
				System.out.println("��� :["+����[1]+"] : ["+����[0]+"] ��ǻ��");
				�����++;
				System.out.println("=====> ��� �¸� ("+�����+" : "+��ǻ�ͽ�+")");
				Round++;
			}else if(��ǻ��==����) {
				System.out.println("��� :["+����[1]+"] : ["+����[1]+"] ��ǻ��");
				System.out.println("=====> �����ϴ�.");
				Round++;
			}else if(��ǻ��==��) {
				System.out.println("��� :["+����[1]+"] : ["+����[2]+"] ��ǻ��");
				��ǻ�ͽ�++;
				System.out.println("=====> �����ϴ�.");
				Round++;
				
			}
		}else if(���==��) {
			if(��ǻ��==����) {
				System.out.println("��� :["+����[2]+"] : ["+����[0]+"] ��ǻ��");
				��ǻ�ͽ�++;
				System.out.println("=====> �����ϴ�.");
				Round++;
			}else if(��ǻ��==����) {
				System.out.println("��� :["+����[2]+"] : ["+����[1]+"] ��ǻ��");
				�����++;
				System.out.println("=====> ��� �¸� ("+�����+" : "+��ǻ�ͽ�+")");
				Round++;
			}else if(��ǻ��==��) {
				System.out.println("��� :["+����[2]+"] : ["+����[2]+"] ��ǻ��");
				System.out.println("=====> �����ϴ�.");
				Round++;
			}
			}
		}	
			catch(Exception e){
			System.out.println(" �߸��Է��ϼ˽��ϴ�.");
			continue;
		}	
			if(�����>=3||��ǻ�ͽ�>=3||Round>=6) {
			System.out.println("������ �������ϴ�");
			if(�����>��ǻ�ͽ�) {
			System.out.println("���("+�����+" : "+��ǻ�ͽ�+")��ǻ��");
			System.out.println("=====> ��� ��");
			}else if(��ǻ�ͽ�>�����) {
				System.out.println("���("+�����+" : "+��ǻ�ͽ�+")��ǻ��");
				System.out.println("=====> ��ǻ�� ��");
			}else if(��ǻ�ͽ�==�����) {
				System.out.println("���("+�����+" : "+��ǻ�ͽ�+")��ǻ��");
				System.out.println("=====> ���º�");
			}
			break;
		}
	}
		sc.close();
	}
}
