package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.DatabaseUtil;

public class UserDAO {
	
	public int login(String userID, String userPassword) { //�α��� �õ�
		String SQL = "SELECT userPassword FROM USER WHERE userID = ?";
		Connection conn = null; 
		PreparedStatement pstmt = null; //�̰� ����ؼ� Ư���� SQL������ ���������� ������ �� �ֵ��� ����
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection(); //��ƿ�� db��ƿŬ������ db�� ����� ��ü�� ���⿡ ��ȯ����
													//����� ��ü�� conn ��ü�� �� ���� ��
			pstmt = conn.prepareStatement(SQL); // SQL������ ������ �� �ִ� ���·� �غ�����
			pstmt.setString(1, userID); //����ڷκ��� �Էµ� ���� ID���� ���� ù��°?�� �Ѱ��ִ� ��
			rs = pstmt.executeQuery(); //SQL������ �����ͺ��̽��� ������ ����� rs�� �����
			if(rs.next()) { //SQL������ ������ ����� �����ϴ� ��쿡 ���ؼ�
				if(rs.getString(1).equals(userPassword)) { //������� ��й�ȣ�� ����ڰ� �Է��� ��й�ȣ�� ��ġ�ϴ� ����� 1��ȯ
					return 1; //�α��� ����
				}
				else {
					return 0; //��й�ȣ Ʋ�� //���̵�� �����ϳ� ��й�ȣ�� Ʋ��
				}
			}
			return -1; //���̵� ����
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //conn �ѹ� ��� ���ڿ��� �������� ��������� ������ (������ ������ �����ʰ� �ϱ�����)
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
		return -2; //�����ͺ��̽� ����
	}
	public int join(UserDTO user) { //����� �����޾Ƽ� ȸ������ ����
		String SQL = "INSERT INTO USER VALUES(?, ?, ?, ?, false)"; //���̵�, ��й�ȣ, �̸���, �̸��������� �ؽ�, ����Ȯ������
		Connection conn = null; 
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection(); 
			pstmt = conn.prepareStatement(SQL); 
			pstmt.setString(1, user.getUserID()); //ù��° ?
			pstmt.setString(2, user.getUserPassword()); //�ι�° ?
			pstmt.setString(3, user.getUserEmail()); //����° ?
			pstmt.setString(4, user.getUserEmailHash()); //�׹�° ?
			return pstmt.executeUpdate(); //������ ������ ���� ������ ������ ��ȯ��. ������ �α����� �ƴٸ� ���� �Ѹ� 1���� ��ȯ��
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //conn �ѹ� ��� ���ڿ��� �������� ��������� ������ (������ ������ �����ʰ� �ϱ�����)
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
		return -1; //�����ͺ��̽� ���� //ù��° ?�� ���̵� �����̸Ӹ�Ű�� ���ֱ⿡ �ߺ��Ͻ� -1��ȯ�ǰ���
	}
	
	public String getUserEamil(String userID) { //����� ���̵��� �޾Ƽ� ������� �̸����ּ� ��ȯ����
		String SQL = "SELECT userEamil FROM USER WHERE userID = ?";
		Connection conn = null; 
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection(); 
			pstmt = conn.prepareStatement(SQL); 
			pstmt.setString(1, userID); //ù��° ?
			rs = pstmt.executeQuery(); //ResultSet�� ����� ���
			if(rs.next()) { //����� ������ ���
				return rs.getString(1); //
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //conn �ѹ� ��� ���ڿ��� �������� ��������� ������ (������ ������ �����ʰ� �ϱ�����)
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
		return null; //�����ͺ��̽� ����
	}
	
	public boolean getUserEmailChecked(String userID) { //���� �̸��� ������ �Ǿ����� Ȯ��
		String SQL = "SELECT UserEamilChecked FROM USER WHERE userID = ?";
		Connection conn = null; 
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection(); 
			pstmt = conn.prepareStatement(SQL); 
			pstmt.setString(1, userID); //ù��° ?
			rs = pstmt.executeQuery(); //ResultSet�� ����� ���
			if(rs.next()) { //����� ������ ���
				return rs.getBoolean(1); //
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //conn �ѹ� ��� ���ڿ��� �������� ��������� ������ (������ ������ �����ʰ� �ϱ�����)
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
		return false; //�����ͺ��̽� ����
	}
	public boolean setUserEmailChecked(String userID) { //�̸��� ���� ����
		String SQL = "UPDATE USER SET UserEamilChecked = true";
		Connection conn = null; 
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		try {
			conn = DatabaseUtil.getConnection(); 
			pstmt = conn.prepareStatement(SQL); 
			pstmt.setString(1, userID); //ù��° ?
			pstmt.executeUpdate(); 
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //conn �ѹ� ��� ���ڿ��� �������� ��������� ������ (������ ������ �����ʰ� �ϱ�����)
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
		return false; //�����ͺ��̽� ����
	}
}

