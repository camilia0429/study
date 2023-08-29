package Ex2_multi_Array;

public class Ex1_Multi_Array {
	public static void main(String[] args) {
//		다차원배열 : 2차원 이상의 배열을 의미하며, 배열의 요소로 배열을 가지는 것을 의미.
//		2차원 배열은 1차원 배열을 요소로 갖고, 3차원 배열은 2차원 배열을 요소로 갖는다.
		
//		자료형[][] 배열명 = new 자료형[1차원 배열의 개수][1차원 배열에 들어갈 요소의 길이];
		
//		int [][]arr = new int[2][3];
//		
//		arr[0][0] = 100;
//		arr[0][1] = 200;
//		arr[0][2] = 300;
//		
//		arr[1][0] = 400;
//		arr[1][1] = 500;
//		arr[1][2] = 600;
//		
////		System.out.println(arr[0][0]);
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++)
//				System.out.println(arr[i][j]);
//		}
//		
//		
////		1차원 배열에 들어갈 요소의 길이가 다른 경우
//		char[][] ch = {{'A','B'},{'C','D','E'},{'F'}};
//		
//		for(int i = 0; i < ch.length; i++) {
//			for(int j = 0; j < ch[i].length; j++)
//				System.out.print(ch[i][j]);
//		}
//		
//		1차원 배열의 요소의 길이를 직접 지정할 수도 있다.
//		int num[][] = new int[2][];
//		num[0] = new int[3];
//		num[1] = new int[2];
//		
//		for(int i = 0; i < num.length; i++) {
//			for(int j = 0; j < num[i].length; j++) {
//				System.out.print((num[i][j]= n+=100)+" ");
//			}
//		}
		
//		2차원 배열 ar에 담긴 모든 값의 총 합과 평균을 구하는 프로그램 작성하기
		int ar[][] = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
		};
		
		int sum = 0;
		double avg = 0;
		int count = 0; //개수를 세어보기 위한 변수
		
		for(int i = 0; i<ar.length; i++) {
			for(int j = 0; j<ar[i].length; j++) {
				sum += ar[i][j];
				count++;		
			}
		}
		
		System.out.println(sum);
		avg=(double)sum/count;
		System.out.println(avg);
		
		
		
	}//main

}
