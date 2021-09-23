package 서버;
import java.io.*;
import java.net.*;
import java.util.*;
public class Client {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in); // 키보드에서 읽을 scanner 객체 생성
		try {
			socket = new Socket("localhost", 1019); // 클라이언트 소켓 생성. 서버에 연결
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				System.out.print("학번>>");
				String studentID = scanner.nextLine(); // 1
				out.write(studentID + "\n"); // 키보드에서 읽은 문자열 전송
				out.flush(); // out의 스트림 버퍼에 있는 모든 문자열 전송
				String inputMessage1 = in.readLine(); // 서버로부터 한 행 수신
				System.out.print("이름>>");
				String studentName = scanner.nextLine(); // 2
				out.write(studentName + "\n"); // 키보드에서 읽은 문자열 전송
				out.flush(); // out의 스트림 버퍼에 있는 모든 문자열 전송
				String inputMessage2 = in.readLine(); // 서버로부터 한 행 수신
				System.out.print("날짜>>");
				String day = scanner.nextLine(); // 3
				out.write(day + "\n"); // 키보드에서 읽은 문자열 전송
				out.flush(); // out의 스트림 버퍼에 있는 모든 문자열 전송
				String inputMessage3 = in.readLine(); // 서버로부터 한 행 수신
				System.out.print("종료하시겠습니까?(y/n)>>");
				String outputMessage = scanner.nextLine();
				if (outputMessage.equalsIgnoreCase("y")) {
					outputMessage=("["+inputMessage1+"]"+"["+inputMessage2+"]"+inputMessage3);
					out.write(outputMessage+"\n");
					out.flush();
					break; // 사용자가 "bye"를 입력한 경우 서버로 전송 후 실행 종료
				}
				System.out.println("서버: " + "["+inputMessage1+"]"+"["+inputMessage2+"]"+inputMessage3);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if(socket != null) socket.close(); // 클라이언트 소켓 닫기
			} catch (IOException e) {
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}