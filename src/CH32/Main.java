package CH32;

import java.util.List;

import CH32.MemberDTO;

public class Main {

	public static void main(String[] args) {
		
//		MemberDAO dao = new MemberDAO();
		MemberDAO dao = MemberDAO.getInstance();
//		boolean flag = dao.Insert("exam1@exam.com", "대구", "010-111-2222");
//		System.out.println("성공 여부 : " + flag);
		
//		boolean flag = dao.Insert(new MemberDTO(0,"exam2@exam.com","서울","010-222-3333"));
//		System.out.println("성공 여부 : " + flag);
		
//		boolean flag = dao.Update(new MemberDTO(0,"exam1@exam.com","마산","없음"));
//		System.out.println("성공 여부 : " + flag);
		
		List<MemberDTO> list = dao.SearchAll();
		for(MemberDTO dto : list) {
			System.out.println(dto);
		}

	}

}
