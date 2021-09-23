package 패턴인식;
import java.io.*;
import java.util.Scanner;
import java.awt.image.*;
import javax.imageio.ImageIO;
public class step22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] 이미지본체 = new int[40*40];
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int b = sc.nextInt();
		for(int ndx=0; ndx<40*40; ndx++) {
			int 불투명도 = 255;
			int 빨강 = 255;
			int 녹색 = 0;
			int 파랑 = 0;
			
			이미지본체[ndx] = 불투명도<<24|빨강<<16|녹색<<8|파랑;
			
		}
		
		BufferedImage 이미지 = new BufferedImage(40,40,BufferedImage.TYPE_4BYTE_ABGR);
		
		이미지.setRGB(0,0,
				40,40, //이미지 본체 크기(가로,세로)
				이미지본체,
				0, //이미지본체 배열의 몇번 위치에서 뽑아서 저장할지 지정
				40 //가로크기
				);
		try {
			ImageIO.write(이미지,"png",new File("이미지.png"));
		}catch(Exception e) {}
	}

}
