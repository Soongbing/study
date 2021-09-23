package 알고리즘;


	
public class dd {
	  public static String[] solution(String[] strings, int n) {
	      int min = 10000;
	      String [] a = new String[strings.length];
	      for(int i=0;i<strings.length;i++){
	         if(strings[i].charAt(n)<min){
	             min = (int)strings[i].charAt(n);
	             a[i] = strings[i];
	         }
	      }     
	      return a;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] a = {"abc","cfg","hij"};
		int n = 1;
		System.out.println(solution(a,n));
	}
}