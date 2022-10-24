package CH20;

import java.util.HashMap;
import java.util.Map;

public class C05Map {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap();
		map.put("aaa", 1111);
		map.put("bbb", 2222);
		map.put("ccc", 3333);
		map.put("ddd", 4444);
		
		System.out.println("저장 수 : " + map.size());
		

	}

}
