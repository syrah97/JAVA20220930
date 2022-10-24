package Ch20EXEC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class C02Prac {

	public static void main(String[] args) {
	
		int num = 0;
		//Map 만들기
		Map<String,String> map = new HashMap();
		Scanner sc = new Scanner(System.in);
		String id=null;
		String pw=null;
		while(true) {
			System.out.println("=======M E N U =======");
			System.out.println("1 ID/PW 등록");
			System.out.println("2 ID/PW 조회");
			System.out.println("3 Password 변경");
			System.out.println("4 ID/PW 삭제");
			System.out.println("5 전체조회");
			System.out.println("6 종료");
			System.out.println("=======M E N U =======");
			System.out.print("번호 : " );
			num = sc.nextInt();
			switch(num)
			{
			case 1:
				//map 에 ID/PW등록
				//단! 기존에 동일 ID가 있으면 등록불가(containsKey사용)
	
				break;
			case 2:
				//ID를 받아서 map에 있는 동일한 Id/pw 를 출력
				
				break;
			case 3:
				//ID를 받아서 map에 있는 동일한 id의 password를 변경 
				
				break;
			case 4:
				//ID를 받아서 map에 있는 동일한 id/pw를 삭제
					
				break;
			case 5:
				//전체조회
				
				break;
			case 6:
				System.exit(-1);
			default:
				System.out.println("다시 입력...");
			}
		
		}
		
		
		
		
		
		
	}

}
