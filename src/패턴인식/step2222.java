package 패턴인식;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class step2222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int [] 이미지본체 = new int[w*h];
		int 불투명도 = 255;
		for(int ndx=0; ndx<480*360; ndx++) {
			
			int 빨강 = sc.nextInt();
			int 녹색 = sc.nextInt();
			int 파랑 = sc.nextInt();
			
			이미지본체[ndx] = 불투명도<<24|빨강<<16|녹색<<8|파랑;
			
		}
		
		BufferedImage 이미지 = new BufferedImage(w,h,BufferedImage.TYPE_4BYTE_ABGR);
		
		이미지.setRGB(0,0,
				w,h, //이미지 본체 크기(가로,세로)
				이미지본체,
				0, //이미지본체 배열의 몇번 위치에서 뽑아서 저장할지 지정
				w //가로크기
				);
		try {
			ImageIO.write(이미지,"png",new File("이미지.png"));
		}catch(Exception e) {}
	}



		
	}
