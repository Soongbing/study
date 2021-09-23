package 패턴;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

class 도화지 extends JPanel {
    BufferedImage 원본이미지 = null;
    BufferedImage 수정된이미지 = null;
    BufferedImage 담는곳 = null;
    
    public 도화지() {
        try{
           원본이미지 = ImageIO.read(new File("이미지.jpg")); 
            setPreferredSize(new Dimension(원본이미지.getWidth(), 원본이미지.getHeight()));
            담는곳 = 원본이미지;
            수정된이미지 = new BufferedImage(원본이미지.getWidth(), 원본이미지.getHeight(),BufferedImage.TYPE_4BYTE_ABGR);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, "문제발생 : " + e);
        }
    }

	public void paintComponent(Graphics g) {
		if(담는곳 != null) {
			g.drawImage(담는곳, 0, 0, this);
		} else {
			g.drawString("image is null", 0, 20);
		}
	}
}
class 히스토그램 extends JPanel{
	BufferedImage 히스토그램 = new BufferedImage(256, 300, BufferedImage.TYPE_4BYTE_ABGR);
	int [] 배경;
	JLabel 붙일곳 = new JLabel();
	public 히스토그램() {
		배경 = new int[300*256];
		for(int ndx=0 ; ndx<300*256 ; ndx++) {
			int Red = 0;
			int Green = 100;
			int Blue = 0;
			배경[ndx] = 0xff000000|Red<<16|Green<<8|Blue;
	}
		히스토그램.setRGB(0, 0, 256, 300, 배경, 0, 256);
		붙일곳.setIcon(new ImageIcon(히스토그램));
		add(붙일곳);
}

	public void 히스토그래프(도화지 canvas) {
		히스토그램.setRGB(0, 0, 256, 300, 배경, 0, 256);
		int [] his = new int[256];
		int[] 그레이이미지 = new int[canvas.담는곳.getWidth() * canvas.담는곳.getHeight()];
		
		for(int y=0;y<canvas.담는곳.getHeight();y++) {
			for(int x=0;x<canvas.담는곳.getWidth();x++) {
				int RGB = canvas.담는곳.getRGB(x,y);
				int R = (int)((RGB&0x00ff0000)>>>16);
				int G = (int)((RGB&0x0000ff00)>>8);
				int B = (int)((RGB&0x000000ff));
				int sumRGB = (R+G+B)/3;
				int 그레이 = 0xff000000 | sumRGB<<16 | sumRGB<<8 | sumRGB;
				그레이이미지[canvas.담는곳.getWidth()*y+x] = 그레이;
				his[sumRGB]++;
			}
		}
			for(int i=0;i<256;i++) {
				his[i]/=50;
			}
			for (int x = 0; x < 256; x++) {
				for (int yy = 0; yy < his[x]; yy++) {
					if (yy < 300) {
						히스토그램.setRGB(x, 299 - yy, 0xFFFF0000); // 높이가 300이므로 (0~299), 거꾸로 찍어주기 위해
					}
				}
			}
			for (int a = 0; a < 256; a++) {
				System.out.printf("히스토그램 %d %d \n", a, his[a]);
			} 
			repaint();

		}
	public void 히스토그램정규화(도화지 canvas) {
		int [] his = new int[256];
		int[] 그레이이미지 = new int[canvas.담는곳.getWidth() * canvas.담는곳.getHeight()];
		
		for(int y=0;y<canvas.담는곳.getHeight();y++) {
			for(int x=0;x<canvas.담는곳.getWidth();x++) {
				int RGB = canvas.담는곳.getRGB(x,y);
				int R = (int)((RGB&0x00ff0000)>>>16);
				int G = (int)((RGB&0x0000ff00)>>8);
				int B = (int)((RGB&0x000000ff));
				int sumRGB = (R+G+B)/3;
		
				그레이이미지[canvas.담는곳.getWidth()*y+x] = sumRGB;
				his[sumRGB]++;
			}
		}
		
			int [] 누적합  = new int[256];
			누적합 [0] = his[0];
			
			for(int i=1;i<256;i++) {
				누적합[i] = 누적합[i-1]+his[i];
			}
			int [] 정규화누적값 = new int[256];
			for(int i=0;i<=255;i++) {
				정규화누적값[i] =(int) (누적합[i]*255/(canvas.담는곳.getWidth()*canvas.담는곳.getHeight()));
			}
			for(int i =0; i<canvas.담는곳.getWidth()*canvas.담는곳.getHeight();i++) {
			int theV = 그레이이미지[i];
			그레이이미지[i] = 정규화누적값[theV];
				}
			for(int i = 0 ; i < canvas.담는곳.getWidth()*canvas.담는곳.getHeight(); i++) {
				int sumRGB = 그레이이미지[i];
				int newColor = 0xff000000 | sumRGB << 16 | sumRGB << 8 | sumRGB;
				그레이이미지[i] = newColor;
			}
			
		canvas.수정된이미지.setRGB(0, 0, canvas.원본이미지.getWidth(), canvas.원본이미지.getHeight(), 그레이이미지, 0, canvas.원본이미지.getWidth());
		canvas.담는곳 = canvas.수정된이미지;
		canvas.repaint();
			
		}
		
	}

class 기능{
	public void 밝기감소(도화지 canvas) {
		int 그레이이미지[] = new int [canvas.담는곳.getWidth()*canvas.담는곳.getHeight()];
		for(int y=0;y<canvas.담는곳.getHeight();y++) {
			for(int x=0;x<canvas.담는곳.getWidth();x++) {
				int RGB = canvas.담는곳.getRGB(x,y);
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
				int 밝기 = 0xff000000 | R <<16 | G <<8 | B;
				그레이이미지[canvas.담는곳.getWidth()*y+x] = 밝기;
			}
		}
		canvas.수정된이미지.setRGB(0, 0, canvas.원본이미지.getWidth(), canvas.원본이미지.getHeight(), 그레이이미지, 0, canvas.원본이미지.getWidth());
		canvas.담는곳 = canvas.수정된이미지;
		canvas.repaint();
	}
	public void 밝기상승(도화지 canvas) {
		int 그레이이미지[] = new int [canvas.담는곳.getWidth()*canvas.담는곳.getHeight()];
		for(int y=0;y<canvas.담는곳.getHeight();y++) {
			for(int x=0;x<canvas.담는곳.getWidth();x++) {
				int RGB = canvas.담는곳.getRGB(x,y);
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
				int 밝기 = 0xff000000 | R <<16 | G <<8 | B;
				그레이이미지[canvas.담는곳.getWidth()*y+x] = 밝기;
			}
		}
		canvas.수정된이미지.setRGB(0, 0, canvas.원본이미지.getWidth(), canvas.원본이미지.getHeight(), 그레이이미지, 0, canvas.원본이미지.getWidth());
		canvas.담는곳 = canvas.수정된이미지;
		canvas.repaint();
	}

	
	public void 그레이화(도화지 canvas){
		int 그레이이미지[] = new int [canvas.담는곳.getWidth()*canvas.담는곳.getHeight()];
		for(int y=0;y<canvas.담는곳.getHeight();y++) {
			for(int x=0;x<canvas.담는곳.getWidth();x++) {
				int RGB = canvas.담는곳.getRGB(x,y);
				int R = (int)((RGB&0x00ff0000)>>>16);
				int G = (int)((RGB&0x0000ff00)>>8);
				int B = (int)((RGB&0x000000ff));
				int sumRGB = (R+G+B)/3;
				int 그레이 = 0xff000000 | sumRGB<<16 | sumRGB<<8 | sumRGB;
				그레이이미지[canvas.담는곳.getWidth()*y+x] = 그레이;
			}
		}
		canvas.수정된이미지.setRGB(0, 0, canvas.원본이미지.getWidth(), canvas.원본이미지.getHeight(), 그레이이미지, 0, canvas.원본이미지.getWidth());
		canvas.담는곳 = canvas.수정된이미지;
		canvas.repaint();
	}
}
public class 그레이화 extends JFrame implements ActionListener{
	Button GrayBtn = new Button("그레이화버튼");
	Button PlusBtn = new Button("밝아지는버튼");
	Button MinusBtn = new Button("어두워지는버튼");
	Button histogramBtn = new Button("히스토그램버튼");
	Button histogramEqualBtn = new Button("히스토그램정규화버튼");
	JPanel 그림판넬 = new JPanel();
	JPanel 버튼판넬 = new JPanel();
	도화지 canvas = new 도화지();
	히스토그램 his = new 히스토그램();
	기능 기능 = new 기능();
	public 그레이화() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("이미지그레이화");
        add(canvas, BorderLayout.CENTER); 
        add(그림판넬, BorderLayout.EAST);
        버튼판넬.setBackground(Color.YELLOW);
        버튼판넬.add(GrayBtn);
        버튼판넬.add(PlusBtn);
        버튼판넬.add(MinusBtn);
        버튼판넬.add(histogramBtn);
        버튼판넬.add(histogramEqualBtn);
        그림판넬.add(his, BorderLayout.CENTER);
        add(버튼판넬, BorderLayout.SOUTH); //
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
			기능.그레이화(canvas);
		}
		if(e.getSource()== PlusBtn) {
			기능.밝기상승(canvas);
		}
		if(e.getSource()== MinusBtn) {
			기능.밝기감소(canvas);
		}
		if(e.getSource()== histogramBtn) {
			his.히스토그래프(canvas);
		}
		if(e.getSource()==histogramEqualBtn) {
			his.히스토그램정규화(canvas);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 그레이화();
	}
}
