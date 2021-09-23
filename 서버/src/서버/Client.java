package ����;
import java.io.*;
import java.net.*;
import java.util.*;
public class Client {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in); // Ű���忡�� ���� scanner ��ü ����
		try {
			socket = new Socket("localhost", 1019); // Ŭ���̾�Ʈ ���� ����. ������ ����
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				System.out.print("�й�>>");
				String studentID = scanner.nextLine(); // 1
				out.write(studentID + "\n"); // Ű���忡�� ���� ���ڿ� ����
				out.flush(); // out�� ��Ʈ�� ���ۿ� �ִ� ��� ���ڿ� ����
				String inputMessage1 = in.readLine(); // �����κ��� �� �� ����
				System.out.print("�̸�>>");
				String studentName = scanner.nextLine(); // 2
				out.write(studentName + "\n"); // Ű���忡�� ���� ���ڿ� ����
				out.flush(); // out�� ��Ʈ�� ���ۿ� �ִ� ��� ���ڿ� ����
				String inputMessage2 = in.readLine(); // �����κ��� �� �� ����
				System.out.print("��¥>>");
				String day = scanner.nextLine(); // 3
				out.write(day + "\n"); // Ű���忡�� ���� ���ڿ� ����
				out.flush(); // out�� ��Ʈ�� ���ۿ� �ִ� ��� ���ڿ� ����
				String inputMessage3 = in.readLine(); // �����κ��� �� �� ����
				System.out.print("�����Ͻðڽ��ϱ�?(y/n)>>");
				String outputMessage = scanner.nextLine();
				if (outputMessage.equalsIgnoreCase("y")) {
					outputMessage=("["+inputMessage1+"]"+"["+inputMessage2+"]"+inputMessage3);
					out.write(outputMessage+"\n");
					out.flush();
					break; // ����ڰ� "bye"�� �Է��� ��� ������ ���� �� ���� ����
				}
				System.out.println("����: " + "["+inputMessage1+"]"+"["+inputMessage2+"]"+inputMessage3);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if(socket != null) socket.close(); // Ŭ���̾�Ʈ ���� �ݱ�
			} catch (IOException e) {
				System.out.println("������ ä�� �� ������ �߻��߽��ϴ�.");
			}
		}
	}
}