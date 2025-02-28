package stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex2 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,1,2,3,3,4);
		System.out.println(list);
		
		
		// list -> stream
		Stream <Integer> stream = list.stream();
		
		
		// 최종연산
		stream.forEach(t -> System.out.println(t));
		
		// 요소의 개수를 반환해주는 함수
		long count = stream.count();
		
		
		System.out.println(count);
	}

}
