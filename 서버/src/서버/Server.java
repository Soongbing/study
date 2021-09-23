package ����;
import java.io.*;
import java.net.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Server {

	public static void main(String[] args) throws ParseException {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in); // Ű���忡�� ���� scanner ��ü ����
		try {
			listener = new ServerSocket(1019); // ���� ���� ����
			System.out.println("������ ��ٸ��� �ֽ��ϴ�.....");
			socket = listener.accept(); // Ŭ���̾�Ʈ�κ��� ���� ��û ���
			System.out.println("����Ǿ����ϴ�.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				int i=1;
				String inputMessage = in.readLine(); // Ŭ���̾�Ʈ�κ��� �� �� �б�
				if (inputMessage.equalsIgnoreCase("y")) {
					System.out.println("Ŭ���̾�Ʈ���� y�� ������ �����Ͽ���");
					break; // "y"�� ������ ���� ����
				}
				if(i==3) {

					String Time = inputMessage; 
					Calendar cal = Calendar.getInstance();
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
					cal.setTime(formatter.parse(Time));
					
					int dayNum = cal.get(Calendar.DAY_OF_WEEK); // ���� �ش� ��¥�� ������ �ѱۿ��Ϸ� ��ȯ���Ѽ� �����Ѵٴ� �ڵ�
					String day = "";
					switch(dayNum){
				    	case 1:
				    		day = "�Ͽ���";
				    		break ;
				    	case 2:
				    		day = "������";
				    		break ;
				    	case 3:
				    		day = "ȭ����";
				    		break ;
				    	case 4:
				    		day = "������";
				    		break ;
				    	case 5:
				    		day = "�����";
				    		break ;    
				    	case 6:
				    		day = "�ݿ���";
				    		break ;
				    	case 7:
				    		day = "�����";
				    		break ;
					}
					System.out.println("Ŭ���̾�Ʈ: " + inputMessage);
					out.write(day);
					out.flush(); // out�� ��Ʈ�� ���ۿ� �ִ� ��� ���ڿ� ����
				break;
				}
					System.out.println("Ŭ���̾�Ʈ: " + inputMessage);
					out.write(inputMessage + "\n"); // Ű���忡�� ���� ���ڿ� ����
					out.flush(); // out�� ��Ʈ�� ���ۿ� �ִ� ��� ���ڿ� ����
					i++;
				}
				
			
		} catch (IOException e) { System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close(); // scanner �ݱ�
				socket.close(); // ��ſ� ���� �ݱ�
				listener.close(); // ���� ���� �ݱ�
			} catch (IOException e) { System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��߽��ϴ�."); }
		}
	}	
}
