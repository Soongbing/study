package ����������;

public class L104 {
	static boolean is�ڼ�(long i) {
		for(int a=2; a<i; a++) {
			if(i%a==0) return false;
		}
		return true;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if( is�ڼ�(2200000009L) ) {
             System.out.println("2200000009�� �ڼ��Դϴ�.");
          } else {
             System.out.println("2200000009�� �ڼ��� �ƴմϴ�.");
          }
	
	}


}
