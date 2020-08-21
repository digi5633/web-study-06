package web_study_06.unit01;

public class Member {
	private String name; // 이름
	private String userId; // 아이디
	private String nickName; // 별명
	private String pwd; // 비밀번호
	private String email; // 이메일
	private String phone; // 전화번호

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return String.format("Member [name=%s, userId=%s, nickName=%s, pwd=%s, email=%s, phone=%s]", name, userId,
				nickName, pwd, email, phone);
	}

}