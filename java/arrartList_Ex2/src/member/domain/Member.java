package member.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Member {
	private int meNum;
	private String meId;
	private String mePw;
	private String meName;
	private LocalDateTime redate = LocalDateTime.now();
	
	public Member() {}

	public int getMeNum() {
		return meNum;
	}

	public void setMeNum(int meNum) {
		this.meNum = meNum;
	}

	public String getMeId() {
		return meId;
	}

	public void setMeId(String meId) {
		this.meId = meId;
	}

	public String getMePw() {
		return mePw;
	}

	public void setMePw(String mePw) {
		this.mePw = mePw;
	}

	public String getMeName() {
		return meName;
	}

	public void setMeName(String meName) {
		this.meName = meName;
	}

	public LocalDateTime getRedate() {
		return redate;
	}

	
	@Override
	public String toString() {
		return "Member [meNum=" + meNum + ", meId=" + meId + ", mePw=" + mePw + ", meName=" + meName + ", redate="
				+ redate + ", getMeNum()=" + getMeNum() + ", getMeId()=" + getMeId() + ", getMePw()=" + getMePw()
				+ ", getMeName()=" + getMeName() + ", getRedate()=" + getRedate() + "]";
	}
	
	public void showMem() {
		System.out.println("회원번호\t아이디\t비밀번호\t회원이름\t회원가입일");
		System.out.println(getMeNum()+"\t"+getMeId()+"\t"+getMePw()+"\t"+getMeName()+"\t"+getRedate());
	}
	public void showMem(List<Member> memList) {
		System.out.println("회원번호\t아이디\t비밀번호\t회원이름\t회원가입일");
		for(int i = 0; i < memList.size(); i++) {
			int mNum = memList.get(i).getMeNum();
			String mId = memList.get(i).getMeId();
			String mPw = memList.get(i).getMePw();
			String mName = memList.get(i).getMeName();
			LocalDateTime mRe = memList.get(i).getRedate();
			
			System.out.println(mNum+"\t"+mId+"\t"+mPw+"\t"+mName+"\t"+mRe);
		}
	}
	
	

	
}
