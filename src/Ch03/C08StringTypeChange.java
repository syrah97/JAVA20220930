package Ch03;

public class C08StringTypeChange {
	public static void main(String[] args) {	
		//-----------------------------------------
		//문자열  + 문자열 연산
		//-----------------------------------------
		/*
		System.out.println("문자열1" + "문자열2");			// 문자열 + 문자열
		System.out.println("문자열1" + ',' + "문자열2");	// 문자열 + 문자 + 문자열
		System.out.println("문자열1" + 2);				//문자열 + 숫자 ->숫자를 문자열로 해석! 단순연결
//		System.out.println("문자열"+','+'!');				//,와!는 아스키 코드로 숫자로 나옴
		//-----------------------------------------
		//문자열 -> 숫자형변환
		//-----------------------------------------
		//문자열 -> 숫자형으로 변환(정수)
		//int n1="10";
		/*
		System.out.println("10"+"20");		//문자열 연결
		
		int n1 = Integer.parseInt("10");	//웹개발코드시 폼으로부터 전달받은 값은 다 문자열임
		int n2 = Integer.parseInt("20");
		System.out.println(n1+n2);
		
		//문자열 -> 숫자형으로 변환(실수)
		double n3 =Double.parseDouble("10.5");
		double n4 =Double.parseDouble("20.4");
		System.out.println(n3+n4);
		
		short n5 = short.parseShort("5")
		short n6 = short.parseShort("6")	
		
		System.out.println(n5+n6)
			
		/*
		//-----------------------------------------
		//숫자형 -> 문자형으로 변환
		//-----------------------------------------
		/*
		int value1 = 10;
		double value2 = 3.14;
		
		System.out.println(value1 + value2);	//연산
		
		String str1 = String.valueOf(value1);
		String str2 = String.valueOf(value2);

		System.out.println(str1 + str2);		//문자열 붙이기
		*/
		
	
		
	}
}
