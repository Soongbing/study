package ����������;

public class L105 {
	static boolean is�ڼ�(long i) {
	for(int a=2;a<i;a++) {
		if(i%a == 0) return false;
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long ���۽ð� = System.currentTimeMillis();
		
		if( is�ڼ�(2200000009L) ) {
             System.out.println("2200000009�� �ڼ��Դϴ�.");
          } else {
             System.out.println("2200000009�� �ڼ��� �ƴմϴ�.");
          }
		long �����½ð� = System.currentTimeMillis();
		
		System.out.println((�����½ð�-���۽ð�)/1000.0+"==>�ɸ��ð�(��)");
	}

}
