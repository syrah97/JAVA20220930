package CH32;

public class Main {

	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAO();
//		boolean flag = dao.Insert("exam1@exam.com", "대구", "010-111-2222");
//		System.out.println("성공 여부 : " + flag);
		
		boolean flag = dao.Insert(new MemberDTO(0,"exam2@exam.com","서울","010-222-3333"));
		System.out.println("성공 여부 : " + flag);

	}

}
