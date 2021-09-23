package 패턴인식;

public class Step2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 255;
		int R = 10;
		int G = 200;
		int B = 31;
		
		int ARGB = A<<24|R<<16|G<<8|B;
		
		int a,r,g,b;
		a = (ARGB & 0xff000000)>>>24;
		r = (ARGB & 0x00ff0000)>>16;
		g = (ARGB & 0x0000ff00)>>8;
		b = (ARGB & 0x000000ff);
		
		System.out.println("a=" +a);
		System.out.println("r=" +r);
		System.out.println("b=" +b);
		System.out.println("g=" +g);
		
	}

}
