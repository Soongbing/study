package ����������;

import java.io.IOException;
import java.util.Scanner;

public class L201 {
	static String[]���������� = {"����","����","��"};
	final static int ���� = 1;
	final static int ���� = 2;
	final static int �� = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������ּ���.. ����(1)/����(2)/��(3) :");
		Scanner sc = new Scanner(System.in);
		int �÷��̾� = sc.nextInt();
		int �ļ��� = (int)(Math.random()*3) + 1;
		int �÷��̾�� = 0;
		int ��ǻ�ͽ� = 0;
		
		while(true) {
		try {	
		if(�÷��̾�==�ļ���) {
			System.out.println("�����ϴ�.");
		}else if(�÷��̾�==����) {
			if(�ļ���==����) {
				VS(false);
				��ǻ�ͽ�++;
			}else if(�ļ���==��) {
				VS(true);
				�÷��̾��++;
			}
		}else if(�÷��̾�==����) {
			if(�ļ���==����) {
				VS(true);
				�÷��̾��++;
			}
			else if(�ļ���==��) {
				VS(false);
				��ǻ�ͽ�++;
			}
		}else if(�÷��̾�==��) {
			if(�ļ���==����) {
				VS(false);
				��ǻ�ͽ�++;
			}
			else if(�ļ���==����) {
				VS(true);
				�÷��̾��++;
			}
		}
			}catch(Exception e) {
				System.out.println("�߸��Է��߽��ϴ�.");
			}
		}
	}
		static void VS(boolean v) {
			if(v) System.out.println("%d�̰���ϴ�.\n");
			else System.out.println("�����ϴ�.");
			
		}
	}

