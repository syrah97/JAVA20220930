package CH11EXEC;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C01ArrayPrac {

	public static void main(String[] args) {
		// 10크기의 int형 배열을 만들어서
		// 반복문과 함께 해당배열의 0 - 9 까지 요소에 각각 정수값을 입력
		//합, 평균, 최대값, 최소값을 구합시다.
		
		Scanner sc = new Scanner(System.in);
		int[] ar1 = new int[10];
		ar1[0]=sc.nextInt();
		ar1[1]=sc.nextInt();
		ar1[2]=sc.nextInt();
		ar1[3]=sc.nextInt();
		ar1[4]=sc.nextInt();
		ar1[5]=sc.nextInt();
		ar1[6]=sc.nextInt();
		ar1[7]=sc.nextInt();
		ar1[8]=sc.nextInt();
		ar1[9]=sc.nextInt();
				
//		
//		int sum=0;
//		double avg=0.0;
//		int max=ar1[0];
//		int min=ar1[0];
//		
//		for (int i = 0; i < ar1.length; i++) {
//			System.out.print(ar1[i]+" ");
//		}
//		for (int i = 0; i < ar1.length; i++) {			
//			sum+=arr[i];	
//			avg = sum / ar1.length;
//			if(max < ar1[i]) {
//				max=ar1[i];
//			}
//			if(min > ar1[i]) {
//				min=ar1[i];
//			}
//		}
//		System.out.println(sum);
//		System.out.println(avg);
//		System.out.println(max);
//		System.out.println(min);
		
		
		//또다른 방법
		Arrays.sort(ar1);
		
		for(int a : ar1) {
			System.out.print(a +" ");
		}
		System.out.println();
		System.out.println(ar1[0]);
		System.out.println(ar1[9]);
		
		//또다른 방법
//		int max1=Arrays.stream(ar1).max().getAsInt();
//		int min1=Arrays.stream(ar1).min().getAsInt();
//		
//		System.out.println(max1);
//		System.out.println(min1);
		
			
		//풀이
//		Scanner sc = new Scanner(System.in);
//		int arr[] = new int[10];
//		int max,min,sum=0;
//		double avg=0.0;
//		//값입력받기
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		//최대,최소.합
//		max=arr[0];	//기본값
//		min=arr[0];	//기본값
//		for(int num : arr) {
//			if(max<num) {
//				max=num;
//			}
//			if(min>num) {
//				min=num;
//			}
//			sum+=num;
//		}
//		avg=(double)sum/arr.length;
//		
//		System.out.printf("최대:%d\n최소:%d\n합:%d평균:%f\n" ,max,min,sum,avg);

	}

}
