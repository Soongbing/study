package util;

import java.security.MessageDigest;

public class SHA256 {

	public static  String getSHA256(String input) {//�̸��ϰ��� �ؽ��� ������
		StringBuffer result = new StringBuffer();
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256"); //SHA-256 �������� ��ȣȭ�� ���� MessageDigest Ŭ����
			byte[]salt = "�����ϰ� ��ȣ�ϱ� ���� ��Ʈ��" .getBytes();
			digest.reset(); //�������ְ�
			digest.update(salt); //�ܼ��� SHA-256�� �����ϸ� ��ŷ���� ���ɼ��� ���⿡ ��Ʈ���� ��������
			byte[] chars = digest.digest(input.getBytes("UTF-8")); //�ؽ��� ������ ���� �� �迭�� �����
			for(int i=0; i < chars.length; i++) {
				String hex = Integer.toHexString(0xff & chars[i]); //�ٽ����� �ؽ����� ������ chars�� �ε����� and����
				if(hex.length()==1) result.append("0"); //1�ڸ����� ��� 0�� �ٿ� ��2�ڸ����� ������ 16�������·� �����
				result.append(hex);//������ �ڿ� �������� �޾Ƽ�
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result.toString(); //��������� �ش� �ؽ����� ��ȯ�� �� �ֵ��� ������ִ°��� �� �Լ��� ����
	}
	
}
