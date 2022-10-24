package CH20;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class C04Map {

	public static void main(String[] args) throws InterruptedException {
		
		Random rand = new Random();
		Set<Integer> lotto = new HashSet();
		
		//로또 만들기
		//set을 이용하여 6자리 난수를 저장(1~45까지)
		//저장 이후 정렬(오름차순)
		
		while(lotto.size()<7) {
			lotto.add(rand.nextInt(45)+1);
		}
		for(int n : lotto) {
			System.out.println(n+" ");
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//난수만들기 코드
//		while(true) {
//			System.out.println(rand.nextInt(45)+1);
//			Thread.sleep(500);
//		}

	}

}
