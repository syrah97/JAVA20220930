package CH32;

public class MemberDTO {
	private int no;
	private String email;
	private String addr;
	private String phone;
	public MemberDTO(int no, String email, String addr, String phone) {
		super();
		this.no = no;
		this.email = email;
		this.addr = addr;
		this.phone = phone;
	}
	MemberDTO(){}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "MemberDTO [no=" + no + ", email=" + email + ", addr=" + addr + ", phone=" + phone + "]";
	}
	
}
