package CH18;



public class C02ArrayldxException {
	public static void main(String[] args) {
		int arr[] = {10,20,30};
		
		try {
			for(int i=0;i<5;i++) 
			{
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
			
			
		
		
		
		
		System.out.println("실행코드1");
		System.out.println("실행코드2");

	}

}
