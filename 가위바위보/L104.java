package 가위바위보;

public class L104 {
	static boolean is솟수(long i) {
		for(int a=2; a<i; a++) {
			if(i%a==0) return false;
		}
		return true;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if( is솟수(2200000009L) ) {
             System.out.println("2200000009은 솟수입니다.");
          } else {
             System.out.println("2200000009은 솟수가 아닙니다.");
          }
	
	}


}
