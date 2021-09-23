package 가위바위보;

public class L105 {
	static boolean is솟수(long i) {
	for(int a=2;a<i;a++) {
		if(i%a == 0) return false;
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long 시작시간 = System.currentTimeMillis();
		
		if( is솟수(2200000009L) ) {
             System.out.println("2200000009은 솟수입니다.");
          } else {
             System.out.println("2200000009은 솟수가 아닙니다.");
          }
		long 끝나는시간 = System.currentTimeMillis();
		
		System.out.println((끝나는시간-시작시간)/1000.0+"==>걸린시간(초)");
	}

}
