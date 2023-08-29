package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1_Stream {
	public static void main(String[] args) {
		String[] strArray = {"ȫ�浿","���ڹ�","�ڶ���"};
		Stream<String> strStream = Arrays.stream(strArray);
		//forEach ���� �������⿡�� ����ϴ� �޼���. 
		strStream.forEach(item -> System.out.print(item+" "));
		System.out.println();
		
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(item->System.out.print(item+" "));
		System.out.println();
		
//		��Ʈ���� ����
//		�߰����� : ������ ����� ��Ʈ���̾�� ��. ��Ʈ���� �����ؼ� ������ �� �� �ִ�.
//		�������� : ������ ����� ��Ʈ���� �ƴ� ����. ��Ʈ���� ��Ҹ� �Ҹ��ϹǷ� �� �ѹ��� ����
		
		int[] nums = {1,44,33,21,35,67,99,4,5,6,1,1,1,2,2,3,3,3};
//		distinct : �ߺ�����
		Arrays.stream(nums).distinct().sorted().limit(5).forEach(System.out::print);
		System.out.println();
		
		for(int n:nums) {
			System.out.print(n+" ");
		} //�������� ������ ����
		
		
		
		
		
		
		
	}//main

}
