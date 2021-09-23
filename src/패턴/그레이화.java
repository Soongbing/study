package ����;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

class ��ȭ�� extends JPanel {
    BufferedImage �����̹��� = null;
    BufferedImage �������̹��� = null;
    BufferedImage ��°� = null;
    
    public ��ȭ��() {
        try{
           �����̹��� = ImageIO.read(new File("�̹���.jpg")); 
            setPreferredSize(new Dimension(�����̹���.getWidth(), �����̹���.getHeight()));
            ��°� = �����̹���;
            �������̹��� = new BufferedImage(�����̹���.getWidth(), �����̹���.getHeight(),BufferedImage.TYPE_4BYTE_ABGR);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, "�����߻� : " + e);
        }
    }

	public void paintComponent(Graphics g) {
		if(��°� != null) {
			g.drawImage(��°�, 0, 0, this);
		} else {
			g.drawString("image is null", 0, 20);
		}
	}
}
class ������׷� extends JPanel{
	BufferedImage ������׷� = new BufferedImage(256, 300, BufferedImage.TYPE_4BYTE_ABGR);
	int [] ���;
	JLabel ���ϰ� = new JLabel();
	public ������׷�() {
		��� = new int[300*256];
		for(int ndx=0 ; ndx<300*256 ; ndx++) {
			int Red = 0;
			int Green = 100;
			int Blue = 0;
			���[ndx] = 0xff000000|Red<<16|Green<<8|Blue;
	}
		������׷�.setRGB(0, 0, 256, 300, ���, 0, 256);
		���ϰ�.setIcon(new ImageIcon(������׷�));
		add(���ϰ�);
}

	public void ������׷���(��ȭ�� canvas) {
		������׷�.setRGB(0, 0, 256, 300, ���, 0, 256);
		int [] his = new int[256];
		int[] �׷����̹��� = new int[canvas.��°�.getWidth() * canvas.��°�.getHeight()];
		
		for(int y=0;y<canvas.��°�.getHeight();y++) {
			for(int x=0;x<canvas.��°�.getWidth();x++) {
				int RGB = canvas.��°�.getRGB(x,y);
				int R = (int)((RGB&0x00ff0000)>>>16);
				int G = (int)((RGB&0x0000ff00)>>8);
				int B = (int)((RGB&0x000000ff));
				int sumRGB = (R+G+B)/3;
				int �׷��� = 0xff000000 | sumRGB<<16 | sumRGB<<8 | sumRGB;
				�׷����̹���[canvas.��°�.getWidth()*y+x] = �׷���;
				his[sumRGB]++;
			}
		}
			for(int i=0;i<256;i++) {
				his[i]/=50;
			}
			for (int x = 0; x < 256; x++) {
				for (int yy = 0; yy < his[x]; yy++) {
					if (yy < 300) {
						������׷�.setRGB(x, 299 - yy, 0xFFFF0000); // ���̰� 300�̹Ƿ� (0~299), �Ųٷ� ����ֱ� ����
					}
				}
			}
			for (int a = 0; a < 256; a++) {
				System.out.printf("������׷� %d %d \n", a, his[a]);
			} 
			repaint();

		}
	public void ������׷�����ȭ(��ȭ�� canvas) {
		int [] his = new int[256];
		int[] �׷����̹��� = new int[canvas.��°�.getWidth() * canvas.��°�.getHeight()];
		
		for(int y=0;y<canvas.��°�.getHeight();y++) {
			for(int x=0;x<canvas.��°�.getWidth();x++) {
				int RGB = canvas.��°�.getRGB(x,y);
				int R = (int)((RGB&0x00ff0000)>>>16);
				int G = (int)((RGB&0x0000ff00)>>8);
				int B = (int)((RGB&0x000000ff));
				int sumRGB = (R+G+B)/3;
		
				�׷����̹���[canvas.��°�.getWidth()*y+x] = sumRGB;
				his[sumRGB]++;
			}
		}
		
			int [] ������  = new int[256];
			������ [0] = his[0];
			
			for(int i=1;i<256;i++) {
				������[i] = ������[i-1]+his[i];
			}
			int [] ����ȭ������ = new int[256];
			for(int i=0;i<=255;i++) {
				����ȭ������[i] =(int) (������[i]*255/(canvas.��°�.getWidth()*canvas.��°�.getHeight()));
			}
			for(int i =0; i<canvas.��°�.getWidth()*canvas.��°�.getHeight();i++) {
			int theV = �׷����̹���[i];
			�׷����̹���[i] = ����ȭ������[theV];
				}
			for(int i = 0 ; i < canvas.��°�.getWidth()*canvas.��°�.getHeight(); i++) {
				int sumRGB = �׷����̹���[i];
				int newColor = 0xff000000 | sumRGB << 16 | sumRGB << 8 | sumRGB;
				�׷����̹���[i] = newColor;
			}
			
		canvas.�������̹���.setRGB(0, 0, canvas.�����̹���.getWidth(), canvas.�����̹���.getHeight(), �׷����̹���, 0, canvas.�����̹���.getWidth());
		canvas.��°� = canvas.�������̹���;
		canvas.repaint();
			
		}
		
	}

class ���{
	public void ��Ⱘ��(��ȭ�� canvas) {
		int �׷����̹���[] = new int [canvas.��°�.getWidth()*canvas.��°�.getHeight()];
		for(int y=0;y<canvas.��°�.getHeight();y++) {
			for(int x=0;x<canvas.��°�.getWidth();x++) {
				int RGB = canvas.��°�.getRGB(x,y);
				int R = (int)((RGB&0x00ff0000)>>>16);
				R-=50;
				if(R>255) {
					R=255;
				}
				if(R<0) {
					R=0;
				}
				int G = (int)((RGB&0x0000ff00)>>8);
				G-=50;
				if(G>255) {
					G=255;
				}
				if(G<0) {
					G=0;
				}
				int B = (int)((RGB&0x000000ff));
				B-=50;
				if(B>255) {
					B=255;
				}
				if(B<0) {
					B=0;
				}
				int ��� = 0xff000000 | R <<16 | G <<8 | B;
				�׷����̹���[canvas.��°�.getWidth()*y+x] = ���;
			}
		}
		canvas.�������̹���.setRGB(0, 0, canvas.�����̹���.getWidth(), canvas.�����̹���.getHeight(), �׷����̹���, 0, canvas.�����̹���.getWidth());
		canvas.��°� = canvas.�������̹���;
		canvas.repaint();
	}
	public void �����(��ȭ�� canvas) {
		int �׷����̹���[] = new int [canvas.��°�.getWidth()*canvas.��°�.getHeight()];
		for(int y=0;y<canvas.��°�.getHeight();y++) {
			for(int x=0;x<canvas.��°�.getWidth();x++) {
				int RGB = canvas.��°�.getRGB(x,y);
				int R = (int)((RGB&0x00ff0000)>>>16);
				R+=50;
				if(R>255) {
					R=255;
				}
				if(R<0) {
					R=0;
				}
				int G = (int)((RGB&0x0000ff00)>>8);
				G+=50;
				if(G>255) {
					G=255;
				}
				if(G<0) {
					G=0;
				}
				int B = (int)((RGB&0x000000ff));
				B+=50;
				if(B>255) {
					B=255;
				}
				if(B<0) {
					B=0;
				}
				int ��� = 0xff000000 | R <<16 | G <<8 | B;
				�׷����̹���[canvas.��°�.getWidth()*y+x] = ���;
			}
		}
		canvas.�������̹���.setRGB(0, 0, canvas.�����̹���.getWidth(), canvas.�����̹���.getHeight(), �׷����̹���, 0, canvas.�����̹���.getWidth());
		canvas.��°� = canvas.�������̹���;
		canvas.repaint();
	}

	
	public void �׷���ȭ(��ȭ�� canvas){
		int �׷����̹���[] = new int [canvas.��°�.getWidth()*canvas.��°�.getHeight()];
		for(int y=0;y<canvas.��°�.getHeight();y++) {
			for(int x=0;x<canvas.��°�.getWidth();x++) {
				int RGB = canvas.��°�.getRGB(x,y);
				int R = (int)((RGB&0x00ff0000)>>>16);
				int G = (int)((RGB&0x0000ff00)>>8);
				int B = (int)((RGB&0x000000ff));
				int sumRGB = (R+G+B)/3;
				int �׷��� = 0xff000000 | sumRGB<<16 | sumRGB<<8 | sumRGB;
				�׷����̹���[canvas.��°�.getWidth()*y+x] = �׷���;
			}
		}
		canvas.�������̹���.setRGB(0, 0, canvas.�����̹���.getWidth(), canvas.�����̹���.getHeight(), �׷����̹���, 0, canvas.�����̹���.getWidth());
		canvas.��°� = canvas.�������̹���;
		canvas.repaint();
	}
}
public class �׷���ȭ extends JFrame implements ActionListener{
	Button GrayBtn = new Button("�׷���ȭ��ư");
	Button PlusBtn = new Button("������¹�ư");
	Button MinusBtn = new Button("��ο����¹�ư");
	Button histogramBtn = new Button("������׷���ư");
	Button histogramEqualBtn = new Button("������׷�����ȭ��ư");
	JPanel �׸��ǳ� = new JPanel();
	JPanel ��ư�ǳ� = new JPanel();
	��ȭ�� canvas = new ��ȭ��();
	������׷� his = new ������׷�();
	��� ��� = new ���();
	public �׷���ȭ() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("�̹����׷���ȭ");
        add(canvas, BorderLayout.CENTER); 
        add(�׸��ǳ�, BorderLayout.EAST);
        ��ư�ǳ�.setBackground(Color.YELLOW);
        ��ư�ǳ�.add(GrayBtn);
        ��ư�ǳ�.add(PlusBtn);
        ��ư�ǳ�.add(MinusBtn);
        ��ư�ǳ�.add(histogramBtn);
        ��ư�ǳ�.add(histogramEqualBtn);
        �׸��ǳ�.add(his, BorderLayout.CENTER);
        add(��ư�ǳ�, BorderLayout.SOUTH); //
        GrayBtn.addActionListener(this);
        PlusBtn.addActionListener(this);
        MinusBtn.addActionListener(this);
        histogramBtn.addActionListener(this);
        histogramEqualBtn.addActionListener(this);
        pack();
        setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == GrayBtn) {
			���.�׷���ȭ(canvas);
		}
		if(e.getSource()== PlusBtn) {
			���.�����(canvas);
		}
		if(e.getSource()== MinusBtn) {
			���.��Ⱘ��(canvas);
		}
		if(e.getSource()== histogramBtn) {
			his.������׷���(canvas);
		}
		if(e.getSource()==histogramEqualBtn) {
			his.������׷�����ȭ(canvas);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new �׷���ȭ();
	}
}
