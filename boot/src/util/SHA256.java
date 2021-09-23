package util;

import java.security.MessageDigest;

public class SHA256 {

	public static  String getSHA256(String input) {//이메일값에 해쉬를 적용한
		StringBuffer result = new StringBuffer();
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256"); //SHA-256 형식으로 암호화를 위한 MessageDigest 클래스
			byte[]salt = "안전하게 보호하기 위한 솔트값" .getBytes();
			digest.reset(); //리셋해주고
			digest.update(salt); //단순히 SHA-256을 적용하면 해킹당할 가능성이 높기에 솔트값을 적용해줌
			byte[] chars = digest.digest(input.getBytes("UTF-8")); //해쉬로 적용한 값을 이 배열에 담아줌
			for(int i=0; i < chars.length; i++) {
				String hex = Integer.toHexString(0xff & chars[i]); //핵스값과 해쉬값을 적용한 chars의 인덱스를 and연산
				if(hex.length()==1) result.append("0"); //1자릿수일 경우 0을 붙여 총2자리값을 가지는 16진수형태로 만들기
				result.append(hex);//헥스값을 뒤에 차근차근 달아서
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result.toString(); //결과적으로 해당 해쉬값을 반환할 수 있도록 만들어주는것이 이 함수의 역할
	}
	
}
