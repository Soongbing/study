package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.DatabaseUtil;

public class UserDAO {
	
	public int login(String userID, String userPassword) { //로그인 시도
		String SQL = "SELECT userPassword FROM USER WHERE userID = ?";
		Connection conn = null; 
		PreparedStatement pstmt = null; //이걸 사용해서 특정한 SQL문장을 성공적으로 수행할 수 있도록 만듬
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection(); //유틸에 db유틸클래스가 db에 연결된 객체를 여기에 반환해줌
													//연결된 객체는 conn 객체에 에 담기게 됨
			pstmt = conn.prepareStatement(SQL); // SQL문장을 실행할 수 있는 형태로 준비해줌
			pstmt.setString(1, userID); //사용자로부터 입력된 값을 ID값을 위에 첫번째?에 넘겨주는 것
			rs = pstmt.executeQuery(); //SQL문장을 데이터베이스에 실행한 결과를 rs에 담아줌
			if(rs.next()) { //SQL문장을 실행한 결과가 존재하는 경우에 한해서
				if(rs.getString(1).equals(userPassword)) { //사용자의 비밀번호와 사용자가 입력한 비밀번호가 일치하는 ㄱ경우 1반환
					return 1; //로그인 성공
				}
				else {
					return 0; //비밀번호 틀림 //아이디는 존재하나 비밀번호가 틀림
				}
			}
			return -1; //아이디 없음
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //conn 한번 사용 후자원을 해제해줌 꼭해줘야함 끝나면 (서버에 무리가 가지않게 하기위함)
			try{
				if(conn != null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}try{
				if(pstmt != null) pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}try{
				if(rs != null) rs.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return -2; //데이터베이스 오류
	}
	public int join(UserDTO user) { //사용자 정보받아서 회원가입 수행
		String SQL = "INSERT INTO USER VALUES(?, ?, ?, ?, false)"; //아이디, 비밀번호, 이메일, 이메일인증값 해쉬, 인증확인유무
		Connection conn = null; 
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection(); 
			pstmt = conn.prepareStatement(SQL); 
			pstmt.setString(1, user.getUserID()); //첫번째 ?
			pstmt.setString(2, user.getUserPassword()); //두번째 ?
			pstmt.setString(3, user.getUserEmail()); //세번째 ?
			pstmt.setString(4, user.getUserEmailHash()); //네번째 ?
			return pstmt.executeUpdate(); //실제로 영향을 받은 데이터 개수를 반환함. 성공적 로그인이 됐다면 유저 한명 1개를 반환함
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //conn 한번 사용 후자원을 해제해줌 꼭해줘야함 끝나면 (서버에 무리가 가지않게 하기위함)
			try{
				if(conn != null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}try{
				if(pstmt != null) pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}try{
				if(rs != null) rs.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return -1; //데이터베이스 오류 //첫번째 ?인 아이디에 프라이머리키가 들어가있기에 중복일시 -1반환되겠죠
	}
	
	public String getUserEamil(String userID) { //사용자 아이디값을 받아서 사용자의 이메일주소 반환해줌
		String SQL = "SELECT userEamil FROM USER WHERE userID = ?";
		Connection conn = null; 
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection(); 
			pstmt = conn.prepareStatement(SQL); 
			pstmt.setString(1, userID); //첫번째 ?
			rs = pstmt.executeQuery(); //ResultSet에 결과를 담기
			if(rs.next()) { //결과가 존재할 경우
				return rs.getString(1); //
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //conn 한번 사용 후자원을 해제해줌 꼭해줘야함 끝나면 (서버에 무리가 가지않게 하기위함)
			try{
				if(conn != null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}try{
				if(pstmt != null) pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}try{
				if(rs != null) rs.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return null; //데이터베이스 오류
	}
	
	public boolean getUserEmailChecked(String userID) { //현재 이메일 인증이 되었는지 확인
		String SQL = "SELECT UserEamilChecked FROM USER WHERE userID = ?";
		Connection conn = null; 
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection(); 
			pstmt = conn.prepareStatement(SQL); 
			pstmt.setString(1, userID); //첫번째 ?
			rs = pstmt.executeQuery(); //ResultSet에 결과를 담기
			if(rs.next()) { //결과가 존재할 경우
				return rs.getBoolean(1); //
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //conn 한번 사용 후자원을 해제해줌 꼭해줘야함 끝나면 (서버에 무리가 가지않게 하기위함)
			try{
				if(conn != null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}try{
				if(pstmt != null) pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}try{
				if(rs != null) rs.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return false; //데이터베이스 오류
	}
	public boolean setUserEmailChecked(String userID) { //이메일 인증 수행
		String SQL = "UPDATE USER SET UserEamilChecked = true";
		Connection conn = null; 
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection(); 
			pstmt = conn.prepareStatement(SQL); 
			pstmt.setString(1, userID); //첫번째 ?
			pstmt.executeUpdate(); 
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //conn 한번 사용 후자원을 해제해줌 꼭해줘야함 끝나면 (서버에 무리가 가지않게 하기위함)
			try{
				if(conn != null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}try{
				if(pstmt != null) pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}try{
				if(rs != null) rs.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return false; //데이터베이스 오류
	}
}

