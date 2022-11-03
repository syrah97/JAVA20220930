package Ch09EXEC;

import java.util.Scanner;

class Profile
{
	private String name;
	private String addr;
	private String job;
	private String major;
	//1 디폴트 생성자 삽입
	public Profile() {}
		
	//2 모든 인자를 받는 생성자 삽입
	public Profile(String name, String addr, String job, String major) {
	super();
	this.name = name;
	this.addr = addr;
	this.job = job;
	this.major = major;
	}
	
	//3 다음 생성자 안 코드 처리하기
	Profile(String all)		//String all="홍길동,대구,프로그래머,컴퓨터공학"
	{ 
		//->all문자열 앞뒤 공백은 제거(trim())		
		all=all.trim();		//all="홍길동,대구,프로그래머,컴퓨터공학"
		//->, 단위로 잘라내기(split(","))하여 각각의 값을
		String tmp[] = all.split(",");	//tmp[] = ["홍길동,대구,프로그래머,컴퓨터공학"]
		// tmp[0] == "홍길동", tmp[1] == "대구", tmp[2] == "프로그래머", tmp[3] == "컴퓨터공학"
		//name,addr,job,major에 저장할것(안되면 강사와 함께..배열을 사용..)
		name = tmp[0];
		addr = tmp[1];
		job = tmp[2];
		major = tmp[3];	
		
		//or
//		Scanner sc = new Scanner(System.in);
//		all = sc.nextLine();
//		
//		
//		
//		String arr[] = all.split(",");
//		for(int i=0;i<arr.length;i++) {
//			System.out.printf("arr[%d] = %s\n",i,arr[i].trim());
//		}
//		this.name=arr[0];
//		this.addr=arr[1];
//		this.job=arr[2];
//		this.major=arr[3];
		
		
	}
	
//	//4 toString() 재정의 코드 삽입
	@Override
	public String toString() {
		return "Profile [name=" + name.trim() + ", addr=" + addr.trim() + ", job=" + job.trim() + ", major=" + major.trim() + "]";
	}

		
	
//	//5 Getter and Setter 코드 삽입
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	//6 다음 멤버메서드 안 코드 처리
	boolean isContain(String findstr) {
		//findstr 의 문자열이 멤버인 name,addr,job,major 중 하나라도 포함되면 true 리턴
		//아니면 false 리턴
		if(name.contains(findstr)) {
			System.out.println(findstr+"은(는) 이름에 포함되어 있습니다.");
			return true;			
		}else if(addr.contains(findstr)) {
			System.out.println(findstr+"은(는) 주소에 포함되어 있습니다.");
			return true;	
		}else if(job.contains(findstr)) {
			System.out.println(findstr+"은(는) 직업에 포함되어 있습니다.");
			return true;
		}else if(major.contains(findstr)) {
			System.out.println(findstr+"은(는) 전공에 포함되어 있습니다.");
			return true;
		}
		System.out.println(findstr+"은(는) 해당객체에 포함되어 있지 않습니다.");
		return false;
		
	}
	
	//7 다음 멤버메서드 안 코드 처리
	boolean isequals(String all) {
		//all로 받은 문자열을 , 단위로 잘라내어(split(",")) 각각 나눠진 문자열이
		//name,addr,job,major 와 일치 하면 true
		//아니면 false 를 리턴
		all=all.trim();
		String arr[] = all.split(",");	//[홍길동,대구,프로그래머,컴퓨터공학]
		if(!name.equals(arr[0])) {
			return false;
		}else if(!addr.equals(arr[1])) {
			return false;
		}else if(!job.equals(arr[2])) {
			return false;
		}else if(!major.equals(arr[3])) {
			return false;
		}
		return true;
	}

	
}


public class StringClassPrac {

	public static void main(String[] args) {
		Profile hong = new Profile(" , , , ");
		
		//멤버 내용 출력
		System.out.println(hong.toString());
		
		System.out.println("길동 포함 여부 : " + hong.isContain("길동"));
		System.out.println("컴퓨터 포함 여부 : " + hong.isContain("컴퓨터"));
		System.out.println("---------------------------");
		System.out.println("프로필 일치 여부 : "+ hong.isequals(" 홍길동,대구,프로그래머,컴퓨터공학 "));
		System.out.println("프로필 일치 여부 : "+ hong.isequals(" 홍길동,울산,프로그래머,컴퓨터공학 "));
		
		
	}

}
