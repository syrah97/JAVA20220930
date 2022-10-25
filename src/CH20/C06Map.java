package CH20;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class C06Map {
	//저장멤버 MAP
	private static Map<String,Integer> map = new HashMap();
	
	public static void Insert(String k, Integer v) {
		if(!map.containsKey(k) && !map.containsValue(v))	//key가 map에 없다면
		{		
			map.put(k,v);			// key,value 저장
		}
		else {
			System.out.println("동일한 key가 존재합니다.");
		}
	}
	
	public static void ShowInfo() {
		Set<String> set = map.keySet();	
		for(String key : set) {
			int value = map.get(key);
			System.out.println("KEY : " + key + " VALUE : " + value);
		}
		
	}
	
	public static void Remove(String key) {
		Integer result = map.remove(key);
		if(result==null) {
			System.out.println("삭제실패..");
		}
		else {
			System.out.println("삭제성공!!");
		}
		
	}
	
	public static void Remove(Integer value) throws Exception {
		// 동일한 value를 가지는 모든 요소를 삭제
		Set<String> set = map.keySet();
		for(String key : set) {
			if(value.equals(map.get(key))) {
				boolean result = map.remove(key, value);
				if(result) {
					System.out.println("삭제 성공!!");
					set = map.keySet();
				}else {
					System.out.println("삭제 실패..");
					
				} //if

			} //if
		}
	}

	public static void main(String[] args) {
		Insert("aaa", 1234);
		Insert("bbb", 1234);
		Insert("ccc", 3333);
		Insert("ddd", 4444);
		Insert("ddd", 1234);	//중복 key가 들어가는 경우
		Insert("fff", 1234);	//중복 value가 들어가는 경우
		
		//개수
		System.out.println("저장 수 : " + map.size());
		
		
		//조회
		ShowInfo();
		
		//삭제
//		Remove("aaa");	//삭제성공
//		Remove("abc");	//삭제실패
		
		//개수
		System.out.println("저장 수 : " + map.size());
		System.out.println("-----------------------");
		try {
			Remove(1234);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} //Value전달 삭제
		
		System.out.println("저장 수 : " + map.size());
		
	}

}
