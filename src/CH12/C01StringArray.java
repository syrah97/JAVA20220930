package CH12;

public class C01StringArray {

	public static void main(String[] args) {
		String [] names = {"홍길동","남길동","서길동"};
		
		System.out.println("names의 길이 : " + names.length);
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		//String 클래스 배열
		String [] names2 = new String[3];
		names2[0] = "이름1";
		names2[1] = "이름2";
		names2[2] = "이름3";
		System.out.println(names2[0]);
		System.out.println(names2[1]);
		System.out.println(names2[2]);
		
		
	}

}
