package �����ν�;
import java.io.*;
import java.util.Scanner;
import java.awt.image.*;
import javax.imageio.ImageIO;
public class step22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] �̹�����ü = new int[40*40];
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int b = sc.nextInt();
		for(int ndx=0; ndx<40*40; ndx++) {
			int ������ = 255;
			int ���� = 255;
			int ��� = 0;
			int �Ķ� = 0;
			
			�̹�����ü[ndx] = ������<<24|����<<16|���<<8|�Ķ�;
			
		}
		
		BufferedImage �̹��� = new BufferedImage(40,40,BufferedImage.TYPE_4BYTE_ABGR);
		
		�̹���.setRGB(0,0,
				40,40, //�̹��� ��ü ũ��(����,����)
				�̹�����ü,
				0, //�̹�����ü �迭�� ��� ��ġ���� �̾Ƽ� �������� ����
				40 //����ũ��
				);
		try {
			ImageIO.write(�̹���,"png",new File("�̹���.png"));
		}catch(Exception e) {}
	}

}
