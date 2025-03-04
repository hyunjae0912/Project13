package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex3 {

	public static void main(String[] args) {
		
		// asList : 리스트를 생성하고 초기화하는 함수
		List<Integer> list = Arrays.asList(1,1,2,3,5,4);
		
		// list -> stream 로 변환함
		Stream<Integer> stream = list.stream();
		
		System.out.println(list);
		// distinct : 중복 제거
		// 중간연산자만 딸랑 사용하면 연산만 되고 출력은 안됨 (당연한 이야기지만 대단하듯 설명하네)
		// 중요** Stream 은 재사용할 수 없다.
		stream.distinct().sorted().forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		Stream<Integer> stream2 = list.stream(); // 또는 그냥 list.stream만 사용
		stream2.filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// limit 제일 큰 값부터 n개 추출
		list.stream().limit(3).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// 중복제거
		list.stream().distinct().sorted().forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// reversOrder는 뒤집어서 정렬됨 ㅇㅇ;;
		list.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.print(n + " "));
		
		Stream<Integer> stream3 = list.stream();
		// mapToInt : 스트림 안에 있는 요소를 int타입으로 변환
		IntStream intStream = stream3.mapToInt(n -> n.intValue());
		System.out.println();

		// 정수형 스트림이 가지고 있는 함수 : 
		// sum min max avg : 타입변환함수 (다른타입 -> 숫자)
		
		int sum = intStream.sum();
		System.out.println(sum);
		
		// optionalInt : 값을 담고 있는 클래스
		// 값이 존재하는지 확인하는 함수, 값을 꺼내는 함수를 가지고 있음
		// 값을 안전하게 사용하기 위해서 사용함
		IntStream intStream2 = list.stream().mapToInt(n -> n.intValue());
		OptionalInt optionalInt = intStream2.max();
		System.out.println(optionalInt.getAsInt());
		
		List<String> strList = Arrays.asList("aa", "bb", "cc");
		
		System.out.println();
		
		// 스트림으로 바꿈
		// map : 스트림 안에 있는 값을 다른 값으로 바꾸는 연산자.
		strList.stream().map(t -> t.length()).forEach(n -> System.out.print(n + " "));
		
		List<Book> book = new ArrayList<>();
		book.add(new Book("자바 프로그램", 10000));
		book.add(new Book("스프링", 20000));
		book.add(new Book("호날두 쑤ㅜㅜㅜ 발음방법", 5000));
		System.out.println();
		
		// map 다른 값으로 변환하는 연산자.
		book.stream().map(books -> books.title).forEach(n -> System.out.println(n));
		
	}

}

// 도서 클래스
class Book {
	String title;
	int price;
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}	
}





















