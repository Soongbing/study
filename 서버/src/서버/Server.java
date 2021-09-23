package 서버;
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
		Scanner scanner = new Scanner(System.in); // 키보드에서 읽을 scanner 객체 생성
		try {
			listener = new ServerSocket(1019); // 서버 소켓 생성
			System.out.println("연결을 기다리고 있습니다.....");
			socket = listener.accept(); // 클라이언트로부터 연결 요청 대기
			System.out.println("연결되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				int i=1;
				String inputMessage = in.readLine(); // 클라이언트로부터 한 행 읽기
				if (inputMessage.equalsIgnoreCase("y")) {
					System.out.println("클라이언트에서 y로 연결을 종료하였음");
					break; // "y"를 받으면 연결 종료
				}
				if(i==3) {

					String Time = inputMessage; 
					Calendar cal = Calendar.getInstance();
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
					cal.setTime(formatter.parse(Time));
					
					int dayNum = cal.get(Calendar.DAY_OF_WEEK); // 대충 해당 날짜의 요일을 한글요일로 변환시켜서 저장한다는 코드
					String day = "";
					switch(dayNum){
				    	case 1:
				    		day = "일요일";
				    		break ;
				    	case 2:
				    		day = "월요일";
				    		break ;
				    	case 3:
				    		day = "화요일";
				    		break ;
				    	case 4:
				    		day = "수요일";
				    		break ;
				    	case 5:
				    		day = "목요일";
				    		break ;    
				    	case 6:
				    		day = "금요일";
				    		break ;
				    	case 7:
				    		day = "토요일";
				    		break ;
					}
					System.out.println("클라이언트: " + inputMessage);
					out.write(day);
					out.flush(); // out의 스트림 버퍼에 있는 모든 문자열 전송
				break;
				}
					System.out.println("클라이언트: " + inputMessage);
					out.write(inputMessage + "\n"); // 키보드에서 읽은 문자열 전송
					out.flush(); // out의 스트림 버퍼에 있는 모든 문자열 전송
					i++;
				}
				
			
		} catch (IOException e) { System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close(); // scanner 닫기
				socket.close(); // 통신용 소켓 닫기
				listener.close(); // 서버 소켓 닫기
			} catch (IOException e) { System.out.println("클라이언트와 채팅 중 오류가 발생했습니다."); }
		}
	}	
}
