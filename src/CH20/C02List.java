package CH20;

import java.util.*;

public class C02List {

	public static void main(String[] args) {
		
//		List<String> list = new Vector();
		List<String> list = new LinkedList();
		
		//추가
		list.add("JAVA");			//0
		list.add("JDBC");			//1
		list.add("OracleDB");		//2
		list.add("JSP");			//3
		list.add("Servlet");		//4
		list.add("SpringFrameWork");//5
		list.add("JAVA");			//6
		
		
		//확인(저장 수)
		System.out.println("총 개체수 : " + list.size());
		
		//조회(요소)
		System.out.println("확인 idx 2 : " + list.get(2));
		System.out.println("---------------------");
		
		//전체 조회
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------------");
		for(String tmp : list)
		{
			System.out.println(tmp);
		}
		
		//삭제
		System.out.println("---------------------");
		list.remove(2);
		for(String tmp : list)
		{
			System.out.println(tmp);
		}
		list.clear();
	
		
	}

}
