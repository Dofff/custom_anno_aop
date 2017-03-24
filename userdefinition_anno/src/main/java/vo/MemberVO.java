package vo;

public class MemberVO {
	private String memId;
	private String password;
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "MemberVO [memId=" + memId + ", password=" + password + "]";
	}
}
