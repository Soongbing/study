package �����ν�;
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
		int [] �̹�����ü = new int[w*h];
		int ������ = 255;
		for(int ndx=0; ndx<480*360; ndx++) {
			
			int ���� = sc.nextInt();
			int ��� = sc.nextInt();
			int �Ķ� = sc.nextInt();
			
			�̹�����ü[ndx] = ������<<24|����<<16|���<<8|�Ķ�;
			
		}
		
		BufferedImage �̹��� = new BufferedImage(w,h,BufferedImage.TYPE_4BYTE_ABGR);
		
		�̹���.setRGB(0,0,
				w,h, //�̹��� ��ü ũ��(����,����)
				�̹�����ü,
				0, //�̹�����ü �迭�� ��� ��ġ���� �̾Ƽ� �������� ����
				w //����ũ��
				);
		try {
			ImageIO.write(�̹���,"png",new File("�̹���.png"));
		}catch(Exception e) {}
	}



		
	}
