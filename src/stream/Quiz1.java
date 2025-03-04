package stream;

import java.util.OptionalInt;
import java.util.stream.Stream;

public class Quiz1 {

	public static void main(String[] args) {

		String[] arr = { "aaa", "aaa", "b", "b", "ccccc" };
		Stream<String> stream1 = Stream.of(arr);

		// 1번 문제
		stream1.filter(n -> n.length() > 2).forEach(n -> System.out.print(n + " "));

		System.out.println();

		Stream<String> stream2 = Stream.of(arr);

		int totalLength = stream2.mapToInt(n -> n.length()).sum();

		System.out.println("모든 문자열의 길이 합: " + totalLength);

		
		Stream<String> stream3 = Stream.of(arr);
		stream3.map(s -> s.length()).sorted().limit(1)
		.forEach(n -> System.out.println("가장 작은 값 " + n));
		
		
		Stream<String> stream4 = Stream.of(arr);
		stream4.distinct().forEach(n -> System.out.print(n + " "));

	}

}
