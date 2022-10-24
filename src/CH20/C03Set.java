package CH20;

import java.util.*;

public class C03Set {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet();
		
		//추가
		set.add("JAVA");			//0
		set.add("JDBC");			//1
		set.add("OracleDB");		//2
		set.add("JSP");			//3
		set.add("Servlet");		//4
		set.add("SpringFrameWork");//5
		set.add("JAVA");			//6
		
		
		//확인(저장 수)
		System.out.println("총 개체수 : " + set.size());
		
		//조회(간편)
		for(String tmp : set) {
			System.out.println(tmp);
		}
		System.out.println("-------------------");
		
		//조회(복잡)
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String tmp = iter.next();
			System.out.println(tmp);
		}
		
		set.remove("JAVA");
		//확인(저장 수)
		System.out.println("총 개체수 : " + set.size());
		
	
		
	}

}
