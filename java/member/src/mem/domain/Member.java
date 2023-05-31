package mem.domain;

import java.time.LocalDateTime;

public class Member {
	private int memId;
	private String memName;
	private String memPw;
	private LocalDateTime date;
	private String gender;
	private String info;
	
	
	public Member() {}
	
	public Member(int memId, String memName, String memPw, LocalDateTime date, String gender, String info) {
		this.memId = memId;
		this.memName = memName;
		this.memPw = memPw;
		this.date = date;
		this.gender = gender;
		this.info = info;
	}

	public int getMemId() {
		return memId;
	}

	public void setMemId(int memId) {
		this.memId = memId;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	
	
	

}
