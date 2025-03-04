package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex2 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 1, 2, 3, 3, 4);
		System.out.println(list);

		// list -> stream
		Stream<Integer> stream = list.stream();

		// 최종연산
		stream.forEach(t -> System.out.println(t));

		// 요소의 개수를 반환해주는 함수
		long count = stream.count();

		System.out.println(count);

		// 타입이 맞지 않아서 스트림을 리스트로 바꿔야함
		// 함수 체이닝: 함수의 반환값을 사용하여 다시 함수를 호출하는 형태
		// 대충 .찍어서 코드 길게 적으면 체이닝이라고 생각하면 됨
		// 
		List<Integer> sortedList = list.stream()		// Stream이 반환됨	ㅇㅇ
				.sorted()								// Stream이 또 반환됨ㅇ
				.collect(Collectors.toList());
		
		// 체이닝을 사용하는 이유
		// 코드를 더 간단하게 사용할 때 사용함
//		Stream<Integer> stream2 = list.stream();
//		Stream<Integer> stream3 = stream2.sorted();
//		List<Integer> sortedList2 = stream2.collect(Collectors.toList());
		
		
		System.out.println(list);
		System.out.println(sortedList);
		
		

	}

}
