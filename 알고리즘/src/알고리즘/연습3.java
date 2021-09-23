package 알고리즘;

public class 연습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "try hello world";
		 char [] b = {};
		 for(int i=0;i<s.length();i++){
	          if(i%2==0||i==0){
	        	  b[i]=s.toUpperCase().charAt(i);
	         // System.out.printf("%s", s.toUpperCase().charAt(i));
	       }else {
	    	   b[i]=s.charAt(i);
	    	  // System.out.printf("%s", s.charAt(i));
	       }
		 }
		 System.out.printf("%s", b);
		
	}

}
/* int[] ar = {};
int[] arr = {5,9,7,10};
int divisor = 5;
for(int i=0;i<=arr.length;i++){
   if(arr[i]%divisor==0) {  	 	
   }
   System.out.println(ar[0]);
}*/