package �����ν�;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.io.*;

public class step222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedImage �̹��� = new BufferedImage(120,120,BufferedImage.TYPE_4BYTE_ABGR);
		Graphics g = �̹���.getGraphics();
		
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, 120, 120);
		
		g.setColor(Color.BLUE);
		g.fillOval(0, 0, 40, 40);
		
		try {
			ImageIO.write(�̹���,"png",new File("�̹���.png"));
		}catch(Exception e) {}
		
	}

}
