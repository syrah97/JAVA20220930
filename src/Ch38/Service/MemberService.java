package Ch38.Service;

import Ch38.Domain.BookDAO;
import Ch38.Domain.BookDTO;
import Ch38.Domain.MemberDAO;
import Ch38.Domain.MemberDTO;

public class MemberService {

	private MemberDAO dao = MemberDAO.getInstance();

	// 싱글톤 패턴 코드 추가
	private static MemberService instance;

	public static MemberService getInstance() {
		if (instance == null)
			instance = new MemberService();
		return instance;
	}

	private MemberService() {
	}

	// 멤버 조회하기
	// 멤버 등록하기
	// (권한 확인 후(내일) 도서 등록하기)
	public boolean RegisterMember(MemberDTO dto) {
		int result = dao.Insert(dto);
		if (result > 0)
			return true;

		return false;
	}
	
	// (ID/PW 인증)
	public Integer LoginCheck(String id,String pwd) {
		MemberDTO dto = null;
		dto = dao.Select(id);
		//ID 일치 PW일치여부 확인
		if(id.equals(dto.getMemId())&&pwd.equals(dto.getPwd()))
		{
			return dto.getRole();
		}
		//role반환(0 or 1 or Null
		return null;
	}

	// 도서 수정하기
	// 도서 삭제하기
	// 기타..

}
