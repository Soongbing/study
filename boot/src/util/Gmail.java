package util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Gmail extends Authenticator{ //���۰���

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication("���̵�","��й�ȣ"); //���� ������ ���� �������� ���̵�.
	}
	
}
