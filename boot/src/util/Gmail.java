package util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class Gmail extends Authenticator{ //구글계정

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication("아이디","비밀번호"); //인증 메일을 보낼 관리자의 아이디.
	}
	
}
