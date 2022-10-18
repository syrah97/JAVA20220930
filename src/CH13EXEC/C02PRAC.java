package CH13EXEC;

//---------------------------------------
//Practice
//---------------------------------------
//shopService 객체를 싱글톤으로 만들어 보세요 
//ShopServiceExample 클래스에서 shopService 의 getInstance() 메소드로 싱글톤을 얻을 수 있도록
//ShopService 클래스를 작성해보세요

//------------------
//ShopService.java
//------------------
//public class ShopService{
//	//싱글톤 구현
//}

//	class ShopService{				
//		private static ShopService instance;		
//		private ShopService() {};
//		
//	public static ShopService getInstance() {
//		if(instance ==null) {
//			instance = new ShopService();
//		}
//		return instance;
//	}
	
	//선생님풀이
class ShopService{
	//싱글톤 구현
	private static ShopService instance;
	private ShopService() {};
	public static ShopService getInstance() {
		if(instance==null)
			instance=new ShopService();
		return instance;
	}

}
public class C02PRAC {
	public static void main(String[] args) {
	
		//------------------
				// ShopServiceExample.java
				//------------------
				//Package Ch15;
				//public class ShopServiceExample{
//					public static void main(String [] args) {
						ShopService obj1 = ShopService.getInstance();
						ShopService obj2 = ShopService.getInstance();
						
						if(obj1==obj2) {
							System.out.println("같은 ShopService 객체입니다.");
						}
						else {
							System.out.println("다른 ShopService 객체 입니다.");
						}
//					}
//				}
		
	}
}
