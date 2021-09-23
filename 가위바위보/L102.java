package 가위바위보;

public class L102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1,b=8,c=12;
		
		if(a>b&&a>c&&b>c) { //a b c
			System.out.println(a+">"+b+">"+c);
		}else if(a>b&&a>c&&c>b) { //a c b
			System.out.println(a+">"+c+">"+b);
		}else if(b>a&&b>c&&a>c) { //b a c
			System.out.println(b+">"+a+">"+c);
		}else if(b>a&&b>c&&c>a) { //b c a
			System.out.println(b+">"+c+">"+a);
		}else if(c>a&&c>b&&a>b) { //c a b
			System.out.println(c+">"+a+">"+b);
		}else if(c>a&&c>b&&b>a) { //c b a
			System.out.println(c+">"+b+">"+a);
		}
	}

}
