package Ch38.Tests;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import Ch38.Controller.FrontController;
import Ch38.Domain.BookDTO;
import Ch38.Domain.LendDAO;
import Ch38.Domain.LendDTO;
import Ch38.Domain.MemberDAO;
import Ch38.Domain.MemberDTO;
import Ch38.Service.AuthService;
import Ch38.Service.BookService;
import Ch38.Service.LendService;
import Ch38.Service.MemberService;

public class UnitTest {

	public static void main(String[] args) {

		// DAO Tests

//		BookDAO dao = BookDAO.getInstance();
//		boolean flag =  dao.Insert(new BookDTO(1000,"자바의정석"));
//		if(flag) {
//			System.out.println("INSERT 성공!");
//		}

		// Service Tests

//		BookService service = new BookService();
//		//boolean flag = service.RegisterBook(new BookDTO(2020, "윤성우C언어"), 0); // 권한은 3이상일때만 허용하겠다! 실패..
//		  boolean flag = service.RegisterBook(new BookDTO(2020,"윤성우C언어"), 3); //권한은 3이상일때만 허용하겠다! 성공!
//		if (flag) {
//			System.out.println("Register BOOK 성공!");
//		}else {
//			System.out.println("Register BOOK 실패!");
//		}
		
		
		//MemberDAO Tests
		
//		MemberDAO dao = MemberDAO.getInstance();
//		int result = dao.Insert(new MemberDTO("mem1","1111"));
//		if(result>0) {
//			System.out.println("INSERT 성공!");
//		}else {
//			System.out.println("INSERT 실패..");
//		}
		
//		FrontController controller = new FrontController();
//		//controller.ExSubController("/member", 5);
//		//도서 등록 (메뉴,SN, 책DTO)
//		Object obj = controller.ExSubController("/book", 1, new BookDTO(5050,"SpringFramwork기본서"));
//		if(obj!=null) {
//			System.out.println("[View]" + obj.toString());
//		}else {
//			System.out.println("[View] "+obj.toString());
//		}
		

//		MemberDAO dao = MemberDAO.getInstance();
//		MemberDTO dto = dao.Select("mgr1");
//		System.out.println("DTO : " + dto);

		
//		AuthService service = AuthService.getInstance();
//		Integer result= service.LoginCheck("mgr1", "1111");
//		if(result!=null) {
//			System.out.println("[VIEW] 로그인 성공! ROLE : " + result);
//		}else {
//			System.out.println("[VIEW] 로그인 실패..");
//		}

		
		
//		FrontController controller = new FrontController();
//		
//		//서비스요청 , 요청번호 , DTO
//		Integer result = (Integer)controller.ExSubController("/auth", 1, new MemberDTO("mea","1111"));
//		if(result==null) {
//			System.out.println("[VIEW] 로그인 실패..");
//		}else {
//			System.out.println("[VIEW] 로그인 성공 ROLE : " + result);
//		}
		
		//LendDAO dao = LendDAO.getInstance();
		//dao.Insert(new LendDTO(0,1010,"aaa","2022-11-10","2022-11-17"));
		


		//DataFormat지정 객체
//		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
//		//날짜정보객체
//		Calendar cal = Calendar.getInstance();
//		//현재 날짜정보를 문자열로 저장 start
//		String start = fmt.format(cal.getTime()).toString();		
//		System.out.println("start : " + start);
//		//7일 이후 날짜로 등록 
//		cal.add(Calendar.DATE, 51);
//		String end = fmt.format(cal.getTime()).toString();	
//		System.out.println("end : " + end );
		boolean Loginstate=false;
		String userid=null;
		Integer perm = 0; //0 비회원 , 1 회원 2 관리자(사서)
		//인증 서비스
		AuthService authservice = AuthService.getInstance();
		
		perm = authservice.LoginCheck("mem1", "1111");
		if(perm!=null) {
			Loginstate=true;
			userid="mem1";
		}else {
			perm=0;
		}
		//대여 서비스
		LendService lendservice = LendService.getInstance();
		
		boolean result= lendservice.Lendbook(Loginstate, perm, userid, 2020);
		if(result) {
			System.out.println("[VIEW] 대여성공!");
		}else {
			System.out.println("[VIEW] 대여실패!");
		}
		
		
		
		
		

		
	}

}
