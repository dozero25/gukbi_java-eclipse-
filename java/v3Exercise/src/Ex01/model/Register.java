package Ex01.model;

import java.util.ArrayList;
import java.util.List;

public class Register {
	// 필드 : 아이디, 비밀번호, 회원가입 유뮤, 나이
	
	private String userId;
	private String password;
	private boolean register = false;
	private int point = 0;
	
	// 생성자
	public Register() {} // 메소드 본체가 비어 있으면 디폴트 생성자
	
	public int addPoint() {
		return 0;
	}
	
	public double addPoint(double point) {
		return 0.0;
	}
	
	public boolean addRegister() {
		return false;
	}
}
